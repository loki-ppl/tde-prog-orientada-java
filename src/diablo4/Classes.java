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
public class Classes{
    
    private int classe;
    private String classeNome;
    private int dano;
    private int hp;
    private int mp;

    
    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public Classes(int classe) {
        this.classe = classe;
    }
    
    void escolhaClasse(int classe){
    if (classe == 1){
    classeNome = "Arqueiro";
    dano = 4;
    hp = 50;      
    }
    else if (classe == 2){
    dano = 3;
    classeNome = "Guerreiro";
    hp = 80;
    }
    else if (classe == 3){
    classeNome = "Mago";
    dano = 3;
    hp = 50;
    }
    }
}
