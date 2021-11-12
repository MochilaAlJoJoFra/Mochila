/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila.mochilaaljojofra;

/**
 *
 * @author alumno
 */
public class Elemento implements Cloneable {
    
   private String Nombre;
   private int Valor;
   private int Peso;
   
   public Elemento (String Nombre, int Valor, int Peso){
       this.Nombre= Nombre;
       this.Valor=Valor;
       this.Peso=Peso;
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getValor() {
        return Valor;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }
    @Override
    protected Elemento clone(){
        Elemento nueva= new Elemento(this.Nombre,this.Valor,this.Peso);
        return nueva;
    }
}
