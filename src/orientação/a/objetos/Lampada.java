/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientação.a.objetos;

/**
 *
 * @author Takeshi
 */
public class Lampada {
    String marca;
    String modelo;
    String cor;
    int vidaUtilEmHoras;
    String tipo;
    double consumo;
    boolean estado;
    
    void ligar(){
        estado = true;
    }
    void desligar(){
        estado = false;
    }
    void mostrarEstado(){
        if(estado==true) {
            System.out.println("Ligado");
        }
        else{
            System.out.println("Desligado");
        }
    }
    
    void mudarEstado(){
        if(estado==true){
            estado = false;
        }else{
            estado = true;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVidaUtilEmHoras() {
        return vidaUtilEmHoras;
    }

    public void setVidaUtilEmHoras(int vidaUtilEmHoras) {
        this.vidaUtilEmHoras = vidaUtilEmHoras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public boolean isLigado(){
        return estado;
    }
}
