/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;

import java.security.cert.Extension;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
class FormatCSV implements Formato {
    
    private Formato next;
    private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());

    public void nextFormat(String tipo) {
        
        if ((tipo).equals("csv")){
            LOG.info("Cargando archivo csv");
    
        }else{ 
        
            next.nextFormat(tipo);
        }
    }
  
    private void processCSV(String fileName) {
        LOG.info("Processing CVS...");
    }

    @Override
    public void setNext(Formato formato) throws DataLoadException {
        next= formato;
    }

    @Override
    public Formato getNext() {
        return next;
    }
    
}
