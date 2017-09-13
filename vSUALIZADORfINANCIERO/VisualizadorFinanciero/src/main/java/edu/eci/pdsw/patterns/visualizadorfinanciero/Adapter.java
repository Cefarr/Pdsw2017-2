/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.patterns.visualizadorfinanciero;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author 2098325
 */ public class Adapter implements Iterator{
    public Enumeration dat;
    public Iterator dar;
    public Double num;
    public Adapter(Enumeration data){
        this.dat=data;
    }
    @Override
    public boolean hasNext() {
        return dat.hasMoreElements();
    }
    @Override
    public Object next() {
        num=(double)dat.nextElement();
        return num;
    }
    
}
