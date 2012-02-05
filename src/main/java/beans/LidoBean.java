package beans;

import eu.dca.model.ActorInRole;
import eu.dca.model.AdministrativeMetadata;
import eu.dca.model.AppellationValue;
import eu.dca.model.Date;
import eu.dca.model.DisplayActorInRole;
import eu.dca.model.EarliestDate;
import eu.dca.model.Event;
import eu.dca.model.EventActor;
import eu.dca.model.EventDate;
import eu.dca.model.EventPlace;
import eu.dca.model.EventSet;
import eu.dca.model.EventWrap;
import eu.dca.model.InRoleActor;
import eu.dca.model.LatestDate;
import eu.dca.model.Lido;
import eu.dca.model.LidoAdministrativeMetadata;
import eu.dca.model.LidoDescriptiveMetadata;
import eu.dca.model.LidoRecID;
import eu.dca.model.LinkResource;
import eu.dca.model.NameActorSet;
import eu.dca.model.NamePlaceSet;
import eu.dca.model.ObjectRelationWrap;
import eu.dca.model.ObjectWorkType;
import eu.dca.model.ResourceRepresentation;
import eu.dca.model.ResourceSet;
import eu.dca.model.ResourceWrap;
import eu.dca.model.Subject;
import eu.dca.model.SubjectConcept;
import eu.dca.model.SubjectSet;
import eu.dca.model.SubjectWrap;
import eu.dca.model.Term;
import eu.dca.model.TitleSet;
import eu.dca.model.TitleWrap;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;

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
    
    //Administrative Metadata
    private String reslink;
    private String otitlelbl="";    
    private String otitle="";    
    private String titlelbl="";    
    private String title="";
    private String typelbl="";
    private String type="";    
    
    private List subconceptterms = new ArrayList<String>();    
    private List events = new ArrayList<LidoEvent>();    
    
    
    public LidoBean(){
        log.info("LidoBean() constructor called");
        HttpServletRequest request=(HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
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
        //Load Properties
        loadProperties(baselang);
        //Load XML
        loadXML(id);
        //initlabels
        initLabels();
        //initFields
        initFields();
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
        String filename = id + ".xml";
        try {
            Reader inp = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF8"));
            setLido(Lido.unmarshal(inp));
            inp.close();
            getLog().info("LidoBean.loadXML() loaded successfully");            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//EoM 
    
    
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
                    ResourceWrap rwap = admindata.getResourceWrap();
                    if (rwap != null) {
                        if (rwap.getResourceSetCount() > 0) {
                            ResourceSet rset = rwap.getResourceSet(0);
                            if (rset.getResourceRepresentationCount() > 0) {
                                ResourceRepresentation rrep = rset.getResourceRepresentation(0);
                                LinkResource linkres =  rrep.getLinkResource();
                                this.reslink = linkres.getContent();
                            }//ResourceRepresentationCount()>0
                        }//ResourceSetCount()>0
                    }//ResourceWrap!=null
                }//baselang found
            }//for-master iteration

        }//lido!=null
    }//EoM initFields
    
    
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
    
    
    
    


}//EoC