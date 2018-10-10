/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

/**
 *
 * @author lucas
 */
public class Character {
    
    private String nome;
    private int level;
    private int classe;

    public Character(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(int level) {
        this.level = level;
    }
   
    
    
}
