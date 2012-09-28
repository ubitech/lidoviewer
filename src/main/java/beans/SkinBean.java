/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.apache.log4j.Logger;

/**
 *
 * @author Danae
 */
@ManagedBean(name = "skinBean")
@RequestScoped
public class SkinBean {

    /**
     * Creates a new instance of SkinBean
     */
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
   
   public String skin;
 
   public String getSkin() {
	return skin;
   }
   public void setSkin(String skin) {
       
       log.info("Previous skin:"+this.skin);
      
       log.info("SkinBean/setSkin:"+skin);
       this.skin = skin;
       log.info("New skin:"+this.skin);
   }
   
    
}
