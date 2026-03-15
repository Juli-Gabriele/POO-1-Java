/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjexemploheranca;

/**
 *
 * @author julig
 */
public class PrjExemploHeranca {

    public static void main(String[] args) {
        
       PessoaFisica pf = new PessoaFisica ();
       pf.setNome("teste PF");
       pf.setRg("012345678");
       pf.setCpf("000.111.222-33");
       
       /*System.out.println("Nome : "+ pf.getNome());
       System.out.println("CPF : "+ pf.getCpf());
       System.out.println("Rg : "+ pf.getRg()); */
        
        
       PessoaJuridica pj =  new PessoaJuridica();
       pj.setNome("Teste Pj");
       pj.setCnpj("012345678912345");
       pj.setInscEstadual("123456789874");
       
       /*System.out.println("Nome : "+ pj.getNome());
       System.out.println("CNPJ : "+ pj.getCnpj());
       System.out.println("Rg : "+ pj.getInscEstadual());*/
       
       
       //Pessoa p1= pf;
      // Pessoa p2 = pj;
       
       MostrarDados md = new MostrarDados();
       
       md.mostrar(pf);
       md.mostrar(pj);
       
      // System.out.println("Nome : "+ p1.getNome());
      //System.out.println("Nome : "+ p2.getNome());
        
    }
}
