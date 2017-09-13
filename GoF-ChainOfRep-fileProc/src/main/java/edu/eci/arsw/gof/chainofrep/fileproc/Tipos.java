/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.gof.chainofrep.fileproc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author estudiante
 */
public class Tipos implements Formato{

    private Formato next;
    private static final Logger LOG = Logger.getLogger(DataProcessor.class.getName());

    @Override
    public void setNext(Formato formato) throws DataLoadException {
        next=formato;
    }

    @Override
    public Formato getNext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nextFormat(String tipo) {
        FormatCSV focsv= new FormatCSV();
        try {
            this.setNext(focsv);
        } catch (DataLoadException ex) {
            Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
        }
        FormatJSON fjson= new FormatJSON();
        try {
            focsv.setNext(fjson);
        } catch (DataLoadException ex) {
            Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
        }
        FormatXML jxml=new FormatXML();
        try {
            fjson.setNext(jxml);
        } catch (DataLoadException ex) {
            Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        FormatTXT jtxt=new FormatTXT();
        try {
            jxml.setNext(jtxt);
        } catch (DataLoadException ex) {
            Logger.getLogger(Tipos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        next.nextFormat(tipo);
        
        
    }
    
}
