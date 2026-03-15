/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.prjveiculos;

/**
 *
 * @author julig
 */
public class Carros extends Veiculos{
    
    private int quantidadePotas;
    private boolean temArCondisionado;

    public int getQuantidadePotas() {
        return quantidadePotas;
    }

    public void setQuantidadePotas(int quantidadePotas) {
        this.quantidadePotas = quantidadePotas;
    }

    public boolean getTemArCondisionado() {
        return temArCondisionado;
    }

    public void setTemArCondisionado(boolean temArCondisionado) {
        this.temArCondisionado = temArCondisionado;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }
    private String tipoCarroceria;
    
    
    
    
    
    
}
