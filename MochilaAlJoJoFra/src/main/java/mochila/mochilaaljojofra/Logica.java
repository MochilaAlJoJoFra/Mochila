/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mochila.mochilaaljojofra;

import java.util.ArrayList;
import java.util.List;
//https://www.discoduroderoer.es/el-problema-de-la-mochila-en-java-con-backtracking/
/**
 *
 * @author alumno
 */
public class Logica {
    public Logica(){
        
    }
    
    private List<Mochila> Arraymochila = new ArrayList<Mochila>();
            
            
    public void Recursiva(List<Elemento> elementos,int contador, Mochila mochila){
        Mochila mochilab = new Mochila(mochila.getPesoMax());
        for(int i = contador; i < elementos.size() ; i++){
            if(elementos.get(i).getPeso() > mochilab.getPesoDisponible()){
                this.Arraymochila.add(mochilab.clone());
            }else{
                mochilab.anadirElemento(elementos.get(i).clone());
                Recursiva(elementos,(i+1),mochilab.clone());
                mochila.limpiarMochila();
            }
        }
        
    }
    public Mochila Comparador(){
        int valor = this.Arraymochila.get(0).getValorTotal();
        Mochila mochilag = new Mochila();
        for (int i = 0; i < this.Arraymochila.size(); i++) {
            if(this.Arraymochila.get(i).getValorTotal() > valor){
                mochilag = this.Arraymochila.get(i);
                valor = this.Arraymochila.get(i).getValorTotal();
            }
        }
        return mochilag;
    }
}
