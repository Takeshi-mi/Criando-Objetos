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
    boolean corrente; //1 = Corrente, 2 = poupança

    public ContaBancaria(double saldo, boolean corrente){
        this.saldo = saldo;
        this.corrente = corrente;
    }
    public ContaBancaria(int numero, double saldo, boolean especial, double limite, boolean corrente) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limite;
        this.corrente = corrente;
    }
    // construtor Padrão
    ContaBancaria() {
        this.corrente = true; // corrente
        this.especial = false;
        
    }
    
    
    
    void saque(double valor){
        if(saldo<valor){
            if(corrente==true){
                System.out.println("Não é possível realizar a operação. Valor de saque maior que o saldo. Usuário Conta Corrente não tem limite especial. ");
            }
            else if(especial){
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
    // Última questão. Exercício 1
    void deposito(double valor){
        if (corrente == true){
            if (valor > 1000){
                System.out.println("Conta Corrente. Para sua segurança não é possível fazer depósitos acima de R$1000,00");
            }else{
                saldo += valor;
            }
        }else{
            saldo += valor;
        }
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
