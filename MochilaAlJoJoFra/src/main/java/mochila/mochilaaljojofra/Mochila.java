package mochila.mochilaaljojofra;

import java.util.ArrayList;
import java.util.List;

public class Mochila implements Cloneable {
    // Atributos
    private int pesoMax;
    private List<Elemento> elementos;
    // Constructor
    public Mochila(int pesoMax, List<Elemento> elementos) {
        this.pesoMax = pesoMax;
        this.elementos = elementos;
    }
    public Mochila(int pesoMax) {
        this.pesoMax = pesoMax;
        this.elementos = new ArrayList<Elemento>();
    }
    public Mochila() {
        this.pesoMax = 0;
        this.elementos = new ArrayList<Elemento>();
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
    public void limpiarMochila(){
        this.elementos = new ArrayList<Elemento>();
    }
    @Override
    protected Mochila clone(){
        Mochila nueva= new Mochila(this.pesoMax,this.elementos);
        return nueva;
    }
}
