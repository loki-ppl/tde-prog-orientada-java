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
    
    public static void criarFase(){
              
        Scanner in = new Scanner(System.in);
        System.out.println("Insira o numero de fases");
        int nf = in.nextInt();
        for(int i= 0; i < nf; i++){
            Fase fase = new Fase();        
            System.out.println("/===/ Fase "+ (i+1)+" /===/ ");
            System.out.println("Insira o nome da "+ (i+1+"°") +" fase: ");
            String nomefase = in.next();
            System.out.println("/===/ Cadastrar monstros /===/");
            System.out.println("Insira numero de monstros:");
            int nm = in.nextInt();
            for(int j = 0; j < nm; j++){
                Scanner sc = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
                System.out.println("Insira o nome do "+ (j+1+"° "+ "monstro:")); 
                String nome = sc.next();
                System.out.println("Insira a descrição do "+ (j+1+"° "+ "monstro:")); 
                String descricao = sc.next();
                System.out.println("Insira quanto de vida tera "+ (j+1+"° "+ "monstro:")); 
                int saude = input.nextInt();
                System.out.println("Insira a força do "+ (j+1+"° "+ "monstro:")); 
                int forca = input.nextInt();
                
                MonstroN monstroNormal = new MonstroN(nome,descricao, saude, forca);
                fase.addMostro(monstroNormal);
     
            }   
            Scanner ss = new Scanner(System.in);
            System.out.println("/===/ Cadastrar Boss /===/ ");
            System.out.println("Insira o nome do Boss:");
            String nomeboss = ss.next();
            System.out.println("Insira a descrição do Boss:");
            String descricao = ss.next();
            System.out.println("Insira a lore do Boss");
            String lore = ss.next();
            System.out.println("Insira quanto de vida tera o Boss:");
            int saude = ss.nextInt();
            System.out.println("Insira a força do Boss:");
            int forca = ss.nextInt();
            Boss boss = new Boss(nomeboss, descricao, lore, saude, forca);
            fase.addMostro(boss);
            fase.setNome(nomefase);
            fases.add(fase);
            System.out.println("Fase "+ fase.getNome()+" criada com sucesso!");
        }   
        
    }
    public static void criarHeroi(){
        int classe; 
        Scanner scanNome = new Scanner(System.in);   
        System.out.println("Qual o seu nome?");
        String nome = scanNome.nextLine();
        
        System.out.println("Olá " + nome + ".");
        System.out.println("Escolha sua classe.");
        System.out.println("1 - Arqueiro - (Chance de perfurar inimigo)");
        System.out.println("2 - Guerreiro - (Chance de bloquear dano recebido)");
        System.out.println("3 - Mago - (Chance de congelar inimigo");
        
        Scanner scanClasse = new Scanner(System.in); 
        
        try {
           classe = Integer.parseInt(scanNome.nextLine().trim());    
            switch (classe) {
                case 1:
                    System.out.println("Insira idade do seu personagem: ");
                    int idadearq = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudearq = scanClasse.nextInt();
                    Arqueiro arqueiro = new Arqueiro(nome, idadearq, saudearq);
                    
                    System.out.println("/==/ Status /==/");
                    System.out.println("Classe: Arqueiro");
                    System.out.println("Nome: " + arqueiro.getNome());
                    System.out.println("Idade: " + arqueiro.getIdade());
                    System.out.println("Saude: " + arqueiro.getSaude());
                    System.out.println("Level: " + arqueiro.getLevel());
                    System.out.println("Moedas: " + arqueiro.getMoeda());
                    break;
                    
                case 2:
                    
                     System.out.println("Insira idade do seu personagem: ");
                    int idadeguerr = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudeguerr = scanClasse.nextInt();
                    Guerreiro guerreiro = new Guerreiro(nome, idadeguerr, saudeguerr);
                    
                    System.out.println("/==/ Status /==/");
                    System.out.println("Classe: Guerreiro");
                    System.out.println("Nome: " + guerreiro.getNome());
                    System.out.println("Idade: " + guerreiro.getIdade());
                    System.out.println("Saude: " + guerreiro.getSaude());
                    System.out.println("Level: " + guerreiro.getLevel());
                    System.out.println("Moedas: " + guerreiro.getMoeda());
                    break;
                case 3:
                    
                    
                    System.out.println("Insira idade do seu personagem: ");
                    int idademago = scanClasse.nextInt();
                    System.out.println("Insira a vida do seu personagem: ");
                    int saudemago = scanClasse.nextInt();
                    Mago mago = new Mago(nome, idademago, saudemago);
                    
                    System.out.println("/==/ Status /==/");
                    System.out.println("Classe: Mago");
                    System.out.println("Nome: " + mago.getNome());
                    System.out.println("Idade: " + mago.getIdade());
                    System.out.println("Saude: " + mago.getSaude());
                    System.out.println("Level: " + mago.getLevel());
                    System.out.println("Moedas: " + mago.getMoeda());
                    break;
                default:
                    break;
            }
         }
       
        catch(NumberFormatException e) {}    
    
    }
    
    public static void comecajogo(){
    
    }
    
}
