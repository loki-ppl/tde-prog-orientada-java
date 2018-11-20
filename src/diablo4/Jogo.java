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
        int nf= 0;
        
        boolean foi = true;
        boolean itemAtkCriado = true;
        boolean itemDefCriado = true;
        
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        while (itemAtkCriado == true || itemDefCriado == true){
            while(foi == true || nf < 1 || nf > 2){
                System.out.println("\n/===/ Criar Itens /===/");  
                System.out.println("Digite 1 para criar itens de ataque.");  
                System.out.println("Digite 2 para criar itens de defesa.");
                try {
                   nf = Integer.parseInt(in2.nextLine().trim());  
                   foi = false;
                }        
                catch(NumberFormatException e) {
                    System.out.println("Por Favor, digite apenas numeros");
                } 
            }
              
            foi = true;
        

            if (nf == 1 && itemAtkCriado == true){
                System.out.println("Quantos itens de Ataque voce deseja criar?");
                int ni = 0;
                while (true){
                    try{
                        ni = Integer.parseInt(in2.nextLine().trim());
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("DIgite apenas numeros");
                    }
                }
                for(int i= 0; i < ni; i++){                  
                    System.out.println("Insira o nome do item "+(i+1)+":"); 
                    String nomeItens = in2.nextLine();
                    System.out.println("Insira o Ataque do item "+(i+1)+":");
                    int pontoAtk = 0;
                    int pontoDef = 0;
                    while (true){
                        try{
                            pontoAtk = Integer.parseInt(in2.nextLine().trim()); 
                            break;
                        }
                        catch(NumberFormatException e){
                            System.out.println("Digite apenas numeros");
                        }
                    }
                    
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
            else if(nf == 2 && itemDefCriado == true){
                System.out.println("Quantos itens de Defesa voce deseja criar?");
                int ni = 0;
                while (true){
                    try{
                        ni = Integer.parseInt(in2.nextLine().trim());
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("DIgite apenas numeros");
                    }
                }
                int pontoDef = 0;
                for(int i= 0; i < ni; i++){  
                    System.out.println("Insira o nome do item "+(i+1)+":"); 
                    String nomeItens = in2.nextLine();
                    System.out.println("Insira a Defesa do item "+(i+1)+":");  
                    int pontoAtk = 0;
                    while(true){
                        try{
                            pontoDef = Integer.parseInt(in2.nextLine().trim()); 
                            break;
                        }
                        catch(NumberFormatException e){
                            System.out.println("Digite apenas numeros");
                        }
                    }
                    Item item2 = new Item(nomeItens,pontoAtk,pontoDef);
                    for (int j = 0; j < fases.size(); j++){                        
                        for (int k = 0; k < fases.get(j).monstros.size(); k++){
                            Item.randomItensDef(j, k);
                            fases.get(j).monstros.get(k).itens.add(item2);
                        }
                    }
                }
                itemDefCriado = false;
            }        
        }
     } 
    public static void criarItensDefault(){
        Item.addNomeItensAtk();
        Item.addNomeItensDef();
          for (int j = 0; j < fases.size(); j++){
            for (int k = 0; k < fases.get(j).monstros.size(); k++){
                Item.randomItensAtk(j, k);
                Item.randomItensDef(j, k);
            }
  }
    }     
    
    public static void opcoesHeroi(){
        Scanner in = new Scanner(System.in);
        boolean foi =true;
        int nf = 0;         
        while (foi == true || nf < 1 || nf > 2){
            System.out.println("\n/===/ Menu Heroi /===/");     
            System.out.println("/===/ Digite 1 para atacar os monstros/===/");    
            System.out.println("/===/ Digite 2 para mostrar os status/===/"); 
            try {
                nf = Integer.parseInt(in.nextLine().trim());  
                foi =false;
            }        
            catch(NumberFormatException e) {
                System.out.println("Digite apenas numeros");
            }        
        }
        foi = true;
        
        if (nf == 1){
            opcaoAtacar();
        }
        else if(nf == 2){
            mostrarStatus();
        }
    }    
    
    public static void gameOver(){
        int nf3 = 0;
        boolean foi = true;
        if (Jogo.heroi2.saude> 0){
        System.out.println("\n/===/ Voce completou o jogo! /===/");
        System.exit(0);
        }
        else{
            System.out.println("\n*** morreu =( ***");
            System.out.println("Deseja criar outro Heroi?");
            System.out.println("1 - Criar outro heroi\n 0 - Sair do jogo");
            Scanner in3 = new Scanner(System.in);
            while (foi == true|| nf3 < 0 || nf3 > 1){
                try{
                    nf3 = Integer.parseInt(in3.nextLine().trim());
                    foi = false;
                }
                catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros");
                }
            }
            foi = true;
            if (nf3 == 1)
                criarHeroi();        
            else
                System.exit(0);
        }    
    }
    
    public static void opcaoAtacar(){
        Scanner in = new Scanner(System.in);
        boolean foi = true;
        for(int i = 0; i < fases.size(); i++){              
            while((fases.get(i).monstros.get(fases.get(i).monstros.size()-1).saude)>0){
            //while(bossDerrotado == false){
                int nf = 0;
                Jogo.mostraMonstro(i);
                Jogo.mostraBoss(i);
                System.out.println("\n/===/ Atacar /===/");  
                System.out.println("Insira o numero do monstro que deseja atacar:"); 
                while(true){
                    try{
                        nf = Integer.parseInt(in.nextLine().trim());
                        break;
                    }
                    catch(NumberFormatException e){}
                }
                if (nf == 0){            
                    System.out.println(("\nVoce atacou o Boss "+fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).nome)+"!");

                    System.out.println("\n--> Atacou e aplicou " + heroi2.ataque+" de dano!");
                    
                    //Boss ataca
                    int atckboss = new Random().nextInt(10);                                                           
                    if (atckboss>3){
                    fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).contraGolpe(heroi2, i, nf);    
                    }                   
                    else{
                    heroi2.especialBoss(heroi2, i, nf);
                    }
                    if(heroi2.saude<=0){
                        gameOver();
                    }
                    
                    fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).saude -= heroi2.ataque;
                    System.out.println("Saude restante do Boss: "+fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).saude);  
                    
                    if((fases.get(i).monstros.get(fases.get(i).monstros.size()-1).saude)<=0){
                        int drop = 0;
                        System.out.println("\n** Boss "+fases.get(i).monstros.get(fases.get(nf).monstros.size()-1).nome+" derrotado!");
                        int rnd = new Random().nextInt(fases.get(i).monstros.get(nf).itens.size());   
                        int moedarnd = new Random().nextInt(100);
                        System.out.println("\n$ Dropou o item: " +fases.get(i).monstros.get(nf).itens.get(rnd).nomeItens+"");
                        System.out.println("\n$ Dropou "+ moedarnd+" moedas!");
                        heroi2.moeda += moedarnd;
                        System.out.println("Ataque: " +fases.get(i).monstros.get(nf).itens.get(rnd).pontoAtk+"");
                        System.out.println("Defesa: " +fases.get(i).monstros.get(nf).itens.get(rnd).pontoDef+"");
                        
                        while(foi == true || drop < 0 || drop > 1){
                            System.out.println("\nInsira 1 para equipar o item dropado ou 0 para descartar:");
                            try{
                                drop = Integer.parseInt(in.nextLine().trim());
                                foi = false;
                            }
                            catch(NumberFormatException e){
                                System.out.println("Digite apenas numeros");
                            }
                        }
                        foi = true;
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
                    int atckboss = new Random().nextInt(10);
                    //Monstro ataca                                                                        
                    if (atckboss>3){
                    fases.get(i).monstros.get(nf-1).contraGolpe(heroi2, i, nf);    
                    }                   
                    else{
                    heroi2.especial(heroi2, i, nf);
                    }
                    if(heroi2.saude<=0){
                        gameOver();
                    }                   
                    
                    fases.get(i).monstros.get(nf-1).saude -= heroi2.ataque;
                    System.out.println("Saude restante do monstro: "+ (fases.get(i).monstros.get(nf-1).saude)); 

                    if((fases.get(i).monstros.get(nf-1).saude)<=0){
                        int drop = 0;
                        System.out.println("\n** Monstro "+fases.get(i).monstros.get(nf-1).nome+" derrotado!");
                        int rnd = new Random().nextInt(fases.get(i).monstros.get(nf-1).itens.size());   
                        System.out.println("\n$ Dropou o item: " +fases.get(i).monstros.get(nf-1).itens.get(rnd).nomeItens+"");
                        System.out.println("Ataque: " +fases.get(i).monstros.get(nf-1).itens.get(rnd).pontoAtk+"");                     
                        System.out.println("Defesa: " +fases.get(i).monstros.get(nf-1).itens.get(rnd).pontoDef+"");                        
                        
                        while(foi == true || drop < 0 || drop > 1){
                            System.out.println("\nInsira 1 para equipar o item dropado ou 0 para descartar:");
                            try{
                                drop = Integer.parseInt(in.nextLine().trim());
                                foi = false;
                            }
                            catch(NumberFormatException e){
                                System.out.println("Digite apenas numeros");
                            }
                        }
                        foi = true;
                        if (drop == 1){
                            heroi2.pegarItem(fases.get(i).monstros.get(nf-1).itens.get(rnd));
                            if(fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoAtk() == 0){
                                heroi2.defesa = 1;
                                heroi2.defesa += fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoDef();                                 
                            }
                            if(fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoDef() == 0){
                                heroi2.ataque = 1;
                                heroi2.ataque += fases.get(i).monstros.get(nf-1).itens.get(rnd).getPontoAtk();                                 
                            } 
                            System.out.println("Item equipado.");
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
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("\n/===/ Criação de fases /===/");        
            System.out.println("Insira o numero de fases a serem criadas:");
            try {
                escolhas = Integer.parseInt(in.nextLine().trim());                
                break;
             }
               catch(NumberFormatException e) {
                   System.out.println("Digite apenas numeros");
               }
         }
        int nf = escolhas;
        for(int i= 0; i < nf; i++){
            Fase fase = new Fase();        
            System.out.println("\n/===/ Fase "+ (i+1)+" /===/ ");
            System.out.println("Insira o nome da "+ (i+1+"°") +" fase: ");
            String nomefase = in.nextLine();
            System.out.println("\n/===/ Cadastrar monstros /===/");
            System.out.println("Insira numero de monstros a serem criados:");
            int nm = 0;
            while(true){
                try{
                    nm = Integer.parseInt(in.nextLine().trim());   
                    break;
                }
                catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros");
                }
            }
            for(int j = 0; j < nm; j++){
                Scanner sc = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
                System.out.println("Insira o nome do "+ (j+1+"° "+ "monstro:")); 
                String nome = sc.nextLine();
                System.out.println("Insira a descrição do "+ (j+1+"° "+ "monstro:")); 
                String descricao = sc.nextLine();
                System.out.println("Insira quanto de vida tera o "+ (j+1+"° "+ "monstro:")); 
                int saude = 0;
                while(true){
                    try{
                        saude = Integer.parseInt(in.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                System.out.println("Insira a força do "+ (j+1+"° "+ "monstro:")); 
                int forca = 0;
                while(true){
                    try{
                        forca = Integer.parseInt(in.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                
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
            int saude =0;
            while(true){
                try{
                    saude = Integer.parseInt(ss.nextLine().trim()); 
                    break;
                }
                catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros");
                }
            }
            System.out.println("Insira a força do Boss:");
            int forca = 0;
            while(true){
                try{
                    forca = Integer.parseInt(ss.nextLine().trim()); 
                    break;
                }
                catch(NumberFormatException e){
                    System.out.println("Digite apenas numeros");
                }
            }
            Boss boss = new Boss(nomeboss, descricao, lore, saude, forca);
            fase.addMostro(boss);
            fase.setNome(nomefase);
            System.out.println("\nFase "+ fase.getNome()+" criada com sucesso!");
            fases.add(fase);            
        }           
    }
    public static void criarHeroi(){
        int classe = 0; 
        boolean foi = true;
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
        while(foi == true || classe< 1 || classe > 3){
            try {
               classe = Integer.parseInt(scanNome.nextLine().trim());
               foi = false;
            }
            catch(NumberFormatException e){
                System.out.println("Digite apenas numeros");
            }
        }
        foi = true;
        switch (classe) {
            case 1:
                System.out.println("\n/===/ Status do Heroi /===/");   
                System.out.println("Insira idade do seu personagem: ");
                int idadearq ;
                while(true){
                    try{
                        idadearq = Integer.parseInt(scanClasse.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                System.out.println("Insira a vida do seu personagem: ");
                int saudearq ;
                 while(true){
                    try{
                        saudearq = Integer.parseInt(scanClasse.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                Arqueiro arqueiro = new Arqueiro(nome, idadearq, saudearq);
                heroi2 = arqueiro;
                mostrarStatus();
                break;

            case 2:

                System.out.println("\n/===/ Status do Heroi /===/"); 
                System.out.println("Insira idade do seu personagem: ");
                int idadeguerr;
                while(true){
                    try{
                        idadeguerr = Integer.parseInt(scanClasse.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                System.out.println("Insira a vida do seu personagem: ");
                int saudeguerr;
                while(true){
                    try{
                        saudeguerr = Integer.parseInt(scanClasse.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                Guerreiro guerreiro = new Guerreiro(nome, idadeguerr, saudeguerr);
                heroi2 = guerreiro;
                mostrarStatus();

                break;
            case 3:

                System.out.println("\n/===/ Status do Heroi /===/"); 
                System.out.println("Insira idade do seu personagem: ");
                int idademago = 0;
                while(true){
                    try{
                        idademago = Integer.parseInt(scanClasse.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                System.out.println("Insira a vida do seu personagem: ");
                int saudemago;
                while(true){
                    try{
                        saudemago = Integer.parseInt(scanClasse.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                Mago mago = new Mago(nome, idademago, saudemago);
                heroi2 = mago;
                mostrarStatus();
                break;
            default:
                break;
        }              
    }
    
    public static void comecajogo(){
        for(int i = 0; i <= fases.size(); i++)
            System.out.println("\n/==/ Iniciando fase "+ fases.get(i).getNome()+" ! /==/");
    
    }
    public static void mostraFase(){
        for(int i = 0; i < fases.size(); i++){
            System.out.println("Fase "+ Jogo.fases.get(i).getNome()+ "");
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
            System.out.println("[" + (i+1) + "]"+"Nome: "+fases.get(0).monstros.get(0).itens.get(i).getNomeItens());
            System.out.println("   " +"Ataque: "+ fases.get(0).monstros.get(0).itens.get(i).getPontoAtk());
            System.out.println("   " +"Defesa: " +fases.get(0).monstros.get(0).itens.get(i).getPontoDef());
        }
    }
    public static void excluirItem(int numItem){
        for (int j = 0; j < fases.size(); j++){
            for (int k = 0; k < fases.get(j).monstros.size(); k++){
                fases.get(j).monstros.get(k).itens.remove(numItem-1);
            }
        }   
    }
    public static void editarItem(int item, String nome, int ataque, int def){
    for (int j = 0; j < fases.size(); j++){
            for (int k = 0; k < fases.get(j).monstros.size(); k++){
                fases.get(j).monstros.get(k).itens.get(item-1).nomeItens = nome;
                fases.get(j).monstros.get(k).itens.get(item-1).pontoAtk = ataque;
                fases.get(j).monstros.get(k).itens.get(item-1).pontoDef = def;
            }
        }
    
    }
    public static void menuEditarItem(){
        int opcaoItemedit = 0;
        int quantItemedit = 0;
        int editarItem;
        int ataque;
        int defesa;
        boolean foi = true;
        Scanner inputItem = new Scanner(System.in);

        while(foi == true || opcaoItemedit < 1 || opcaoItemedit > 2){
            System.out.println("Digite 1 para ver os item criados");
            System.out.println("Digite 2 para excluir algum item");
            try{
                opcaoItemedit = Integer.parseInt(inputItem.nextLine().trim()); 
                foi = false;
            }
            catch(NumberFormatException e){
                System.out.println("Digite apenas numeros");
            }
        }
        foi = true;
        switch(opcaoItemedit){
            case 1:
                mostrarItens();
                while(foi == true || opcaoItemedit!= 2 && opcaoItemedit != 0){
                    System.out.println("Caso deseje editar algum item, digite 2, se nao digite 0"); 
                    try{
                        opcaoItemedit =Integer.parseInt(inputItem.nextLine().trim()); 
                        foi = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                if (opcaoItemedit == 0)                    
                    break;
            case 2:
                mostrarItens();
                Scanner in = new Scanner(System.in);

                while(true ){
                    System.out.println("Digite quantos itens quer editar");
                    try{
                        opcaoItemedit =Integer.parseInt(in.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                for(int i =0; i < opcaoItemedit; i++){
                    mostrarItens();
                    System.out.println("Digite o numero do item que queira editar");
                    while(true){
                        try{
                            editarItem =Integer.parseInt(in.nextLine().trim()); 
                            break;
                        }
                        catch(NumberFormatException e){
                            System.out.println("Digite apenas numeros");
                        }
                    }
                    System.out.println("Digite o nome do item: ");
                    String nome = in.next();
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("Digite o novo ataque do item: ");
                    
                    
                    while(true){
                        try{
                            ataque =Integer.parseInt(in2.nextLine().trim()); 
                            break;
                        }
                        catch(NumberFormatException e){
                            System.out.println("Digite apenas numeros");
                        }
                    }
                    System.out.println("Digite a nova defesa do item: ");  
                    while(true){
                        try{
                            defesa =Integer.parseInt(in2.nextLine().trim()); 
                            break;
                        }
                        catch(NumberFormatException e){
                            System.out.println("Digite apenas numeros");
                        }
                    }
                    
                    
                    editarItem(editarItem, nome, ataque, defesa);
                }
                break;
        }
    }
   
    public static void menuExcluirFase(){
        int opcaoFase = 0;
        int excluirFase;
        boolean foi = true;
        Scanner inputFase = new Scanner(System.in);
        
        
        while(foi == true || opcaoFase < 1 || opcaoFase > 2){
            System.out.println("Digite 1 para ver as fases");
            System.out.println("Digite 2 para excluir fase");
            try{
                opcaoFase = Integer.parseInt(inputFase.nextLine().trim()); 
                foi = false;
            }
            catch(NumberFormatException e){
                System.out.println("Digite apenas numeros");
            }
        }
        foi = true;
        switch(opcaoFase){
            case 1:
                for(int f = 0; f < fases.size(); f++){
                System.out.println("Fase"+(f+1)+fases.get(f).getNome());
                }
                break;
            case 2:
                for(int f = 0; f < fases.size(); f++){
                System.out.println("Fase"+(f) +fases.get(f).getNome());
                } 
                System.out.println("Digite a fase que deseja excluir: ");
                
                int excf = inputFase.nextInt();
                fases.remove(excf-1);

        }

    }
    public static void menuEditarFase(){
        int opcaoFase = 0;
        int editFase;
        boolean foi = true;
        Scanner inputFase = new Scanner(System.in);
        
        
        while(foi == true || opcaoFase < 1 || opcaoFase > 2){
            System.out.println("Digite 1 para ver as fases");
            System.out.println("Digite 2 para editar fase");
            try{
                opcaoFase = Integer.parseInt(inputFase.nextLine().trim()); 
                foi = false;
            }
            catch(NumberFormatException e){
                System.out.println("Digite apenas numeros");
            }
        }
        foi = true;
        switch(opcaoFase){
            
            case 1:
                mostraFase();
                break;
            case 2:
                mostraFase();
                System.out.println("Digite a fase para editar: ");
                int editf = inputFase.nextInt();
                System.out.println("Digite o novo nome para a fase: ");
                String nomef = inputFase.next();
                fases.get(editf-1).setNome(nomef);
                break;
                

        }

    
    
    
    
    }
    public static void menuExcluiItem(){
        int opcaoItem = 0;
        int quantItem = 0;
        int excluirItem;
        int editItem;
        boolean foi = true;
        Scanner inputItem = new Scanner(System.in);

        while(foi == true || opcaoItem < 1 || opcaoItem > 2){
            System.out.println("Digite 1 para ver os item criados");
            System.out.println("Digite 2 para excluir algum item");
            try{
                opcaoItem = Integer.parseInt(inputItem.nextLine().trim()); 
                foi = false;
            }
            catch(NumberFormatException e){
                System.out.println("Digite apenas numeros");
            }
        }
        foi = true;
        switch(opcaoItem){
            case 1:
                mostrarItens();
                while(foi == true || opcaoItem!= 2 && opcaoItem != 0){
                    System.out.println("Caso deseje excluir algum item, digite 2, se nao digite 0"); 
                    try{
                        opcaoItem =Integer.parseInt(inputItem.nextLine().trim()); 
                        foi = false;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                if (opcaoItem == 0)                    
                    break;
            
                
            case 2:
                mostrarItens();
                Scanner in2 = new Scanner(System.in);
                
                System.out.println("Digite quantos itens quer excluir");
                    
                while(true ){
                    try{
                        quantItem =Integer.parseInt(in2.nextLine().trim()); 
                        break;
                    }
                    catch(NumberFormatException e){
                        System.out.println("Digite apenas numeros");
                    }
                }
                for(int i =0; i < quantItem; i++){
                    
                    System.out.println("Digite o numero do item que queira excluir");
                    
                    while(true){
                        try{
                            excluirItem =Integer.parseInt(in2.nextLine().trim()); 
                            break;
                        }
                        catch(NumberFormatException e){
                            System.out.println("Digite apenas numeros");
                        }
                    }
                    excluirItem(excluirItem);
                    mostrarItens();
                }
                break;
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
                    opcoesHeroi();
    }      
}
