/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author augusto.coelho
 */
public final class Jogo {
    static ArrayList<Fase> fases = new ArrayList<Fase>();
    
    public static void criarItem(){}
    
    public static void opcaoAtacar(){
        Scanner in = new Scanner(System.in);
        System.out.println("\n/===/ Atacar /===/");  
        System.out.println("Insira o numero do monstro que deseja atacar:"); 
        int nf = in.nextInt();
        if (nf == 0){            
        System.out.println(("Voce atacou o Boss "+fases.get(nf-1).monstros.get(fases.get(nf-1).monstros.size()-1).nome)+"!"); 
        // System.out.println("Atacou e aplicou " + guerreiro.getAtaque()+" de dano!");
        System.out.println("Atacou e aplicou 1 de dano!");
        System.out.println("Saude restante do Boss: "+fases.get(nf-1).monstros.get(fases.get(nf-1).monstros.size()-1).saude);  
        }
        System.out.println(("Voce atacou o monstro "+Jogo.fases.get(0).monstros.get(nf-1).nome)+"!"); 
       // System.out.println("Atacou e aplicou " + guerreiro.getAtaque()+" de dano!");
        System.out.println("Atacou e aplicou 1 de dano!");
        System.out.println("Saude restante do monstro: "+Jogo.fases.get(0).monstros.get(nf-1).saude);  
    }    
    
    public static void criarFase(){
              
        Scanner in = new Scanner(System.in);
        System.out.println("\n/===/ Criação de fases /===/");        
        System.out.println("Insira o numero de fases a serem criadas:");
        int nf = in.nextInt();
        for(int i= 0; i < nf; i++){
            Fase fase = new Fase();        
            System.out.println("\n/===/ Fase "+ (i+1)+" /===/ ");
            System.out.println("Insira o nome da "+ (i+1+"°") +" fase: ");
            String nomefase = in.next();
            System.out.println("\n/===/ Cadastrar monstros /===/");
            System.out.println("Insira numero de monstros a serem criados:");
            int nm = in.nextInt();
            for(int j = 0; j < nm; j++){
                Scanner sc = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
                System.out.println("Insira o nome do "+ (j+1+"° "+ "monstro:")); 
                String nome = sc.next();
                System.out.println("Insira a descrição do "+ (j+1+"° "+ "monstro:")); 
                String descricao = sc.next();
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
            String nomeboss = ss.next();
            System.out.println("Insira a descrição do Boss:");
            String descricao = ss.next();
            System.out.println("Insira a lore do Boss:");
            String lore = ss.next();
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
                    
                    System.out.println("\n/==/ Status Gerais /==/");
                    System.out.println("Classe: Arqueiro");
                    System.out.println("Nome: " + arqueiro.getNome());
                    System.out.println("Idade: " + arqueiro.getIdade());
                    System.out.println("Saude: " + arqueiro.getSaude());
                    System.out.println("Level: " + arqueiro.getLevel());
                    System.out.println("Ataque: " + arqueiro.getAtaque());
                    System.out.println("Defesa: " + arqueiro.getDefesa());
                    System.out.println("Moedas: " + arqueiro.getMoeda());
                    break;
                    
                case 2:
                    System.out.println("\n/===/ Status do Heroi /===/"); 
                    System.out.println("Insira idade do seu personagem: ");
                    int idadeguerr = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudeguerr = scanClasse.nextInt();
                    Guerreiro guerreiro = new Guerreiro(nome, idadeguerr, saudeguerr);
                    
                    System.out.println("\n/==/ Status Gerais /==/");
                    System.out.println("Classe: Guerreiro");
                    System.out.println("Nome: " + guerreiro.getNome());
                    System.out.println("Idade: " + guerreiro.getIdade());
                    System.out.println("Saude: " + guerreiro.getSaude());
                    System.out.println("Level: " + guerreiro.getLevel());
                    System.out.println("Ataque: " + guerreiro.getAtaque());
                    System.out.println("Defesa: " + guerreiro.getDefesa());
                    System.out.println("Moedas: " + guerreiro.getMoeda());
                    break;
                case 3:
                    
                    System.out.println("\n/===/ Status do Heroi /===/"); 
                    System.out.println("Insira idade do seu personagem: ");
                    int idademago = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudemago = scanClasse.nextInt();
                    Mago mago = new Mago(nome, idademago, saudemago);
                    
                    System.out.println("\n/==/ Status Gerais /==/");
                    System.out.println("Classe: Mago");
                    System.out.println("Nome: " + mago.getNome());
                    System.out.println("Idade: " + mago.getIdade());
                    System.out.println("Saude: " + mago.getSaude());
                    System.out.println("Level: " + mago.getLevel());
                    System.out.println("Ataque: " + mago.getAtaque());
                    System.out.println("Defesa: " + mago.getDefesa());
                    System.out.println("Moedas: " + mago.getMoeda());
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
    public static void mostraMonstro(){
        for(int i = 0; i < fases.size(); i++){
            System.out.println("\n/==/ Monstros da fase "+(i+1)+" /==/");
            for(int j = 0; j < Jogo.fases.get(i).monstros.size()-1; j++){
                System.out.println(Jogo.fases.get(i).monstros.get(j).nome+" - Digite"+(i+1)+" para atacar.");
            }
        }
    }
    public static void mostraBoss(){
    for(int i = 0; i < fases.size(); i++){
            System.out.println("/==/ Boss da fase "+(i+1)+" /==/");
            System.out.println(fases.get(i).monstros.get(fases.get(i).monstros.size()-1).nome+" - Digite 0 para atacar.");
            
    }    
      
    
    }
}
