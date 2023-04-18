/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

import Banco.ContaBancaria;
import java.awt.datatransfer.FlavorListener;

/**
 *
 * @author Takeshi
 */
public class TesteContaBancaria {
    public static void main(String [] args){
        
    
    ContaBancaria c1 = new ContaBancaria();
    c1.especial = true;
    c1.limiteEspecial = 100;
    c1.deposito(200);
    c1.saque(250);
    c1.consultarSaldo();
    
    ContaBancaria c2 = new ContaBancaria(1,100,false,50);
    c2.saque(110);
    
    
            }
}
