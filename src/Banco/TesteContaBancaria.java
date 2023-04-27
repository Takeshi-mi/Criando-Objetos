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
        System.out.println(" ------ Conta C1 - limite especial-----");
    c1.corrente = false;
    c1.especial = true;
    c1.limiteEspecial = 100;
    c1.deposito(200);
    c1.saque(230);
    c1.consultarSaldo();
    
    //Usando construtor. Testando Conta corrente do exercício do slide 26
    System.out.println("\n------ Conta C2  Conta Corrente do exercício 26-----");
    ContaBancaria c2 = new ContaBancaria(666,500, false, 0,true);
    c2.deposito(1300);
    c2.consultarSaldo();
    c2.saque(30);
    c2.consultarSaldo();
    c2.saque(600);
    
    }
}
