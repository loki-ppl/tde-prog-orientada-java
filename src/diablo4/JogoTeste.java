/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cliente
 */
public final class JogoTeste {
    
    static ArrayList<Fase> fasesteste = new ArrayList<Fase>();        
    static Heroi heroi2;
    
    public static void mostrarItensTeste(){
      for(int i = 0; i < fasesteste.get(0).monstros.get(0).itens.size(); i++){
          System.out.println("Item " +(i+1)+" "+fasesteste.get(0).monstros.get(0).itens.get(i).nomeItens);
              }
  }
    
public static void excluirItem(int i){
    System.out.println("Item: "+ fasesteste.get(0).monstros.get(0).itens.get(i-1).nomeItens+ " removido com sucesso!");  
for (int j = 0; j < fasesteste.size(); j++){
                        for (int k = 0; k < fasesteste.get(j).monstros.size(); k++){
                            fasesteste.get(j).monstros.get(k).itens.remove(i-1);
        }                   
    }
opcoesHeroiteste();
}
    
    public static void mostrarStatus(){
                    System.out.println("\n/==/ Status Gerais /==/");
                    System.out.println("Classe: "+ heroi2.getClass().getCanonicalName().substring(8));
                    System.out.println("Nome: " + heroi2.nome);
                    System.out.println("Idade: " + heroi2.idade);
                    System.out.println("Saude: " + heroi2.saude);
                    System.out.println("Level: " + heroi2.level);
                    System.out.println("Ataque: " + heroi2.ataque);
                    System.out.println("Defesa: " + heroi2.defesa);
                    System.out.println("Moedas: " + heroi2.moeda);
                    opcoesHeroiteste();
    }                
    public static void heroiCriado(){ 
        int classe; 
        Scanner scanNome = new Scanner(System.in);  
        System.out.println("\n/===/ Criar Heroi /===/");        

        System.out.println("\nEscolha sua classe:");
        System.out.println("1 - Arqueiro - (Chance de perfurar inimigo)");
        System.out.println("2 - Guerreiro - (Chance de bloquear dano recebido)");
        System.out.println("3 - Mago - (Chance de congelar inimigo)");
        Scanner scanClasse = new Scanner(System.in);         
        try {
           classe = Integer.parseInt(scanNome.nextLine().trim());    
            switch (classe) {
                case 1:
                    Arqueiro arqueiro = new Arqueiro("Arqueiro Eduardo Linux", 23, 30);
                    heroi2 = arqueiro;                    
                    break;                    
                case 2:
                    Guerreiro guerreiro = new Guerreiro("Guerreiro Eduardo Linux", 23, 30);
                    heroi2 = guerreiro;
                     break;
                case 3:
                    Mago mago = new Mago("Mago Eduardo Linux", 23, 30);
                    heroi2 = mago;                                    
                    break;
                    default:
             }
            
         } 
       
        catch(NumberFormatException e) {}   
        
        
   }
   public static void faseCriada(){
       Fase fase1 = new Fase();
       MonstroN monstro1 = new MonstroN("Monstro marmita", "Um monstro que pega no ponto fraco do arqueiro linux", 3, 2);
       MonstroN monstro2 = new MonstroN("JogarBem", "Um monstro que o palmeiras tem medo de matar", 4, 2);
       Boss boss = new Boss("MUNDIAL", "Esse monstro que o clan do arqueiro linux jamais ira derrotar", "Um monstro conhecido desde que os jogos foram criados e só heróis competentes conseguem o matar", 5, 4);
       fase1.monstros.add(monstro1);
       fase1.monstros.add(monstro2);
       fase1.monstros.add(boss);
       fasesteste.add(fase1);
       
       Fase fase2 = new Fase();
       MonstroN monstro3 = new MonstroN("Sonho", "Após arqueiro linux achar que conseguiu matar o monstro mundial ele descobre que era um sonho", 4, 1);
       Boss boss1 = new Boss("Cair na realidade", "O boss que deixa o arqueiro linux esclarecido sobre seu clan do coração", "Palmeiras jamais terá mundial", 10, 5);
       fase2.monstros.add(monstro3);
       fase2.monstros.add(boss1);
       fasesteste.add(fase2);
       
   
   }
   public static void mostraMonstrosCriados(){
       
       for(int i = 0; i < fasesteste.size(); i++){           
           System.out.println("-------------------");
           System.out.println("Monstros fase "+(i+1) +" :");
           for(int j = 0; j < fasesteste.get(i).monstros.size()-1; j++){
              System.out.println("-------------------");
              System.out.println("Nome: " + fasesteste.get(i).monstros.get(j).nome);
              System.out.println("Descrição: "+ fasesteste.get(i).monstros.get(j).descricao);
              System.out.println("Força: " + fasesteste.get(i).monstros.get(j).forca);
              System.out.println("Saúde: " + fasesteste.get(i).monstros.get(j).saude);
              
          }
           System.out.println("-------------------");
           System.out.println("Boss da fase " + (i+1));
           System.out.println("Nome: " + fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).nome);
           System.out.println("Descrição: "+fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).descricao);
           System.out.println("Lore: " +fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).lore);
           System.out.println("Força: " +fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).forca);
           System.out.println("Saude: " + fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).saude);
           System.out.println("-------------------");
       }      
       
   }
    public static void mostraMonstroteste(int i){
        System.out.println("\n/==/ Monstros da fase "+(fasesteste.indexOf(fasesteste.get(i))+1)+" /==/");
        for(int j = 0; j < fasesteste.get(i).monstros.size()-1; j++){
            System.out.println("Nome: "+fasesteste.get(i).monstros.get(j).nome+" - Saude: "+fasesteste.get(i).monstros.get(j).saude+" - Digite "+(j+1)+" para atacar.");
        }

    }
    public static void mostraBossteste(int i){
            System.out.println("/==/ Boss da fase "+(fasesteste.indexOf(fasesteste.get(i))+1)+" /==/");
            System.out.println("Nome: "+fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).nome+" - Saude: "+fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).saude+" - Digite "+ 0 +" para atacar.");
    }
    
  public static void menuExcluirItens(){
      Scanner ms = new Scanner(System.in);
                JogoTeste.mostrarItensTeste();
                int opcaoitemteste = 0;
                boolean foi = true;
                while (foi == true || opcaoitemteste < 0 || opcaoitemteste > fasesteste.get(0).monstros.get(0).itens.size()-1){
                System.out.println("  ");
                System.out.println("Digite 0 para excluir item");
                System.out.println("Digite 1 para continuar");
                             try {
           opcaoitemteste = Integer.parseInt(ms.nextLine().trim());
           foi = false;
        }       
                             catch(NumberFormatException e) {} }
                              
                switch(opcaoitemteste){
                    case 0: System.out.println("Insira o item pra excluir: ");
                            int a = ms.nextInt();
                            JogoTeste.excluirItem(a);
                            opcoesHeroiteste();
                            break;
                    case 1: 
                        opcoesHeroiteste();
                        break;}
  }
  public static void opcoesHeroiteste(){
        Scanner in = new Scanner(System.in);
        boolean foi = true;
        int nf = 0;
        while(foi == true || nf < 1 || nf > 3){
            System.out.println("\n/===/ Menu Heroi /===/");     
            System.out.println("/===/ Digite 1 para atacar os monstros /===/");    
            System.out.println("/===/ Digite 2 para mostrar os status /===/");  
            System.out.println("/===/ Digite 3 para excluir itens do jogo /===/");
             try {
           nf = Integer.parseInt(in.nextLine().trim());
           foi = false;
        }        
        catch(NumberFormatException e) {} }
        if (nf == 1){
            opcaoAtacarteste();
        }
        if(nf == 2){
            mostrarStatus();
        }
        if(nf == 3){
        menuExcluirItens();
        }
    }
  public static void criarItemTeste(){
        Item.addNomeItensAtk();
        Item.addNomeItensDef();
        for (int j = 0; j < fasesteste.size(); j++){
            for (int k = 0; k < fasesteste.get(j).monstros.size(); k++){
                Item.randomItensAtkTeste(j, k);
            }
        }

        for (int j = 0; j < fasesteste.size(); j++){
            for (int k = 0; k < fasesteste.get(j).monstros.size(); k++){
                Item.randomItensDefTeste(j, k);
            }
        }               
    }
  

  
  public static void gameOver(){
        if (heroi2.saude> 0){
        System.out.println("\n/===/ Voce completou o jogo! /===/");
        System.exit(0);
        }
        else{
        System.out.println("\n*** morreu =( ***");
        System.out.println("Deseja criar outro Heroi?");
        System.out.println("1 - Criar outro heroi\n 0 - Sair do jogo");
        Scanner in3 = new Scanner(System.in);
        int nf3 = in3.nextInt();
        if (nf3 == 1){heroiCriado();
        }        
        else{
        System.exit(0);
        }
        }
    
    }
  public static void opcaoAtacarteste(){
      boolean foi = true;
      int nf = 0;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < fasesteste.size(); i++){              
            while((fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).saude)>0){            
                mostraMonstroteste(i);
                mostraBossteste(i);
                while(foi == true || nf < 0 || nf > fasesteste.size()){
                System.out.println("\n/===/ Atacar /===/");  
                System.out.println("Insira o numero do monstro que deseja atacar:"); 
                try {
                    nf = Integer.parseInt(in.nextLine().trim());
                    foi = false;
                }        
                 catch(NumberFormatException e) {} 
                }
                
                if (nf == 0){            
                    System.out.println(("\nVoce atacou o Boss "+fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).nome)+"!");
                    System.out.println("\n--> Atacou e aplicou " + heroi2.ataque+" de dano!"); 
                    
                    //Boss ataca
                    int atckboss = new Random().nextInt(10);
                    if (atckboss>3){
                    fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).contraGolpeTeste(heroi2, i, nf);
                    }
                    else{
                    heroi2.especialBossTeste(heroi2, i, nf);
                    }
                    if(heroi2.saude>0){
                    }
                    else{
                    gameOver();
                    }
                    
                    fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).saude -= heroi2.ataque;
                    System.out.println("Saude restante do Boss: "+fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).saude);  
                    
                    if((fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).saude)<=0){
                        System.out.println("\n** Boss "+fasesteste.get(i).monstros.get(fasesteste.get(i).monstros.size()-1).nome+" derrotado!");
                        int rnd = new Random().nextInt(fasesteste.get(i).monstros.get(i).itens.size());   
                        int moedarnd = new Random().nextInt(100);
                        System.out.println("\n$ Dropou o item: " +fasesteste.get(i).monstros.get(i).itens.get(rnd).nomeItens+"");
                        System.out.println("\n$ Dropou "+ moedarnd+" moedas!");
                        heroi2.level += 1;
                        heroi2.moeda += moedarnd;
                        System.out.println("Ataque: " +fasesteste.get(i).monstros.get(i).itens.get(rnd).pontoAtk+"");                           
                        System.out.println("Defesa: " +fasesteste.get(i).monstros.get(i).itens.get(rnd).pontoDef+"");  
                        foi = true;
                        int drop = 0;
                        while (foi == true || drop < 0 || drop > 1){
                        System.out.println("\nInsira 1 para equipar o item dropado ou 0 para descartar:");
                        try {
                            drop = Integer.parseInt(in.nextLine().trim());
                            foi = false;
                           }        
                        catch(NumberFormatException e) {}                   
                        }
                        foi = true;
                        if (drop == 1){
                            heroi2.pegarItem(fasesteste.get(i).monstros.get(i).itens.get(rnd));
                            if(fasesteste.get(i).monstros.get(i).itens.get(rnd).pontoAtk == 0){
                                heroi2.defesa = 1;
                                heroi2.defesa += fasesteste.get(i).monstros.get(i).itens.get(rnd).pontoDef;
                                System.out.println("Item equipado."); 
                            }
                            if(fasesteste.get(i).monstros.get(i).itens.get(rnd).pontoDef == 0){
                                heroi2.ataque = 1;
                                heroi2.ataque += fasesteste.get(i).monstros.get(i).itens.get(rnd).pontoAtk;
                                System.out.println("Item equipado."); 
                            }                             
                        }
                        if (drop == 2){
                            System.out.println("Item descartado.");                            
                        }                        
                    }                
                }
                else{
                    System.out.println(("\nVoce atacou o monstro "+fasesteste.get(i).monstros.get(nf-1).nome)+"!"); 
                    System.out.println("\n--> Atacou e aplicou " + heroi2.ataque+" de dano!");
                    int atckmonstro = new Random().nextInt(10);
                    if (atckmonstro>3){
                    //Monstro ataca                   
                    fasesteste.get(i).monstros.get(nf-1).contraGolpeTeste(heroi2, i, nf);
                    }
                    else{
                    heroi2.especialTeste(heroi2, i , nf);
                    }
                    if(heroi2.saude>0){}
                    else{
                    gameOver();
                    }                 
                    
                    fasesteste.get(i).monstros.get(nf-1).saude -= heroi2.ataque;
                    System.out.println("Saude restante do monstro: "+ (fasesteste.get(i).monstros.get(nf-1).saude)); 
                    
                    if((fasesteste.get(i).monstros.get(nf-1).saude)<=0){
                        int drop = 0;
                        System.out.println("\n** Monstro "+fasesteste.get(i).monstros.get(nf-1).nome+" derrotado!");
                        int rnd = new Random().nextInt(fasesteste.get(i).monstros.get(nf-1).itens.size());   
                        System.out.println("\n$ Dropou o item: " +fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).nomeItens+"");
                        System.out.println("Ataque: " +fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).pontoAtk+"");
                        System.out.println("Defesa: " +fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).pontoDef+"");
                        foi = true;
                        
                        while (foi == true || drop < 0 || drop > 1){
                        System.out.println("\nInsira 1 para equipar o item dropado ou 0 para descartar:");
                        try {
                            drop = Integer.parseInt(in.nextLine().trim());
                            foi = false;
                            }        
                        catch(NumberFormatException e) {}                   
                        }
                        foi = true;
                        if (drop == 1){
                            heroi2.pegarItem(fasesteste.get(i).monstros.get(nf-1).itens.get(rnd));
                            if(fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).pontoAtk == 0){
                                heroi2.defesa = 1; 
                                heroi2.defesa += fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).pontoDef;
                            System.out.println("Item equipado.");  
                            }
                            if(fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).pontoDef == 0){
                                heroi2.ataque = 1;
                                heroi2.ataque += fasesteste.get(i).monstros.get(nf-1).itens.get(rnd).pontoAtk;
                            System.out.println("Item equipado.");                             
                            }
                        }
                        if (drop == 2){
                            System.out.println("Item descartado.");
                        } 
                        fasesteste.get(i).monstros.remove(nf-1);
                    }                    
                }                
                opcoesHeroiteste();
            }
        }
        gameOver();
    }    
  }
