package beans;

import eu.dca.model.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.File;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.richfaces.skin.SkinFactory;
import javax.servlet.*;

@ManagedBean(name = "lidoBean")
@RequestScoped
public class LidoBean {
    //Logger
    private static Logger log = Logger.getLogger(LidoBean.class.getName());

    /**
     * @return the log
     */
    public static Logger getLog() {
        return log;
    }

    /**
     * @param aLog the log to set
     */
    public static void setLog(Logger aLog) {
        log = aLog;
    }
    private ResourceBundle res;
    //Base Object
    private Lido lido;    
    //properties
    private String id="1";
    private String baselang="eng";    
    
    private String currentUrl ="";
    private String xmlstring="";
    
    //Record Data
    private String recordidlbl;    
    private String recordid;    
    private String recsourcelbl;
    private String recsource;
    private String rectypelbl;
    private String rectype;
    private String recpreflbl;
    private String recpref;
    private String recenclbl;
    private String recenc;
    private String reclabellbl;
    private String reclabel;
    
    //Category Data
    private String conceptid="";
    private String conceptidlbl="";
    private String categoryterm="";
    private String categorytermlbl="";
    
    //Repository
    private String repositoryname="";
    private String repositorynamelbl="";
    private String repositoryworkid="";
    private String repositoryworkidlbl="";
    
    //Administrative Metadata
    private String reslink;
    private String reslinklbl=""; 
    private String otitlelbl="";    
    private String otitle="";    
    private String titlelbl="";    
    private String title="";
    private String typelbl="";
    private String type=""; 
    
    private String recWraprecid = "";
    private String recWraprecidlbl = "";
    private String recWraprectype = "";
    private String recWraprectypelbl = "";
    private String recWraprecsource = "";
    private String recWraprecsourcelbl = "";
    private String recWraprecrights = "";
    private String recWraprecrightslbl = "";
    
    private String measurementType="";
    private String measurementUnit="";
    private String measurementValue="";
    private String measurementlbl="";
    
    private String omeasurement = "";
    private String skin = "";
    private String logoImage = "dca_logo_3.png";
       
    private List subconceptterms = new ArrayList<String>();    
    private List events = new ArrayList<LidoEvent>(); 
    private List adminResources = new ArrayList<AdminResource>();
    private List adminRecWraps = new ArrayList<AdminResource>();
    private List languagesList = new ArrayList<String>();
    private TreeSet<String> languagesTree = new TreeSet<String>();
    
