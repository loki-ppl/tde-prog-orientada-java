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
public class Guerreiro extends Heroi {
    
    public Guerreiro(String nome,int idade, int saude){
        this.nome = nome;
        this.idade = idade;
        this.saude = saude;
    }
    @Override
    void atacar() {
        
    }

    @Override
    void pegarItem(Item item) {
         //Inventario.addItem(item);
    }

    @Override
    void soltarItem(Item item) {
         //Inventario.removeItem(item);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMoeda() {
        return moeda;
    }

    public void setMoeda(int moeda) {
        this.moeda = moeda;
    }
    
    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    
}
