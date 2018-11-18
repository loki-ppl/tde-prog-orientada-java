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
 * @author Cliente
 */
public class MonstroN extends Monstro{
    

    public MonstroN(String nome, String descricao, int saude, int forca ) {
        this.nome = nome;
        this.descricao = descricao;
        this.saude = saude;
        this.forca = forca;
        
        
    }
    @Override
    public void dropaItem(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    public void addItem(Item item){
        itens.add(item);
    }   

    @Override
    public void contraGolpe(Heroi heroi2, int i, int nf){
    int rnd = new Random().nextInt(10);
    if (rnd>3){
        System.out.println("--> Monstro contra atacou! Heroi recebeu "+Jogo.fases.get(i).monstros.get(nf-1).forca+" de dano!");
        heroi2.saude -= Jogo.fases.get(i).monstros.get(nf-1).forca;
        System.out.println("\nSaude do heroi:"+heroi2.saude);
    }
    else{
        System.out.println("--> Monstro contra atacou!");
        System.out.println("--> Heroi desviou!"); 
        System.out.println("\nSaude do heroi:"+heroi2.saude);
    }

}
    @Override
    public void contraGolpeTeste(Heroi heroi2, int i, int nf){
    int rnd = new Random().nextInt(10);
    if (rnd>3){
        System.out.println("--> Monstro contra atacou! Heroi recebeu "+JogoTeste.fasesteste.get(i).monstros.get(nf-1).forca+" de dano!");
        heroi2.saude -= JogoTeste.fasesteste.get(i).monstros.get(nf-1).forca;
        System.out.println("\nSaude do heroi:"+heroi2.saude);
    }
    else{
        System.out.println("--> Monstro contra atacou!");
        System.out.println("--> Heroi desviou!"); 
        System.out.println("\nSaude do heroi:"+heroi2.saude);
    }
    
    }

    
    
}
