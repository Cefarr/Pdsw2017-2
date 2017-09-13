/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Logger;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author hcadavid
 */


public class DataProcessor{

    public void loadAndProcessData(String fileName) throws DataLoadException{
        
        LOG.info("Loading data...");
        Tipos TiposFormatos=new Tipos();
        //TiposFormatos.nextFormat(fileName);
        //System.out.println(TiposFormatos.nextFormat(fileName));
        Tipos tipo=new Tipos();
        tipo.nextFormat(extension(fileName));
        
        /*
            DATA PROCESSING CORE
        */
        LOG.info("Processing data...");
        LOG.info("Done. Execution finished.");
    }
    
    public String extension(String fileName){
        return FilenameUtils.getExtension(fileName);
    }
    
    private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());


}


