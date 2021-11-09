package mochila.mochilaaljojofra;

import java.util.ArrayList;
import java.util.List;

public class Mochila {
    // Atributos
    private int pesoMax;
    private List<Elemento> elementos = new ArrayList<Elemento>();
    // Constructor
    public Mochila(int pesoMax, List<Elemento> elementos) {
        this.pesoMax = pesoMax;
        //this.elementos = elementos;
    }
    // Getters y Setters
    public int getPesoMax() {
        return pesoMax;
    }
    
    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }
    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }
    //Funciones extra
    public void anadirElemento(Elemento elemento){
        this.elementos.add(elemento);
    }
    public int getPeso(){
        int peso = 0;
        for (Elemento elemento: this.elementos) {
            peso += elemento.getPeso();
        }
        return peso;
    }
    public int getPesoDisponible(){
        return (this.pesoMax-getPeso());
    }
    public int getValorTotal(){
        int valor = 0;
        for (Elemento elemento: this.elementos) {
            valor+= elemento.getValor();
        }
        return valor;
    }
    public int getNumeroObjetos(){
        int nrElementos = 0;
        for (Elemento elemento: this.elementos) {
            nrElementos++;
        }
        return nrElementos;
    }
}
