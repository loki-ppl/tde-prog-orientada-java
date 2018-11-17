/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;
import java.util.ArrayList;
/**
 *
 * @author Cliente
 */
public class Fase{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Monstro> monstros;
    
    public Fase(){
        monstros = new ArrayList<Monstro>();
    }
    
    public void addMostro(Monstro monstro){
        
        monstros.add(monstro);
    }
    
    
    
}
