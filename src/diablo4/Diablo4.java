package diablo4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Diablo4 {

    public static void main(String[] args) throws InterruptedException {            
        
    /** MENU **/
    /** TESTE GIT 1 **/
    /*meu cu alado na moral quero morrer porra so me fodo aqui vou morrer */
    
        
        int opcao = 0;
        Scanner start = new Scanner(System.in);          
        System.out.println("Diablo 4");
        System.out.println("Digite 1 para iniciar o jogo.");
        System.out.println("Digite 2 para criar fases.");  

        try {
           opcao = Integer.parseInt(start.nextLine().trim());
         }
        
        catch(NumberFormatException e) {} 
        
        while (opcao < 1 || opcao > 2) {
           System.out.println("Digite 1 para iniciar o jogo."); 
           System.out.println("Digite 2 para criar fases.");  
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }
        /** criar classe **/
        if (opcao == 2){
           Scanner in = new Scanner(System.in);
           System.out.println("Insira o numero de fases");
           int nf = in.nextInt();
           for(int i= 0; i < nf; i++){
               
               System.out.println("Fase "+ (i+1));
               System.out.println("cadastrar mosntro");
               System.out.println("Insira numero de monstros");
               int nm = in.nextInt();
                for(int j = 0; j < nm; j++){
                Scanner sc = new Scanner(System.in);
                Scanner input = new Scanner(System.in);
                    System.out.println("Insira o "+ (j+1+"° "+ "monstro")); 
                    String nome = sc.next();
                    System.out.println("Insira a descrição do "+ (j+1+"° "+ "monstro")); 
                    String descricao = sc.next();
                    System.out.println("Insira a quanto de vida tera "+ (j+1+"° "+ "monstro")); 
                    int saude = input.nextInt();
                    System.out.println("Insira a força do "+ (j+1+"° "+ "monstro")); 
                    int forca = input.nextInt();
                    MonstroN monstroNormal = new MonstroN(nome,descricao, saude, forca);
                    
                    
                }
                Scanner ss = new Scanner(System.in);
              System.out.println("cadastrar boss");
               System.out.println("Digite o nome do boss ");
               String boss = ss.next();
                                                        }
              

               }
              
               
           
            
            
            
        
      
    /** CRIACAO CHARACTER **/
       /**
        int classe; 
        Scanner scanNome = new Scanner(System.in);   
        System.out.println("Qual o seu nome?");
        String nome = scanNome.nextLine();
        
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
                    arqueiro1.setNomeClasse("Arqueiro");
                    arqueiro1.setLevel(1);
                    arqueiro1.setMoeda(0);
                    arqueiro1.setSaude(50);
                    arqueiro1.setIdade(18);
                    System.out.println("/==/ Status /==/");
                    System.out.println("Nome: " + arqueiro1.getNome());
                    System.out.println("Classe:" + arqueiro1.getNomeClasse());
                    System.out.println("Level: " + arqueiro1.getLevel());
                    System.out.println("Moedas: " + arqueiro1.getMoeda());
                    System.out.println("Saude: " + arqueiro1.getSaude());
                    System.out.println("Idade: " + arqueiro1.getIdade());
                    break;
                case 2:
                    Guerreiro guerreiro1 = new Guerreiro();
                    guerreiro1.setNome(nome);
                    guerreiro1.setNomeClasse("Guerreiro");
                    guerreiro1.setLevel(1);
                    guerreiro1.setMoeda(0);
                    guerreiro1.setSaude(80);
                    guerreiro1.setIdade(18);
                    System.out.println("/==/ Status /==/");
                    System.out.println("Nome: "+ guerreiro1.getNome());
                    System.out.println("Classe:"+ guerreiro1.getNomeClasse());
                    System.out.println("Level: "+ guerreiro1.getLevel());
                    System.out.println("Moedas: "+ guerreiro1.getMoeda());
                    System.out.println("Saude: "+ guerreiro1.getSaude());
                    System.out.println("Idade: "+ guerreiro1.getIdade());
                    break;
                case 3:
                    Mago mago1 = new Mago();
                    mago1.setNome(nome);
                    mago1.setNomeClasse("Mago");
                    mago1.setLevel(1);
                    mago1.setMoeda(0);
                    mago1.setSaude(50);
                    mago1.setIdade(18);
                    System.out.println("/==/ Status /==/");
                    System.out.println("Nome: "+ mago1.getNome());
                    System.out.println("Classe:"+ mago1.getNomeClasse());
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
    
     /** INICIANDO JOGO **/

     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 5");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 4");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 3");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 2");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 1");
     TimeUnit.SECONDS.sleep(1);
     
     /** INICIANDO JOGO **/
     System.out.println("Digite 1 para ir a fase (variavel fase)");
     System.out.println("Digite 2 para abrir o inventario.");
     System.out.println("Digite 3 para mostrar status.");
    }  
  
}
