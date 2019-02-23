/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicos;

/**
 *
 * @author Camargo
 */
public enum Mencao {
    MB(10), 
    B(8),
    R(5),
    I(0);
    
    public int valorMencao;
    
    Mencao(int valor){
        valorMencao = valor;
    }
    
    public int getValor(){
        return valorMencao;
    }
}
