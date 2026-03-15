/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjexemplosobrecarga;

/**
 *
 * @author julig
 */
public class Calculadora {
    
    public Calculadora(){
         
        int valor =  5+ 4;
        System.out.println("Valor :"+ valor);
    
    }
    
    public  Calculadora(int nr1, int nr2){
        
        int valor = nr1+ nr2;
        System.out.println("Valor :"+ valor);
    }
    
    public void somar(int nr1, int nr2){
        int valor = nr1+ nr2;
        System.out.println("Valor :"+ valor);
        
    } 
    
    
    public void somar(int nr1,int nr2,int nr3){
       int valor = nr1+ nr2+ nr3; 
        
        System.out.println("Valor :"+ valor);
    }
    
    public void somar(int nr1, float nr2){
        int valor = nr1+(int) nr2;
        System.out.println("Valor :"+ valor);
        
    } 
    public void somar(float nr1, int nr2){
        int valor = (int) nr1+ nr2;
        System.out.println("Valor :"+ valor);
        
    } 
    
    
}
