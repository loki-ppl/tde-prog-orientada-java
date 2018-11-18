package diablo4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Random;
public class Diablo4 {

    public static void main(String[] args) throws InterruptedException {            
        
    /** MENU **/
    /** TESTE GIT 1 **/
  
        int opcao = 0;
        boolean faseCriada = false;
        boolean itensCriados = false;
        
        Scanner start = new Scanner(System.in);          
        System.out.println("Diablo 4");
        System.out.println("\n/===/ Menu /===/");
        System.out.println("Digite 1 para iniciar o jogo default.");
        System.out.println("Digite 2 para criar fases.");  
        
        try {
           opcao = Integer.parseInt(start.nextLine().trim());
        }        
        catch(NumberFormatException e) {} 
        
        while (opcao < 1 || opcao > 2) {
           System.out.println("\n/===/ Menu /===/");
           System.out.println("Digite 1 para iniciar o jogo default."); 
           System.out.println("Digite 2 para criar fases.");            
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }
                 
         switch (opcao) {
            case 1:  
                System.out.println("Iniciar jogo pronto"); 
                break;
            case 2:      
                Jogo.criarFase();
                Jogo.criarItem();
                Jogo.criarHeroi();                
                faseCriada = true;
                itensCriados = true;
                break;
            }       
        
    if (faseCriada == true || itensCriados == true){
        System.out.println("Digite 1 para iniciar o jogo."); 
        }
    while(Jogo.heroi2.saude> 0){
     Jogo.opcoesHeroi();
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
     //Jogo.mostraMonstro();
     //Jogo.mostraBoss();
     Jogo.opcaoAtacar();     
    }  
  
}

             
