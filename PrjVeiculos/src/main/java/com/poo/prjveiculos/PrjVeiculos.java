/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjveiculos;

/**
 *
 * @author julig
 */
public class PrjVeiculos {

    public static void main(String[] args){
        
       Carros cr = new Carros();
       cr.setCor("Azul");
       cr.setChassi("9BW-ZZZ377-VT-004251");
       cr.setMarca("Volkswagen");
       cr.setQuantidadePotas(4);
       cr.setTemArCondisionado(true);
       cr.setTipoCarroceria("Sedan");
       
       Moto  mt = new Moto();
       mt.setCor("Preta");
       mt.setChassi("9BW-MT123-XYZ-00987");
       mt.setMarca("Honda");
       mt.setRenavam("98765432101");
       mt.setDataFabricacao("10/01/2026");
       mt.setTipoGuidao("Esportivo");
       mt.setCilindrada(600);
       
       MostrarDados md = new MostrarDados();
       
       md.mostrar(cr);
       md.mostrar(mt);
       
       
    }
}
