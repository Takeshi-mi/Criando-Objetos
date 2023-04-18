/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author Takeshi
 */
public class ContaBancaria {
    int numero;
    double saldo;
    boolean especial;
    double limiteEspecial;

    public ContaBancaria(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limite;
    }

    ContaBancaria() {
    }
    
    
    
    void saque(double valor){
        if(saldo<valor){
            if(especial){
                if((saldo+limiteEspecial)<valor){
                System.out.printf("Saldo insuficiente. Transação não realizada.\n");
                
                 }else{
                   System.out.printf("Saque de %.2f realizado com sucesso \n",valor);
                   saldo -= valor;
                   if(saldo<0){
                       limiteEspecial = limiteEspecial + saldo;
                       System.out.println("Você usou limite especial");
                   }
                 }
            
            }else{
                System.out.printf("Saldo insuficiente. Transação não realizada.");
            }
        }
        else{
            saldo -= valor;
            System.out.printf("Saque de %.2f realizado com sucesso.\n",valor);
        }
    }
    
    void deposito(double valor){
        saldo += valor;
    }
    void consultarSaldo(){
        System.out.println("Seu saldo atual é de R$"+saldo);
        if(especial){
            System.out.printf("Seu limite Especial atual é de R$%.2f\n",limiteEspecial);
        }
    }
    boolean isEspecial(){
        return especial;
    }
    void mudarStatus(){
        if(especial){
            especial = false;
        }else{
            especial = true;
        }
    }
    
    
}
