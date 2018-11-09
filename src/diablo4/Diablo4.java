package diablo4;

import java.util.Scanner;

public class Diablo4 {

    public static void main(String[] args) {            
        
    /** MENU **/
        
        int opcao = 0;
        Scanner start = new Scanner(System.in);          
        System.out.println("Diablo 4");
        System.out.println("Digite 1 para iniciar o jogo.");     

        try {
           opcao = Integer.parseInt(start.nextLine().trim());
         }
        
        catch(NumberFormatException e) {} 
        
        while (opcao != 1) {
           System.out.println("Digite 1 para iniciar o jogo."); 
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }

    /** CRIACAO CHARACTER **/
         
        int classe = 0; 
        Scanner scanNome= new Scanner(System.in);   
        System.out.println("Qual o seu nome?");
        String nome = scanNome.nextLine();
        Character character1 = new Character(nome); 
        
        System.out.println("Olá " + nome + ".");
        System.out.println("Escolha sua classe.");
        System.out.println("1 - Arqueiro - (Chance de perfurar inimigo, -hp)");
        System.out.println("2 - Guerreiro - (Chance de bloquear dano recebido, +hp)");
        System.out.println("3 - Arqueiro - (Chance de congelar inimigo, -hp)");
        
        Scanner scanClasse = new Scanner(System.in); 
        
        try {
           classe = Integer.parseInt(start.nextLine().trim());
           Classes classe1 = new Classes(classe); 
         }
        
        catch(NumberFormatException e) {} 
        
        while (classe < 1 && classe > 2) {
           System.out.println("Digite 1, 2 ou 3 para escolha."); 
           try {
                classe = Integer.parseInt(start.nextLine().trim());
                Classes classe1 = new Classes(classe); 
         }
           catch(NumberFormatException e) {}
         }             
       
         //Classes.escolhaClasse(classe);     
    
    }    
}
