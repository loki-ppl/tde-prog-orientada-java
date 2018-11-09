package diablo4;

import java.util.Scanner;

public class Diablo4 {

    public static void main(String[] args) {            
        
    /** MENU **/
        
        int opcao = 0;
        Scanner start = new Scanner(System.in);          
        System.out.println("Diablo 4");
        System.out.println("Digite 1 para iniciar o jogo.");
        System.out.println("Digite 2 para criar fases.");  

        try {
           opcao = Integer.parseInt(start.nextLine().trim());
         }
        
        catch(NumberFormatException e) {} 
        
        while (opcao < 1 && opcao > 2) {
           System.out.println("Digite 1 para iniciar o jogo."); 
           System.out.println("Digite 2 para criar fases.");  
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }

    /** CRIACAO CHARACTER **/
         
        int classe = 0; 
        Scanner scanNome = new Scanner(System.in);   
        System.out.println("Qual o seu nome?");
        String nome = scanNome.nextLine();
        Character character1 = new Character(nome); 
        
        System.out.println("Olá " + nome + ".");
        System.out.println("Escolha sua classe.");
        System.out.println("1 - Arqueiro - (Chance de perfurar inimigo, -hp)");
        System.out.println("2 - Guerreiro - (Chance de bloquear dano recebido, +hp)");
        System.out.println("3 - Mago - (Chance de congelar inimigo, -hp)");
        
        Scanner scanClasse = new Scanner(System.in); 
        
        try {
           classe = Integer.parseInt(start.nextLine().trim());    
            switch (classe) {
                case 1:
                    Arqueiro arqueiro1 = new Arqueiro();
                    arqueiro1.setNome(nome);
                    arqueiro1.setLevel(1);
                    arqueiro1.setMoeda(0);
                    arqueiro1.setSaude(50);
                    arqueiro1.setIdade(18);
                    System.out.println("/==/ Status /==/");
                    System.out.println("Nome: "+ arqueiro1.getNome());
                    System.out.println("Level: "+ arqueiro1.getLevel());
                    System.out.println("Moedas: "+ arqueiro1.getMoeda());
                    System.out.println("Saude: "+ arqueiro1.getSaude());
                    System.out.println("Idade: "+ arqueiro1.getIdade());
                    break;
                case 2:
                    Guerreiro guerreiro1 = new Guerreiro();
                    guerreiro1.setNome(nome);
                    guerreiro1.setNome(nome);
                    guerreiro1.setLevel(1);
                    guerreiro1.setMoeda(0);
                    guerreiro1.setSaude(80);
                    guerreiro1.setIdade(18);
                    System.out.println("/==/ Status /==/");
                    System.out.println("Nome: "+ guerreiro1.getNome());
                    System.out.println("Level: "+ guerreiro1.getLevel());
                    System.out.println("Moedas: "+ guerreiro1.getMoeda());
                    System.out.println("Saude: "+ guerreiro1.getSaude());
                    System.out.println("Idade: "+ guerreiro1.getIdade());
                    break;
                case 3:
                    Mago mago1 = new Mago();
                    mago1.setNome(nome);
                    mago1.setLevel(1);
                    mago1.setMoeda(0);
                    mago1.setSaude(50);
                    mago1.setIdade(18);
                    System.out.println("/==/ Status /==/");
                    System.out.println("Nome: "+ mago1.getNome());
                    System.out.println("Level: "+ mago1.getLevel());
                    System.out.println("Moedas: "+ mago1.getMoeda());
                    System.out.println("Saude: "+ mago1.getSaude());
                    System.out.println("Idade: "+ mago1.getIdade());
                    break;
                default:
                    break;
            }
         }
        
        catch(NumberFormatException e) {}       
    
    }    
}
