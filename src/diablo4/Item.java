/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author augusto.coelho
 */
public class  Item {
    protected String nomeItens;
    protected int pontoAtk;
    protected int pontoDef;
    

    public Item(String nomeItens, int pontoAtk, int pontoDef) {
        this.nomeItens = nomeItens;
        this.pontoAtk = pontoAtk;
        this.pontoDef = pontoDef;
    }
    
       public static void randomItensStats(int j, int k){
        for(int i = 0; i < Jogo.itensProntos.size(); i++){
            int rnd = new Random().nextInt(10);
            int rnd2 = new Random().nextInt(Jogo.itensProntos.size());
            String nomeItens = Jogo.itensProntos.get(rnd2);
            int pontoAtk = rnd;
            int pontoDef = 0;
            Item item3 = new Item(nomeItens,pontoAtk,pontoDef);
            Jogo.fases.get(j).monstros.get(k).itens.add(item3); 
            System.out.println((Jogo.fases.get(0).monstros.get(0).itens.get(0).nomeItens)+" "+(Jogo.fases.get(0).monstros.get(0).itens.get(0).pontoAtk)+" "+(Jogo.fases.get(0).monstros.get(0).itens.get(0).pontoDef));
        }
        
    }       

    
    public String getNomeItens() {
        return nomeItens;
    }

    public void setNomeItens(String nomeItens) {
        this.nomeItens = nomeItens;
    }

    public int getPontoAtk() {
        return pontoAtk;
    }

    public void setPontoAtk(int pontoAtk) {
        this.pontoAtk = pontoAtk;
    }

    public int getPontoDef() {
        return pontoDef;
    }

    public void setPontoDef(int pontoDef) {
        this.pontoDef = pontoDef;
    }
    
    
}