    public LidoBean() throws MalformedURLException, IOException{
        log.info("LidoBean() constructor called");
        HttpServletRequest request=(HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        //URL url = new URL("http://localhost/1.xml");
               
        //Get Request ID XML
        if (request.getParameter("id")!=null) {
            id=request.getParameter("id");
            log.info("LidoBean() New id loaded:"+id);
        } else {
            log.info("LidoBean() Existing id:"+id);
        }
        //Get baselang
        if (request.getParameter("baselang")!=null) {
            baselang=request.getParameter("baselang");
            log.info("LidoBean() New baselang loaded:"+baselang);
        } else {
            log.info("LidoBean() Existing baselang:"+baselang );
        }
        
        this.currentUrl = request.getRequestURI();
        this.currentUrl += "?id="+id;        
       
        //Load Properties
        loadProperties(baselang);
        //Load XML
        loadXML(id);
        //Detect available languages
        detectLanguages();
        //initlabels
        initLabels();
        //initFields
        initFields();
        
        changeSkin(id);
        
    }//EoCon
    
    private void loadProperties(String lang){
        getLog().info("LidoBean.loadProperties() called with base-lang:"+lang);
        String filename = "properties.lido"+lang;
        try {
            setRes(ResourceBundle.getBundle(filename));
            getLog().info("LidoBean.loadProperties() Resources loaded successfully");  
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
    }//EoM
    
    private void loadXML(String id) {
        getLog().info("LidoBean.loadXML() called with id:"+id);  
        String canonicalPath = "";
        try {
            canonicalPath = new java.io.File (".").getCanonicalPath();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LidoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        getLog().info("LidoBean.loadXML() canonicalPath: "+canonicalPath);
        String filename = canonicalPath+"/../tempFiles/"+id + ".xml";
        //String filename = "./../resources/images/"+ id + ".xml";;
        try {
            
            HttpServletRequest request=(HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            getLog().info("Skin factory:"+request.getSession().getServletContext().getInitParameter("org.richfaces.skin"));
            Reader inp = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF8"));
            setLido(Lido.unmarshal(inp));
            inp.close();
            getLog().info("LidoBean.loadXML() loaded successfully");    
            
            //store xml file to a string variable: this.xmlstring
            getLog().info("LidoBean.loadXML(): converting xml file to string");
            //this.xmlstring = readFile("C:\\lidoviewer\\"+id + ".xml");
            this.xmlstring = readFile(filename);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }//EoM 
    
    private void loadXMLInputStream(URL url) {
        
        getLog().info("LidoBean.loadXMLInputStream() called with id:"+id);        
        try {
            Reader inp = new BufferedReader(new InputStreamReader(url.openStream(), "UTF8"));
            setLido(Lido.unmarshal(inp));
            inp.close();
            getLog().info("LidoBean.loadXML() loaded successfully");            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void changeSkin(String id){
        
        //set skin
        //SkinBean skinbean = new SkinBean();
            //this.logoImage = id+".jpg";
            getLog().info("Choosing skin...");
            if(id.equalsIgnoreCase("1")){
                getLog().info("skin is set to classic");                
                this.skin = "classic";
            }else if(id.equalsIgnoreCase("2")){
                getLog().info("skin is set to wine");                
                this.skin = "wine";
            }else if(id.equalsIgnoreCase("3")){
                getLog().info("skin is set to blueSky");                
                this.skin = "blueSky";
            }else{
                getLog().info("skin is set to japanCherry");                
                this.skin = "japanCherry";            
            }
    
    }
    
    
    private void initLabels() {
        getLog().info("LidoBean.initLabels() called with baselang:"+baselang);
        //Record
        this.recordidlbl = getRes().getString("recordid");         
        this.recpreflbl = getRes().getString("recpref");
        this.rectypelbl = getRes().getString("rectype");
        this.recsourcelbl = getRes().getString("recsource");
        this.recenclbl = getRes().getString("recenc");
        this.reclabellbl = getRes().getString("reclabel");
        //Administrative Metadata
        this.otitlelbl = getRes().getString("otitle");
        this.titlelbl = getRes().getString("title");
        this.typelbl = getRes().getString("type");
        
        this.repositorynamelbl = getRes().getString("repositorynamelbl");
        this.repositoryworkidlbl = getRes().getString("repositoryworkidlbl");
        
        //Administrative data labels
        this.recWraprecidlbl = getRes().getString("recWraprecidlbl");
        this.recWraprecrightslbl = getRes().getString("recWraprecrightslbl");
        this.recWraprecsourcelbl = getRes().getString("recWraprecsourcelbl");
        this.recWraprectypelbl = getRes().getString("recWraprectypelbl");
        
        this.reslinklbl = getRes().getString("reslinklbl");
        this.measurementlbl = getRes().getString("measurementlbl");
        
        this.conceptidlbl = getRes().getString("conceptidlbl");
        this.categorytermlbl = getRes().getString("categorytermlbl");
        
        this.measurementlbl = getRes().getString("measurementlbl");
        
        
        
        getLog().info("LidoBean.initLabels() loaded successfully");                    
    }//EoM initLabels    
    
    private void initFields() {
        getLog().info("LidoBean.initFields() called");
        if (getLido() != null) {

            //-----------Record Elements
            LidoRecID record = getLido().getLidoRecID(0);
            //recordid
            this.recordid = record.getContent();
            //pref
            this.recpref = record.getPref();
            //type
            this.rectype = record.getType();
            //source
            this.recsource = record.getSource();
            //encoding
            this.recenc = record.getEncodinganalog();
            //label      
            this.reclabel = record.getLabel();
            
            //-------------category Elements
            Category category = getLido().getCategory();
            //concept ID
            this.conceptid = category.getConceptID(0).getContent();
            //term
            this.categoryterm = category.getTerm(0).getContent();

            //-------------Descriptive metadata            
            int descount = getLido().getLidoDescriptiveMetadataCount();
            for (int dc=0;dc<descount;dc++){
                LidoDescriptiveMetadata description = getLido().getLidoDescriptiveMetadata(dc);
                if (description.getLang().trim().equalsIgnoreCase(baselang)) {
                    /* get Title */
                    TitleWrap twrap = description.getObjectIdentificationWrap().getTitleWrap();
                    int tsc = twrap.getTitleSetCount();
                    for (int ts=0;ts<tsc;ts++){
                        TitleSet titleset = twrap.getTitleSet(ts);
                        int avc = titleset.getAppellationValueCount();
                        for (int av=0;av<avc;av++){
                           AppellationValue appelation = titleset.getAppellationValue(av);
                           if (appelation.getLang()==null) this.otitle = appelation.getContent(); else
                           if (appelation.getLang().trim().equalsIgnoreCase(baselang)){
                               this.title = appelation.getContent();
                           }//base-lang found
                        }//for AppellationValues
                    }//for titleSets
                    
                    /*get objectIdentificationWrap.inscriptions*/
                    /*InscriptionsWrap iwrap = description.getObjectIdentificationWrap().getInscriptionsWrap();
                    if(iwrap.getInscriptionsCount()>0){ //cardinality: 0-inf
                        for(int ic=0; ic<iwrap.getInscriptionsCount(); ic++){
                            
                            
                            
                        }
                        
                    }*/
                    
                    /*get repository*/
                    RepositoryWrap repowrap = description.getObjectIdentificationWrap().getRepositoryWrap();
                    //suppose cardinality: 1
                    RepositorySet reposet = repowrap.getRepositorySet(0);
                        RepositoryName reponame = reposet.getRepositoryName();
                        if(reponame != null){
                            AppellationValue appelation = reponame.getLegalBodyName(0).getAppellationValue(0);
                            this.repositoryname = appelation.getContent();
                        }
                        
                        if(reposet.getWorkIDCount()>0){
                            
                            WorkID wid = reposet.getWorkID(0);
                            this.repositoryworkid = wid.getContent();
                        
                        }
                    /* get Measurements*/
                    ObjectMeasurementsWrap oMeasurementSet = description.getObjectIdentificationWrap().getObjectMeasurementsWrap();
                    //suppose cardinality: 1
                    if( oMeasurementSet.getObjectMeasurementsSetCount()>0){
                        ObjectMeasurementsSet MeasurementSet = oMeasurementSet.getObjectMeasurementsSet(0);
                        this.omeasurement = MeasurementSet.getDisplayObjectMeasurements(0).getContent();
                    }
                    
                    /* get Type */
                    int owtc = description.getObjectClassificationWrap().getObjectWorkTypeWrap().getObjectWorkTypeCount();
                    for (int owt=0;owt<owtc;owt++){
                        ObjectWorkType objwt = description.getObjectClassificationWrap().getObjectWorkTypeWrap().getObjectWorkType(owt);
                        int termcount = objwt.getTermCount();
                        for (int termc=0;termc<termcount;termc++){
                            Term term = objwt.getTerm(termc);
                            type+= ( (type==null || type.equalsIgnoreCase(""))? term.getContent() : ","+term.getContent() );
                        }//for
                    }//for   
                    
                    /* Concept terms */
                    ObjectRelationWrap orw = description.getObjectRelationWrap();
                    if (orw!=null){
                        SubjectWrap swrap = orw.getSubjectWrap();
                        if (swrap!=null){
                            int sscount = swrap.getSubjectSetCount();
                            for (int ss=0;ss<sscount;ss++){
                                SubjectSet subset = swrap.getSubjectSet(ss);
                                Subject subject = subset.getSubject();
                                if (subject!=null){
                                    int scc = subject.getSubjectConceptCount();
                                    for (int sc=0;sc<scc;sc++){
                                        SubjectConcept subconcept = subject.getSubjectConcept(sc);
                                        int tc = subconcept.getTermCount();
                                        for (int t=0;t<tc;t++){
                                            Term term = subconcept.getTerm(t);
                                            String str = term.getContent();
                                            if (!subconceptterms.contains(str)) getSubconceptterms().add(str);
                                        }//for
                                    }//for
                                }//not null subject
                            }//for
                        }//not null swrap
                    }//not null ObjectRelationWrap
                    //Sort terms
                    //Collections.sort(subconceptterms);
                    
                    /* Events */
                    EventWrap eventwrap = description.getEventWrap();
                    if (eventwrap!=null){
                        int esc = eventwrap.getEventSetCount();
                        for (int es=0;es<esc;es++){
                            EventSet eventset = eventwrap.getEventSet(es);
                            Event event = eventset.getEvent();
                            //declare new event
                            LidoEvent levent = new LidoEvent();  
                            //1 - EventType
                            int tc = event.getEventType().getTermCount();
                            for (int t=0;t<tc;t++){
                               Term term =  event.getEventType().getTerm(t);
                               levent.eventype += ( (levent.eventype==null || levent.eventype.equalsIgnoreCase(""))? term.getContent() : ","+term.getContent() );
                            }//for
                            //2 - Event Date
                            EventDate eventdate = event.getEventDate();
                            if (eventdate!=null){
                                Date date = eventdate.getDate();
                                if (date!=null){
                                    EarliestDate earliest = date.getEarliestDate();
                                    if (earliest!=null){
                                        levent.date += ( (levent.date==null || levent.date.equalsIgnoreCase(""))? earliest.getContent() : ","+earliest.getContent() );                                        
                                    }
                                    LatestDate latest = date.getLatestDate();
                                    if (latest!=null){
                                        levent.date += ( (levent.date==null || levent.date.equalsIgnoreCase(""))? latest.getContent() : ","+latest.getContent() );                                                        
                                    }
                                }//not null date
                            }//not null EventDate
                            //3 - Event Place
                            int epc = event.getEventPlaceCount();
                            for (int ep=0;ep<epc;ep++){
                                EventPlace eventplace = event.getEventPlace(ep);
                                int npsc = eventplace.getPlace().getNamePlaceSetCount();
                                for (int nps=0;nps<npsc;nps++){
                                    NamePlaceSet nameplaceset = eventplace.getPlace().getNamePlaceSet(nps);
                                    int avc = nameplaceset.getAppellationValueCount();
                                    for(int av=0;av<avc;av++){
                                        AppellationValue appellation = nameplaceset.getAppellationValue(av);
                                         levent.place += ( (levent.place==null || levent.place.equalsIgnoreCase(""))? appellation.getContent() : ","+appellation.getContent() );
                                    }//for
                                }//for
                            }//for
                            //4 - Event Actor
                            int ac = event.getEventActorCount();
                            for (int a=0;a<ac;a++){
                                EventActor eventactor = event.getEventActor(a);
                                if (eventactor!=null){
                                    ActorInRole actorinrole = eventactor.getActorInRole();                                    
                                    InRoleActor inroleactor = actorinrole.getInRoleActor();
                                    if (inroleactor!=null){
                                        int nasc = inroleactor.getNameActorSetCount();
                                        for (int nas=0;nas<nasc;nas++){
                                            NameActorSet namaeactorset = inroleactor.getNameActorSet(nas);
                                            int avc = namaeactorset.getAppellationValueCount();
                                            for(int av=0;av<avc;av++){
                                                AppellationValue appellation = namaeactorset.getAppellationValue(av);
                                                levent.actors += ( (levent.actors==null || levent.actors.equalsIgnoreCase(""))? appellation.getContent() : ","+appellation.getContent() );
                                            }//for
                                        }//for                                        
                                    }//if
                                }//if                                
                            }//for
                            //Add to Gridview
                            this.events.add(levent);                            
                        }//for
                    }//not null eventwrap
                    
                }//baselang found
            }//for-master iteration
            
           //-------------Administrative metadata
            int admincount = getLido().getLidoAdministrativeMetadataCount();
            for (int ac = 0; ac < admincount; ac++) {
                LidoAdministrativeMetadata admindata = getLido().getLidoAdministrativeMetadata(ac);
                if (admindata.getLang().trim().equalsIgnoreCase(baselang)) {
                    /*get recordWrap*/
                    RecordWrap recwrap = admindata.getRecordWrap();
                    if (recwrap != null){
                        if(recwrap.getRecordIDCount()>0){ //assuming record cardinality: 1
                            this.recWraprecid = recwrap.getRecordID(0).getContent();
                            this.recWraprectype = recwrap.getRecordType().getTerm(0).getContent();
                            
                            this.recWraprecsource = recwrap.getRecordSource(0).getLegalBodyID(0).getContent()+"<br />";
                            this.recWraprecsource += recwrap.getRecordSource(0).getLegalBodyName(0).getAppellationValue(0).getContent()+"<br />";
                            this.recWraprecsource += recwrap.getRecordSource(0).getLegalBodyWeblink(0).getContent();
                            
                            this.recWraprecrights = recwrap.getRecordRights(0).getRightsHolder(0).getLegalBodyID(0).getContent()+"<br />";
                            this.recWraprecrights += recwrap.getRecordRights(0).getRightsHolder(0).getLegalBodyName(0).getAppellationValue(0).getContent()+"<br />";
                            this.recWraprecrights += recwrap.getRecordRights(0).getRightsHolder(0).getLegalBodyWeblink(0).getContent()+"<br />";                        }
                    }
                    /*get ResourceWrap*/
                    ResourceWrap rwap = admindata.getResourceWrap();
                    if (rwap != null) {
                        if (rwap.getResourceSetCount() > 0) {
                            log.info("getResourceSetCount called..."+rwap.getResourceSetCount() );
                            for(int rsc = 0; rsc<rwap.getResourceSetCount(); rsc++){                                
                                //ResourceSet rset = rwap.getResourceSet(0);
                                ResourceSet rset = rwap.getResourceSet(rsc);
                                if (rset.getResourceRepresentationCount() > 0) {
                                    log.info("getResourceRepresentationCount() called..."+rset.getResourceRepresentationCount());
                                    int adminresourcescount = rset.getResourceRepresentationCount();
                                    for(int arc = 0; arc<adminresourcescount; arc++){

                                        log.info("Admin resource no.:"+arc);
                                        //get Resource representation set
                                        ResourceRepresentation rrep = rset.getResourceRepresentation(arc);

                                        //create new admin resource 
                                        AdminResource aResource = new AdminResource();
                                        

                                        //get resource link
                                        LinkResource linkres =  rrep.getLinkResource();
                                        if(arc == 0 && rsc == 0){ //assign resLink                                        
                                            this.reslink = linkres.getContent();
                                        }
                                        aResource.resourceLink = linkres.getContent();

                                        //get into ResourceMeasurementsSet
                                        if(rrep.getResourceMeasurementsSetCount()>0){
                                            ResourceMeasurementsSet mset = rrep.getResourceMeasurementsSet(arc);
                                            MeasurementType mtype = mset.getMeasurementType(0);
                                            aResource.measurementType = mtype.getContent();
                                            log.info("mtype:"+aResource.measurementType);

                                            MeasurementUnit mUnit = mset.getMeasurementUnit(0);
                                            aResource.measurementUnit = mUnit.getContent();
                                            log.info("munit:"+aResource.measurementUnit);

                                            MeasurementValue mValue = mset.getMeasurementValue();
                                            aResource.measurementValue = mValue.getContent();
                                            log.info("mvalue:"+aResource.measurementValue);

                                            //add it in the list!                                    
                                            this.adminResources.add(aResource);
                                        }
                                        
                                    }

                                    /*ResourceRepresentation rrep = rset.getResourceRepresentation(0);
                                    LinkResource linkres =  rrep.getLinkResource();
                                    this.reslink = linkres.getContent();

                                    ResourceMeasurementsSet mset = rrep.getResourceMeasurementsSet(0);
                                    MeasurementType mtype = mset.getMeasurementType(0);
                                    this.measurementType = mtype.getContent();
                                    */
                                }//ResourceRepresentationCount()>0                            
                            }                            
                        }//ResourceSetCount()>0
                    }//ResourceWrap!=null
                }//baselang found
            }//for-master iteration
            

        }//lido!=null
    }//EoM initFields
    
    private void detectLanguages() {
        
        getLog().info("LidoBean.detectLanguages() called");
        
        //open xml file and 
        //String langstring = "<lido:descriptiveMetadata xml:lang = \'deuh\'>";
        //this.langstring = xmlstring;
        String langarray[];
        
        Pattern pattern = Pattern.compile("xml:lang(\\s)*=(\\s)*[\"\'].*[\"\']");
        //Pattern pattern = Pattern.compile("deu");
        Matcher matcher = pattern.matcher(this.xmlstring);

        List<String> listMatches = new ArrayList<String>();

        while(matcher.find())
        {
            listMatches.add(matcher.group(0));
        }

        for(String s : listMatches)
        {
            langarray = s.split("[\"\']");
            this.languagesTree.add(langarray[1]);
        }
        
        //parse xml and search for xml:lang attribute
        /*if (getLido() != null) {
            
            int admincount = getLido().getLidoAdministrativeMetadataCount();            
            for (int ac = 0; ac < admincount; ac++) {
                LidoAdministrativeMetadata admindata = getLido().getLidoAdministrativeMetadata(ac);
                if (admindata.getLang().trim()!= null) {
                    this.languagesTree.add(admindata.getLang().trim());
                }
            }
            
            int descount = getLido().getLidoDescriptiveMetadataCount();
            for (int dc = 0; dc < descount; dc++) {
                LidoDescriptiveMetadata descrdata = getLido().getLidoDescriptiveMetadata(dc);
                if (descrdata.getLang().trim()!= null) {
                    this.languagesTree.add(descrdata.getLang().trim());
                } 
            }
            
            this.languagesList.addAll(this.languagesTree);
        }*/
        this.languagesList.addAll(this.languagesTree);
        
        
    }//EoM detectLanguages
    
    private String readFile( String file ) throws IOException {
        
        BufferedReader reader = new BufferedReader( new FileReader (file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }

        return stringBuilder.toString();
}
    
    /**
     * @return the lido
     */
    public Lido getLido() {
        return lido;
    }

    /**
     * @param lido the lido to set
     */
    public void setLido(Lido lido) {
        this.lido = lido;
    }
//----------------------------------------------------

    /**
     * @return the res
     */
    public ResourceBundle getRes() {
        return res;
    }

    /**
     * @param res the res to set
     */
    public void setRes(ResourceBundle res) {
        this.res = res;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the baselang
     */
    public String getBaselang() {
        return baselang;
    }

    /**
     * @param baselang the baselang to set
     */
    public void setBaselang(String baselang) {
        this.baselang = baselang;
    }

    /**
     * @return the titlelbl
     */
    public String getTitlelbl() {
        return titlelbl;
    }

    /**
     * @param titlelbl the titlelbl to set
     */
    public void setTitlelbl(String titlelbl) {
        this.titlelbl = titlelbl;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the recordidlbl
     */
    public String getRecordidlbl() {
        return recordidlbl;
    }

    /**
     * @param recordidlbl the recordidlbl to set
     */
    public void setRecordidlbl(String recordidlbl) {
        this.recordidlbl = recordidlbl;
    }

    /**
     * @return the recordid
     */
    public String getRecordid() {
        return recordid;
    }

    /**
     * @param recordid the recordid to set
     */
    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    /**
     * @return the recsourcelbl
     */
    public String getRecsourcelbl() {
        return recsourcelbl;
    }

    /**
     * @param recsourcelbl the recsourcelbl to set
     */
    public void setRecsourcelbl(String recsourcelbl) {
        this.recsourcelbl = recsourcelbl;
    }

    /**
     * @return the recsource
     */
    public String getRecsource() {
        return recsource;
    }

    /**
     * @param recsource the recsource to set
     */
    public void setRecsource(String recsource) {
        this.recsource = recsource;
    }

    /**
     * @return the rectypelbl
     */
    public String getRectypelbl() {
        return rectypelbl;
    }

    /**
     * @param rectypelbl the rectypelbl to set
     */
    public void setRectypelbl(String rectypelbl) {
        this.rectypelbl = rectypelbl;
    }

    /**
     * @return the rectype
     */
    public String getRectype() {
        return rectype;
    }

    /**
     * @param rectype the rectype to set
     */
    public void setRectype(String rectype) {
        this.rectype = rectype;
    }

    /**
     * @return the recpreflbl
     */
    public String getRecpreflbl() {
        return recpreflbl;
    }

    /**
     * @param recpreflbl the recpreflbl to set
     */
    public void setRecpreflbl(String recpreflbl) {
        this.recpreflbl = recpreflbl;
    }

    /**
     * @return the recpref
     */
    public String getRecpref() {
        return recpref;
    }

    /**
     * @param recpref the recpref to set
     */
    public void setRecpref(String recpref) {
        this.recpref = recpref;
    }

    /**
     * @return the recenclbl
     */
    public String getRecenclbl() {
        return recenclbl;
    }

    /**
     * @param recenclbl the recenclbl to set
     */
    public void setRecenclbl(String recenclbl) {
        this.recenclbl = recenclbl;
    }

    /**
     * @return the recenc
     */
    public String getRecenc() {
        return recenc;
    }

    /**
     * @param recenc the recenc to set
     */
    public void setRecenc(String recenc) {
        this.recenc = recenc;
    }

    /**
     * @return the reclabellbl
     */
    public String getReclabellbl() {
        return reclabellbl;
    }

    /**
     * @param reclabellbl the reclabellbl to set
     */
    public void setReclabellbl(String reclabellbl) {
        this.reclabellbl = reclabellbl;
    }

    /**
     * @return the reclabel
     */
    public String getReclabel() {
        return reclabel;
    }

    /**
     * @param reclabel the reclabel to set
     */
    public void setReclabel(String reclabel) {
        this.reclabel = reclabel;
    }

    /**
     * @return the reslink
     */
    public String getReslink() {
        return reslink;
    }

    /**
     * @param reslink the reslink to set
     */
    public void setReslink(String reslink) {
        this.reslink = reslink;
    }

    public String getReslinklbl() {
        return reslinklbl;
    }

    public void setReslinklbl(String reslinklbl) {
        this.reslinklbl = reslinklbl;
    }
    
    

    /**
     * @return the otitlelbl
     */
    public String getOtitlelbl() {
        return otitlelbl;
    }

    /**
     * @param otitlelbl the otitlelbl to set
     */
    public void setOtitlelbl(String otitlelbl) {
        this.otitlelbl = otitlelbl;
    }

    /**
     * @return the otitle
     */
    public String getOtitle() {
        return otitle;
    }

    /**
     * @param otitle the otitle to set
     */
    public void setOtitle(String otitle) {
        this.otitle = otitle;
    }

    /**
     * @return the typelbl
     */
    public String getTypelbl() {
        return typelbl;
    }

    /**
     * @param typelbl the typelbl to set
     */
    public void setTypelbl(String typelbl) {
        this.typelbl = typelbl;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the subconceptterms
     */
    public List getSubconceptterms() {
        return subconceptterms;
    }

    /**
     * @param subconceptterms the subconceptterms to set
     */
    public void setSubconceptterms(List subconceptterms) {
        this.subconceptterms = subconceptterms;
    }

    /**
     * @return the events
     */
    public List getEvents() {
        return events;
    }

    /**
     * @param events the events to set
     */
    public void setEvents(List events) {
        this.events = events;
    }

    public String getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(String measurementType) {
        this.measurementType = measurementType;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public String getMeasurementValue() {
        return measurementValue;
    }

    public void setMeasurementValue(String measurementValue) {
        this.measurementValue = measurementValue;
    }

    public String getMeasurementlbl() {
        return measurementlbl;
    }

    public void setMeasurementlbl(String measurementlbl) {
        this.measurementlbl = measurementlbl;
    }

    public List getAdminResources() {
        return adminResources;
    }

    public void setAdminResources(List adminResources) {
        this.adminResources = adminResources;
    }

    public String getCategoryterm() {
        return categoryterm;
    }

    public void setCategoryterm(String categoryterm) {
        this.categoryterm = categoryterm;
    }

    public String getConceptid() {
        return conceptid;
    }

    public void setConceptid(String conceptid) {
        this.conceptid = conceptid;
    }

    public String getCategorytermlbl() {
        return categorytermlbl;
    }

    public void setCategorytermlbl(String categorytermlbl) {
        this.categorytermlbl = categorytermlbl;
    }

    public String getConceptidlbl() {
        return conceptidlbl;
    }

    public void setConceptidlbl(String conceptidlbl) {
        this.conceptidlbl = conceptidlbl;
    }

    public String getRepositoryname() {
        return repositoryname;
    }

    public void setRepositoryname(String repositoryname) {
        this.repositoryname = repositoryname;
    }

    public String getRepositoryworkid() {
        return repositoryworkid;
    }

    public void setRepositoryworkid(String repositoryworkid) {
        this.repositoryworkid = repositoryworkid;
    }

    public String getRepositorynamelbl() {
        return repositorynamelbl;
    }

    public void setRepositorynamelbl(String repositorynamelbl) {
        this.repositorynamelbl = repositorynamelbl;
    }

    public String getRepositoryworkidlbl() {
        return repositoryworkidlbl;
    }

    public void setRepositoryworkidlbl(String repositoryworkidlbl) {
        this.repositoryworkidlbl = repositoryworkidlbl;
    }

    public String getOmeasurement() {
        return omeasurement;
    }

    public void setOmeasurement(String omeasurement) {
        this.omeasurement = omeasurement;
    }

    public List getAdminRecWraps() {
        return adminRecWraps;
    }

    public void setAdminRecWraps(List adminRecWraps) {
        this.adminRecWraps = adminRecWraps;
    }

    public String getRecWraprecid() {
        return recWraprecid;
    }

    public void setRecWraprecid(String recWraprecid) {
        this.recWraprecid = recWraprecid;
    }

    public String getRecWraprecidlbl() {
        return recWraprecidlbl;
    }

    public void setRecWraprecidlbl(String recWraprecidlbl) {
        this.recWraprecidlbl = recWraprecidlbl;
    }

    public String getRecWraprecrights() {
        return recWraprecrights;
    }

    public void setRecWraprecrights(String recWraprecrights) {
        this.recWraprecrights = recWraprecrights;
    }

    public String getRecWraprecrightslbl() {
        return recWraprecrightslbl;
    }

    public void setRecWraprecrightslbl(String recWraprecrightslbl) {
        this.recWraprecrightslbl = recWraprecrightslbl;
    }

    public String getRecWraprecsource() {
        return recWraprecsource;
    }

    public void setRecWraprecsource(String recWraprecsource) {
        this.recWraprecsource = recWraprecsource;
    }

    public String getRecWraprecsourcelbl() {
        return recWraprecsourcelbl;
    }

    public void setRecWraprecsourcelbl(String recWraprecsourcelbl) {
        this.recWraprecsourcelbl = recWraprecsourcelbl;
    }

    public String getRecWraprectype() {
        return recWraprectype;
    }

    public void setRecWraprectype(String recWraprectype) {
        this.recWraprectype = recWraprectype;
    }

    public String getRecWraprectypelbl() {
        return recWraprectypelbl;
    }

    public void setRecWraprectypelbl(String recWraprectypelbl) {
        this.recWraprectypelbl = recWraprectypelbl;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }

    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public List getLanguagesList() {
        return languagesList;
    }

    public void setLanguagesList(List languagesList) {
        this.languagesList = languagesList;
    }

    public TreeSet<String> getLanguagesTree() {
        return languagesTree;
    }

    public void setLanguagesTree(TreeSet<String> languagesTree) {
        this.languagesTree = languagesTree;
    }

    public String getXmlstring() {
        return xmlstring;
    }

    public void setXmlstring(String xmlstring) {
        this.xmlstring = xmlstring;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(String logoImage) {
        this.logoImage = logoImage;
    }

   
    
    
    
    
    


}//EoC