/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjprimeiraaulapoo1;
import java.util.Scanner;
/**
 *
 * @author julig
 */
public class PrjPrimeiraAulaPOO1 {

    public static void main(String[] args) {
       Calculadora c = new Calculadora();
       Scanner  sr = new Scanner(System.in);
       System.out.println("Digite o primeiro número:");
       float nr1 = sr.nextFloat();
       System.out.println("Digite o segundo número:");
       float nr2 = sr.nextFloat();
       
       float resultadoSoma = c.somar(nr1, nr2);
       System.out.println("Resultado" + resultadoSoma);
       float resultadoSub = c.subtrair(nr1, nr2);
       System.out.println("Resultado" + resultadoSub);
       float resultadoMult = c.multiplicar(nr1, nr2);
       System.out.println("Resultado" + resultadoMult);
       float resultadoDividir = c.dividir(nr1, nr2);
       System.out.println("Resultado" + resultadoDividir);
      
    }
    
    
    
}
