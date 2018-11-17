/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;
import java.util.Random;
/**
 *
 * @author augusto.coelho
 */
public class  Item {
    private int idItem;
    private String nomeItens;
    private int pontoAtk;
    private int pontoDef;

    public Item(String nomeItens, int pontoAtk, int pontoDef) {
        Random r = new Random();
        idItem = r.nextInt(100);
        this.nomeItens = nomeItens;
        this.pontoAtk = pontoAtk;
        this.pontoDef = pontoDef;
        
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
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
