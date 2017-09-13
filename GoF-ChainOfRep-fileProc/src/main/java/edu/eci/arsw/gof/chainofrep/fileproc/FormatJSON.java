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
public class FormatJSON implements Formato {

    private Formato next;
    private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());
    

    @Override
    public void setNext(Formato formato) throws DataLoadException {
        next=formato;
    }

    @Override
    public Formato getNext() {
        return next;
    }

    @Override
    public void nextFormat(String tipo) {
               
        if(tipo.equals("json")){
            LOG.info("Cargando archivo json");
        }else{
            next.nextFormat(tipo);
        }
    }
    
    private void processJSON(String fileName) {
        LOG.info("Processing JSON file...");
    }
}
