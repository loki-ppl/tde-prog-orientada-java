/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author lucas
 */
public abstract class Monstro {
    
    protected String nome;
    protected String descricao;
    protected int saude;
    protected int forca;
    protected ArrayList<Item> itens = new ArrayList<Item>();

    public int getSaude() {
        return saude;
    }

    public int getForca() {
        return forca;
    }
    abstract void dropaItem();
    
    abstract void contraGolpe(Heroi heroi2, int i, int nf);

    
    
    
}
