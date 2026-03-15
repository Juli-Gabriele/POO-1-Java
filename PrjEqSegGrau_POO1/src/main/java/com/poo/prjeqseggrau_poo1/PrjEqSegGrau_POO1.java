/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poo.prjeqseggrau_poo1;
import java.util.Scanner;
/**
 *
 * @author julig
 */
public class PrjEqSegGrau_POO1 {

    public static void main(String[] args) {
        
         int x,y;
         int opcao;
     
        DadosEntrada  de = new DadosEntrada();
        CalculadoraSimples c = new CalculadoraSimples();
            
        Scanner sc = new Scanner(System.in); 
        
        
        do  {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Soma Simples");
            System.out.println("2. Subtracao Simples");
            System.out.println("3. Multiplicacao");
            System.out.println("4. Divisao");
            System.out.println("5. Cauculo de Equacao do segundo Grau");
            System.out.println("6. Sair:");
            System.out.print("Escolha uma opcao: ");
        
            opcao = sc.nextInt();

             switch(opcao){
                 
             
                case 1:
                System.out.print("Digite 1 valor :");
                x = sc.nextInt();
                System.out.print("Digite 2 valor :");
                y = sc.nextInt();   
                System.out.println("Resultado : "  + c.somar(x,y));
             
             break;
             
             case 2:
                System.out.print("Digite 1 valor :");
                x = sc.nextInt();
                System.out.print("Digite 2 valor :");
                y = sc.nextInt();
                System.out.println("Resultado : "  + c.subtrair(x,y));
             break;
             
              case 3:
              System.out.print("Digite 1 valor :");
                x = sc.nextInt();
              System.out.print("Digite 1 valor :");
                y = sc.nextInt();
              System.out.println("Resultado : "  + c.multiplicar(x,y));
             
             break;
             
              case 4:
             System.out.print("Digite 1 valor :");
                x = sc.nextInt();
             System.out.print("Digite 1 valor :");
                y = sc.nextInt();
             System.out.println("Resultado : "  +  c.dividir(x,y));
              
             break;
        
        
             case 5 :
                 
                sc.nextLine(); 
                System.out.println("DADOS DE ENTRADA");
                System.out.println("Informe o valor para A :");
                de.setA(Double.parseDouble (sc.nextLine()));
                System.out.println("Informe o valor para A :");
                de.setB(Double.parseDouble (sc.nextLine()));
                System.out.println("Informe o valor para A :");
                de.setC(Double.parseDouble (sc.nextLine()));


                CalcularEqSegGrau2 esg2 = new CalcularEqSegGrau2();
                DadosSaida ds = new DadosSaida();
                
                esg2.delta (de,ds);
                esg2.x1L(de,ds);
                esg2.x2L(de,ds);
                esg2.xV(de,ds);
                esg2.yV(de, ds);

                System.out.println("Delta: " +  ds.getDelta());
                System.out.println("X ': "  +  ds.getX1L());
                System.out.println("x'': "  +  ds.getX2L());
                System.out.println("XV : "  +  ds.getxV());
                System.out.println("YV : "  +  ds.getyV());

                break;
                
                
                case 6:
                  System.out.println("Saindo...");
                  break;
                    
                default:
                    System.out.println("Opção inválida!");

             }

        } while(opcao != 6);
            
           sc.close();
          
    
        }
        }

