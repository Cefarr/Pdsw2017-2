 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class FormatTXT implements Formato {
    private  Formato next;
    private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());



    @Override
    public Formato getNext() {
        return next;
    }
    
    @Override
    public void nextFormat(String tipo) {
        if(tipo.equals("txt")){
            LOG.info("Processing TXT...");
        
        }else{
            LOG.info("NO hay mas formatos disponibles");
            
        }
    }


    @Override
    public void setNext(Formato formato) throws DataLoadException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void processTXT(String fileName) {
        LOG.info("Processing TXT...");
    }
    
}
