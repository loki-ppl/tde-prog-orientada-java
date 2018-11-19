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
 * @author augusto.coelho
 */
public final class Jogo {
    static ArrayList<Fase> fases = new ArrayList<Fase>();    
    static Heroi heroi2;
    
     public static void criarItem(){         
        Item.addNomeItensAtk();
        int escolhas = 0;
        boolean foi = true;
        boolean itemAtkCriado = true;
        boolean itemDefCriado = true;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        while (itemAtkCriado == true || itemDefCriado == true){
        System.out.println("\n/===/ Criar Itens /===/");  
        System.out.println("Digite 1 para criar itens de ataque.");  
        System.out.println("Digite 2 para criar itens de defesa."); 
        try {
           escolhas = Integer.parseInt(in2.nextLine().trim());  
        }        
        catch(NumberFormatException e) {} 
        
        int nf = escolhas;  
        
        while (nf < 1 || nf > 2){
            System.out.println("\n/===/ Criar Itens /===/");  
            System.out.println("Digite 1 para criar itens de ataque.");  
            System.out.println("Digite 2 para criar itens de defesa.");  

            try {
               escolhas = Integer.parseInt(in2.nextLine().trim());    
            }        
            catch(NumberFormatException e) {}        
            }
            int nf2 = escolhas;

            if (nf2 == 1 && itemAtkCriado == true){
                System.out.println("Quantos itens de Ataque voce deseja criar?");
                int ni = in.nextInt();
                for(int i= 0; i < ni; i++){                  
                    System.out.println("Insira o nome do item "+(i+1)+":"); 
                    String nomeItens = in.nextLine();
                    System.out.println("Insira o Ataque do item "+(i+1)+":"); 
                    int pontoAtk = in2.nextInt();   
                    int pontoDef = 0;
                    Item item1 = new Item(nomeItens,pontoAtk,pontoDef);
                    for (int j = 0; j < fases.size(); j++){
                        for (int k = 0; k < fases.get(j).monstros.size(); k++){
                            Item.randomItensAtk(j, k);
                            fases.get(j).monstros.get(k).itens.add(item1);
                        }
                    }
                }
                itemAtkCriado = false;

            }
            else if(nf2 == 2 && itemDefCriado == true){
                System.out.println("Quantos itens de Defesa voce deseja criar?");
                int ni = in.nextInt();
                for(int i= 0; i < ni; i++){  
                    System.out.println("Insira o nome do item "+(i+1)+":"); 
                    String nomeItens = in.nextLine();
                    System.out.println("Insira a Defesa do item "+(i+1)+":");  
                    int pontoAtk = 0; 
                    int pontoDef = in2.nextInt(); 
                    Item item2 = new Item(nomeItens,pontoAtk,pontoDef);
                    for (int j = 0; j < fases.size(); j++){                        
                        for (int k = 0; k < fases.get(j).monstros.size(); k++){
                            //Item.randomItensStats(j, k);
                            fases.get(j).monstros.get(k).itens.add(item2);
                        }
                    }
                }
                itemDefCriado = false;
            }        
        }
     }      
    
    public static void opcoesHeroi(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n/===/ Menu Heroi /===/");     
        System.out.println("/===/ Digite 1 para atacar os monstros/===/");    
        System.out.println("/===/ Digite 2 para mostrar os status/===/"); 
        int nf = in.nextInt();        
                try {
           nf = Integer.parseInt(in.nextLine().trim());  
        }        
        catch(NumberFormatException e) {} 
        while (nf < 1 || nf > 2){
            System.out.println("\n/===/ Menu Heroi /===/");     
            System.out.println("/===/ Digite 1 para atacar os monstros/===/");    
            System.out.println("/===/ Digite 2 para mostrar os status/===/"); 
                        try {
               nf = Integer.parseInt(in.nextLine().trim());    
            }        
            catch(NumberFormatException e) {}        
            }
        int nf2 = in.nextInt();
        if (nf2 == 1){
            opcaoAtacar();
        }
        else if(nf2 == 2){
            mostrarStatus();
        }
    }    
    
