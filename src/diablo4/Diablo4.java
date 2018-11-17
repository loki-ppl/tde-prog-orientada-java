package diablo4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Diablo4 {

    public static void main(String[] args) throws InterruptedException {            
        
    /** MENU **/
    /** TESTE GIT 1 **/
    /*meu cu alado na moral quero morrer porra so me fodo aqui vou morrer */
    
        
        int opcao = 0;
        boolean faseCriada = false;
        Scanner start = new Scanner(System.in);          
        System.out.println("Diablo 4");
        System.out.println("\n/===/ Menu /===/");
        System.out.println("Digite 1 para iniciar o jogo.");
        System.out.println("Digite 2 para criar fases.");  

        try {
           opcao = Integer.parseInt(start.nextLine().trim());
        }        
        catch(NumberFormatException e) {} 
        
        while (opcao < 1 || opcao > 2) {
           System.out.println("\n/===/ Menu /===/");
           System.out.println("Digite 1 para iniciar o jogo."); 
           System.out.println("Digite 2 para criar fases.");  
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }
                 
         switch (opcao) {
            case 1:  
                System.out.println("iniciar jogo pronto"); 
                break;
            case 2:      
                Jogo.criarFase();
                Jogo.criarHeroi();
                faseCriada = true;
                break;
            }       
        
        if (faseCriada == true){
           while (opcao != 1) {
           System.out.println("\n/===/ Menu /===/");
           System.out.println("Digite 1 para iniciar o jogo."); 
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }
        }
     
     // INICIANDO JOGO 
     /*TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 5");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 4");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 3");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 2");
     TimeUnit.SECONDS.sleep(1);
     System.out.println("Iniciando jogo em 1");
     TimeUnit.SECONDS.sleep(1);*/
     
     //Jogo.comecajogo();
     //Jogo.mostraFase();
     Jogo.mostraMonstro();
     Jogo.mostraBoss();
     Jogo.opcaoAtacar();
     
    }  
  
}

             
