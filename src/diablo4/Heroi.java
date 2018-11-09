/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.ArrayList;

/**
 *
 * @author augusto.coelho
 */
public abstract class Heroi {
    protected String nome;
    protected int idade;
    protected int saude;
    protected int level;
    protected int moeda;
    protected ArrayList<Item> inventario;
    
    
    abstract void atacar();
    abstract void pegarItem(Item item);
    abstract void soltarItem(Item item);
    
    
}
