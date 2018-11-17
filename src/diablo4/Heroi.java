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
    protected int level = 1;
    protected int moeda = 0;
    protected int defesa = 1;
    protected int ataque = 1;
    
     
    
    abstract void atacar();
    abstract void pegarItem(Item item);
    abstract void soltarItem(Item item);
    
    
}
