/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientação.a.objetos;

/**
 *
 * @author Takeshi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.vidaUtilEmHoras = 9000;
        l1.ligar();
        l1.desligar();
        l1.mostrarEstado();
        l1.mudarEstado();
        
    }
    
}