    public static void gameOver(){
        if (Jogo.heroi2.saude> 0){
        System.out.println("\n/===/ Voce completou o jogo! /===/");
        System.exit(0);
        }
        else{
        System.out.println("\n*** morreu =( ***");
        System.out.println("Deseja criar outro Heroi?");
        System.out.println("1 - Criar outro heroi\n 0 - Sair do jogo");
        Scanner in3 = new Scanner(System.in);
        int nf3 = in3.nextInt();
        if (nf3 == 1){criarHeroi();
        }        
        else{
        System.exit(0);
        }
      }    
    }
    
    public static void opcaoAtacar(){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < fases.size(); i++){              
            while((fases.get(i).monstros.get(fases.get(i).monstros.size()-1).saude)>0){
            //while(bossDerrotado == false){
                Jogo.mostraMonstro(i);
                Jogo.mostraBoss(i);
                System.out.println("\n/===/ Atacar /===/");  
                System.out.println("Insira o numero do monstro que deseja atacar:"); 
                int nf = in.nextInt();
                if (nf == 0){            
                    System.out.println(("\nVoce atacou o Boss "+fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).nome)+"!");

                    System.out.println("\n--> Atacou e aplicou " + heroi2.ataque+" de dano!");
                    
                    //Boss ataca
                    fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).contraGolpe(heroi2, i, nf);
                    if(heroi2.saude>0){}
                    else{
                    gameOver();
                    }
                    fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).saude -= heroi2.ataque;
                    System.out.println("Saude restante do Boss: "+fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).saude);  
                    
                    if((fases.get(i).monstros.get(fases.get(i).monstros.size()-1).saude)<=0){
                        System.out.println("\n** Boss "+fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).nome+" derrotado!");
                        int rnd = new Random().nextInt(fases.get(i).monstros.get(nf).itens.size());   
                        int moedarnd = new Random().nextInt(100);
                        System.out.println("\n$ Dropou o item: " +fases.get(i).monstros.get(nf).itens.get(rnd).nomeItens+"");
                        System.out.println("\n$ Dropou "+ moedarnd+" moedas!");
                        heroi2.moeda += moedarnd;
                        System.out.println("Ataque: " +fases.get(i).monstros.get(nf).itens.get(rnd).pontoAtk+"");
                        System.out.println("Defesa: " +fases.get(i).monstros.get(nf).itens.get(rnd).pontoDef+"");
                        System.out.println("\nInsira 1 para equipar o item dropado ou 0 para descartar:");
                        int drop = in.nextInt();
                        if (drop == 1){
                            heroi2.pegarItem(fases.get(i).monstros.get(i).itens.get(rnd));
                            if(fases.get(i).monstros.get(i).itens.get(rnd).pontoAtk == 0){ 
                                heroi2.defesa = 1;
                                        
                                heroi2.defesa += fases.get(i).monstros.get(i).itens.get(rnd).pontoDef;
                                
                             if(fases.get(i).monstros.get(i).itens.get(rnd).pontoDef == 0){
                                heroi2.ataque = 1;
                                heroi2.ataque += fases.get(i).monstros.get(i).itens.get(rnd).pontoAtk;
                            }                            
                            
                            System.out.println("Item equipado."); 
                            }            
                        }
                        if (drop == 2){
                            System.out.println("Item descartado.");                            
                        }                        
                    }                 
                }
                else{
                    System.out.println(("\nVoce atacou o monstro "+fases.get(i).monstros.get(nf-1).nome)+"!"); 
                    System.out.println("\n--> Atacou e aplicou " + heroi2.ataque+" de dano!");
                    
                    //Monstro ataca                   
                    fases.get(i).monstros.get(nf-1).contraGolpe(heroi2, i, nf);
                    if(heroi2.saude>0){}
                    else{
                    gameOver();
                    }
                    
                    fases.get(i).monstros.get(nf-1).saude -= heroi2.ataque;
                    System.out.println("Saude restante do monstro: "+ (fases.get(i).monstros.get(nf-1).saude)); 
                    //fases.get(i).monstros.get(j).saude          
                   // if((fases.get(i).monstros.get(fases.get(i).monstros.size()-1).saude)<=0){
                    if((fases.get(i).monstros.get(nf-1).saude)<=0){
                        System.out.println("\n** Monstro "+fases.get(i).monstros.get(nf-1).nome+" derrotado!");
                        int rnd = new Random().nextInt(fases.get(i).monstros.get(nf-1).itens.size());   
                        
                       /* System.out.println(fases.get(i).monstros.get(nf-1).itens.get(0).nomeItens);
                        System.out.println(fases.get(i).monstros.get(nf-1).itens.get(1).nomeItens);
                        System.out.println(fases.get(i).monstros.get(nf-1).itens.get(2).nomeItens);*/
                        
                        System.out.println("\n$ Dropou o item: " +fases.get(i).monstros.get(nf-1).itens.get(rnd).nomeItens+"");
                        System.out.println("Ataque: " +fases.get(i).monstros.get(nf-1).itens.get(rnd).pontoAtk+"");                     
                        System.out.println("Defesa: " +fases.get(i).monstros.get(nf-1).itens.get(rnd).pontoDef+"");
                        System.out.println("\nInsira 1 para equipar o item dropado ou 0 para descartar:");
                        int drop = in.nextInt();
                        if (drop == 1){
                            heroi2.pegarItem(fases.get(i).monstros.get(nf-1).itens.get(rnd));
                            if(fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoAtk() == 0){
                                heroi2.defesa = 1;
                                heroi2.defesa += fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoDef();
                                System.out.println("Item equipado."); 
                            }
                            if(fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoAtk() == 0){
                                heroi2.ataque = 1;
                                heroi2.ataque += fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoAtk();
                                System.out.println("Item equipado."); 
                            }                                                               
                        }
                        if (drop == 2){
                            System.out.println("Item descartado.");      
                        }                        
                    }                  
                }                
                opcoesHeroi();
            }
        }
        gameOver();
    }    
    public static void criarFase(){
        int escolhas = 0;
        boolean foi = true;
        Scanner in = new Scanner(System.in);
        /*System.out.println("\n/===/ Criação de fases /===/");        
        System.out.println("Insira o numero de fases a serem criadas:");
        try {
           escolhas = Integer.parseInt(in.nextLine().trim());
           foi = false;
        }        
        catch(NumberFormatException e) {} */
        while(foi == true){
            System.out.println("\n/===/ Criação de fases /===/");        
            System.out.println("Insira o numero de fases a serem criadas:");
            try {
                    escolhas = Integer.parseInt(in.nextLine().trim());                
                    foi = false;
             }
               catch(NumberFormatException e) {}
         }
        foi = true;
        int nf = escolhas;
        for(int i= 0; i < nf; i++){
            Fase fase = new Fase();        
            System.out.println("\n/===/ Fase "+ (i+1)+" /===/ ");
            System.out.println("Insira o nome da "+ (i+1+"°") +" fase: ");
            String nomefase = in.nextLine();
            System.out.println("\n/===/ Cadastrar monstros /===/");
            System.out.println("Insira numero de monstros a serem criados:");
            int nm = in.nextInt();
            for(int j = 0; j < nm; j++){
                Scanner sc = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
                System.out.println("Insira o nome do "+ (j+1+"° "+ "monstro:")); 
                String nome = sc.nextLine();
                System.out.println("Insira a descrição do "+ (j+1+"° "+ "monstro:")); 
                String descricao = sc.nextLine();
                System.out.println("Insira quanto de vida tera o "+ (j+1+"° "+ "monstro:")); 
                int saude = input.nextInt();
                System.out.println("Insira a força do "+ (j+1+"° "+ "monstro:")); 
                int forca = input.nextInt();
                
                MonstroN monstroNormal = new MonstroN(nome,descricao, saude, forca);
                fase.addMostro(monstroNormal);
     
            }   
            Scanner ss = new Scanner(System.in);
            System.out.println("\n/===/ Cadastrar Boss /===/ ");
            System.out.println("Insira o nome do Boss:");
            String nomeboss = ss.nextLine();
            System.out.println("Insira a descrição do Boss:");
            String descricao = ss.nextLine();
            System.out.println("Insira a lore do Boss:");
            String lore = ss.nextLine();
            System.out.println("Insira quanto de vida tera o Boss:");
            int saude = ss.nextInt();
            System.out.println("Insira a força do Boss:");
            int forca = ss.nextInt();
            Boss boss = new Boss(nomeboss, descricao, lore, saude, forca);
            fase.addMostro(boss);
            fase.setNome(nomefase);
            System.out.println("\nFase "+ fase.getNome()+" criada com sucesso!");
            fases.add(fase);
            
        }   
        
    }
    public static void criarHeroi(){
        int classe; 
        Scanner scanNome = new Scanner(System.in);  
        System.out.println("\n/===/ Criar Heroi /===/");        
        System.out.println("Qual o seu nome?");
        String nome = scanNome.nextLine();
        
        System.out.println("\nOlá " + nome + ".");
        System.out.println("\nEscolha sua classe:");
        System.out.println("1 - Arqueiro - (Chance de perfurar inimigo)");
        System.out.println("2 - Guerreiro - (Chance de bloquear dano recebido)");
        System.out.println("3 - Mago - (Chance de congelar inimigo");
        
        Scanner scanClasse = new Scanner(System.in); 
        
        try {
           classe = Integer.parseInt(scanNome.nextLine().trim());    
            switch (classe) {
                case 1:
                    
                    System.out.println("\n/===/ Status do Heroi /===/");   
                    System.out.println("Insira idade do seu personagem: ");
                    int idadearq = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudearq = scanClasse.nextInt();
                    Arqueiro arqueiro = new Arqueiro(nome, idadearq, saudearq);
                    heroi2 = arqueiro;
                    mostrarStatus();
                    break;
                    
                case 2:
                    
                    System.out.println("\n/===/ Status do Heroi /===/"); 
                    System.out.println("Insira idade do seu personagem: ");
                    int idadeguerr = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudeguerr = scanClasse.nextInt();
                    Guerreiro guerreiro = new Guerreiro(nome, idadeguerr, saudeguerr);
                    heroi2 = guerreiro;
                    mostrarStatus();
                    
                    break;
                case 3:
                    
                    System.out.println("\n/===/ Status do Heroi /===/"); 
                    System.out.println("Insira idade do seu personagem: ");
                    int idademago = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudemago = scanClasse.nextInt();
                    Mago mago = new Mago(nome, idademago, saudemago);
                    heroi2 = mago;
                    mostrarStatus();
                    
                    break;
                default:
                    break;
            }
         } 
       
        catch(NumberFormatException e) {}    
    
    }
    
    public static void comecajogo(){
        for(int i = 0; i <= fases.size(); i++)
            System.out.println("\n/==/ Iniciando fase "+ fases.get(i).getNome()+" ! /==/");
    
    }
    public static void mostraFase(){
        for(int i = 0; i < fases.size(); i++){
                    System.out.println(Jogo.fases.get(i).getNome());
                        }
    }
    public static void mostraMonstro(int i){

        System.out.println("\n/==/ Monstros da fase "+(fases.indexOf(fases.get(i))+1)+" /==/");
        for(int j = 0; j < fases.get(i).monstros.size()-1; j++){
            System.out.println("Nome: "+fases.get(i).monstros.get(j).nome+" - Saude: "+fases.get(i).monstros.get(j).saude+" - Digite "+(j+1)+" para atacar.");
        }

    }
   
    public static void mostraBoss(int i){

            System.out.println("/==/ Boss da fase "+(fases.indexOf(fases.get(i))+1)+" /==/");
            System.out.println("Nome: "+fases.get(i).monstros.get(fases.get(i).monstros.size()-1).nome+" - Saude: "+fases.get(i).monstros.get(fases.get(i).monstros.size()-1).saude+" - Digite "+ i +" para atacar.");

    }
    
    public static void mostrarItens(){
        for(int i = 0; i < fases.get(0).monstros.get(0).itens.size(); i++){
            System.out.println("[" + (i+1) + "]"+fases.get(0).monstros.get(0).itens.get(i).getNomeItens());
            System.out.println("   " + fases.get(0).monstros.get(0).itens.get(i).getPontoAtk());
            System.out.println("   " + fases.get(0).monstros.get(0).itens.get(i).getPontoDef());
        }
    }
    public static void excluirItem(int numItem){
        for (int j = 0; j < fases.size(); j++){
            for (int k = 0; k < fases.get(j).monstros.size(); k++){
                fases.get(j).monstros.get(k).itens.remove(numItem-1);
            }
        }   
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
                   

    }
      
}
//