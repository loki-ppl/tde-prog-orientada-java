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
public class Arqueiro extends Heroi{
    
    
    public Arqueiro(String nome,int idade, int saude){
        this.items =  new ArrayList();
        this.nome = nome;
        this.idade = idade;
        this.saude = saude;
    }
    
    @Override
    void atacar() {
        
    }

    @Override
    void pegarItem(Item item) {
        items.add(item);
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

    @Override
    void soltarItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void especial(Heroi heroi2, int i, int nf) {
        System.out.println("--> *ESPECIAL* Monstro contra atacou! Arqueiro perfurou!");
        System.out.println("--> *ESPECIAL* Bonus de dano ao Monstro: "+heroi2.ataque);
        System.out.println("--> Heroi recebeu "+Jogo.fases.get(i).monstros.get(nf-1).forca+" de dano!");
        int danoRecebido = Jogo.fases.get(i).monstros.get(nf-1).forca - heroi2.defesa;
        if (danoRecebido < 0){danoRecebido = 0;}
        System.out.println("--> Defesa do Heroi: "+heroi2.defesa);
        System.out.println("--> Dano recebido reduzido para: "+danoRecebido);
        heroi2.saude -= Jogo.fases.get(i).monstros.get(nf-1).forca;
        System.out.println("\nSaude do heroi:"+heroi2.saude);
        Jogo.fases.get(i).monstros.get(nf-1).saude -= heroi2.ataque;
    }   
    
    @Override
    public void especialTeste(Heroi heroi2, int i, int nf) {
        System.out.println("--> *ESPECIAL* Monstro contra atacou! Arqueiro perfurou!");
        System.out.println("--> *ESPECIAL* Bonus de dano ao Monstro: "+heroi2.ataque);
        System.out.println("--> Heroi recebeu "+JogoTeste.fasesteste.get(i).monstros.get(nf-1).forca+" de dano!");
        int danoRecebido = JogoTeste.fasesteste.get(i).monstros.get(nf-1).forca - heroi2.defesa;
        if (danoRecebido < 0){danoRecebido = 0;}
        System.out.println("--> Defesa do Heroi: "+heroi2.defesa);
        System.out.println("--> Dano recebido reduzido para: "+danoRecebido);
        heroi2.saude -= danoRecebido;
        System.out.println("\nSaude do heroi:"+heroi2.saude);
        JogoTeste.fasesteste.get(i).monstros.get(nf-1).saude -= heroi2.ataque;
    }  
    
    @Override
    public void especialBoss(Heroi heroi2, int i, int nf) {
        System.out.println("--> *ESPECIAL* Boss contra atacou! Arqueiro perfurou!!");
        System.out.println("--> *ESPECIAL* Bonus de dano ao Monstro: "+heroi2.ataque);
        System.out.println("--> Heroi recebeu "+Jogo.fases.get(i).monstros.get(Jogo.fases.get(nf).monstros.size()-1).forca+" de dano!");
        int danoRecebido = +Jogo.fases.get(i).monstros.get(Jogo.fases.get(nf).monstros.size()-1).forca+ - heroi2.defesa;
        if (danoRecebido < 0){danoRecebido = 0;}
        System.out.println("--> Defesa do Heroi: "+heroi2.defesa);
        System.out.println("--> Dano recebido reduzido para: "+danoRecebido);
        heroi2.saude -= danoRecebido;        
        System.out.println("\nSaude do heroi: "+heroi2.saude);
        Jogo.fases.get(i).monstros.get(Jogo.fases.get(nf).monstros.size()-1).saude -= heroi2.ataque;
    }  
    
    @Override
    public void especialBossTeste(Heroi heroi2, int i, int nf) {
        System.out.println("--> *ESPECIAL* Boss contra atacou! Arqueiro perfurou!!");
        System.out.println("--> *ESPECIAL* Bonus de dano ao Monstro: "+heroi2.ataque);
        System.out.println("--> Heroi recebeu "+JogoTeste.fasesteste.get(i).monstros.get(JogoTeste.fasesteste.get(nf).monstros.size()-1).forca+" de dano!");
        int danoRecebido = +JogoTeste.fasesteste.get(i).monstros.get(JogoTeste.fasesteste.get(nf).monstros.size()-1).forca+ - heroi2.defesa;
        if (danoRecebido < 0){danoRecebido = 0;}
        System.out.println("--> Defesa do Heroi: "+heroi2.defesa);
        System.out.println("--> Dano recebido reduzido para: "+danoRecebido);
        heroi2.saude -= danoRecebido;        
        System.out.println("\nSaude do heroi: "+heroi2.saude);
        JogoTeste.fasesteste.get(i).monstros.get(JogoTeste.fasesteste.get(nf).monstros.size()-1).saude -= heroi2.ataque;
    }
}
