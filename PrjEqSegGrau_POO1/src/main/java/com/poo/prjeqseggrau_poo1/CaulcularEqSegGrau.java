/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjeqseggrau_poo1;

/**
 *
 * @author julig
 */
public class CaulcularEqSegGrau {
      DadosSaida ds = new DadosSaida();
    
    public DadosSaida delta(DadosEntrada de){
        ds.setDelta(de.getB()* de.getB() - (4*de.getA()*de.getC()));
        return ds;
    }
    public DadosSaida x1L (DadosEntrada de){
        delta(de);
        ds.setX1L((-de.getB()) + Math.sqrt(ds.getDelta()/ 2 *de.getA()));
        return ds;     
    
    }
    
    public DadosSaida x2L (DadosEntrada de){
        delta(de);
        ds.setX2L( (-de.getB()) - (Math.sqrt(ds.getDelta())/ 2 *de.getA()));
        return ds; 
        
    }
    
    
    public DadosSaida xV (DadosEntrada de){

        ds.setxV (-de.getB()/ (2 * de.getA()));
        return ds; 
        
    }
    public DadosSaida yV (DadosEntrada de){

        ds.setyV (-ds.getDelta()/ 4 * de.getA());
        return ds;      
    }
 
 
    
    
 }
 

