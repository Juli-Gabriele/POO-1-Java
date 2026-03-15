/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjveiculos;

/**
 *
 * @author julig
 */
public class MostrarDados {
    
    public void mostrar(Veiculos vc){
        
        System.out.println("Cor :" + vc.getCor());
        System.out.println("Chassi :" + vc.getChassi());
        System.out.println("Marca :" + vc.getMarca());
        System.out.println("Renavam: " + vc.getRenavam());
        System.out.println("DataFabricacao:" + vc.getDataFabricacao());
}
    public void mostrar(Carros cr){
        System.out.println("----VEICULO  CARRO---------");
        Veiculos vc = cr;
         mostrar(vc);
         System.out.println("QuantidadePotas:" + cr.getQuantidadePotas());
         System.out.println("temArCondisionado:" + cr.getTemArCondisionado());
         System.out.println("Tipo Carroceria" + cr.getTipoCarroceria());
        
    }

    public void mostrar(Moto mt){
       System.out.println("----VEICULO  MOTO ---------");
        Veiculos vc= mt;
        mostrar(vc);
        System.out.println("Tipo De Guidao:" + mt.getTipoGuidao());
        System.out.println("Cilindradas :" + mt.getCilindrada());
        System.out.println("-----------------------------------------");
        
        
    }
}
