package test;

import eu.dca.model.Lido;
import eu.dca.model.LidoWrap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;



/**
 *
 * @author pgouvas
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.parseXML();
            
    }//EoM main
    
    private void parseXML(){
        
            
            Lido lido = new Lido();
            LidoWrap lidowrap = new LidoWrap();
            
            String filename = "2.xml";
            try {
            Reader inp = new BufferedReader(new InputStreamReader( new FileInputStream(filename), "UTF8"));
            lidowrap = LidoWrap.unmarshal(inp);
            //System.out.println( lido.getCategory().getConceptIDCount() );
            inp.close();
                                           
            } catch (Exception ex) {
                ex.printStackTrace();
            }        
        
    }//EoM parseXML
    
}//EoC
