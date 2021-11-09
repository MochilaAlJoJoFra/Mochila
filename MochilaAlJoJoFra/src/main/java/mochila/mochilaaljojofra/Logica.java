/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila.mochilaaljojofra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Logica {
    public Logica(){
        
    }
    
    private List<Mochila> Arraymochila = new ArrayList<Mochila>();
    
            
    public void Recursiva(List<Elemento> elemento,int contador, Mochila mochila){
        Mochila mochilab =new Mochila();
        for(int i=contador;i<elemento.size();i++){  
            mochilab = mochila;
            if(elemento.get(i).getPeso()>mochilab.getPesoDisponible()){
                this.Arraymochila.add(mochilab);
                return;
            }else{
                mochilab.anadirElemento(elemento.get(i));
                Recursiva(elemento,(i+1),mochilab);
            }
        }
    }
    public Mochila Comparador(){
        int valor = this.Arraymochila.get(0).getValorTotal();
        Mochila mochilag = new Mochila();
        for (int i = 0; i < this.Arraymochila.size(); i++) {
            this.Arraymochila.get(i).getValorTotal();
            if(this.Arraymochila.get(i).getValorTotal() > valor){
                mochilag = this.Arraymochila.get(i);
                valor = this.Arraymochila.get(i).getValorTotal();
            }
            
        }
        return mochilag;
    }
}
