/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;

import static com.oracle.webservices.internal.api.EnvelopeStyle.Style.XML;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author estudiante
 */
public interface Formato {
    
    public void setNext(Formato formato) throws DataLoadException;
    public Formato getNext();
    public void nextFormat(String tipo);
    
    
    /**
    protected String nextFormat;
    public abstract String nextFormat(String tipo)throws DataLoadException;
    
    public String extension(String fileName){
        return FilenameUtils.getExtension(fileName);
    }
    */
}
