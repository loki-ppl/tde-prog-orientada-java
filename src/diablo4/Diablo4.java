/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.Scanner;

public class Diablo4 {

    public static void main(String[] args) throws InterruptedException {            
        
    /** MENU **/
    /** TESTE GIT 1 **/
  
        int opcao = 0;
        int opcoesadm = 0;
        int opcaoItem = 0;
        int quantItem;
        int excluirItem;
        boolean faseCriada = false;
        boolean itensCriados = false;
        boolean monstrosCriado = false;
        
        //Item.listaItensProntos();
        
        Scanner start = new Scanner(System.in);     
        Scanner inputItem = new Scanner(System.in);         
        System.out.println("#### Diablo 4 ####");
        
        while (opcao < 1 || opcao > 2) {
           System.out.println("\n/===/ Menu /===/");
           System.out.println("Digite 1 para iniciar o jogo default."); 
           System.out.println("Digite 2 para opcoes Administrador.");            
           try {
                opcao = Integer.parseInt(start.nextLine().trim());
         }
           catch(NumberFormatException e) {}
         }                 
         switch (opcao) {
            case 1:
                System.out.println("Iniciando jogo pronto..."); 
                JogoTeste.heroiCriado();
                JogoTeste.faseCriada();
                JogoTeste.criarItemTeste();
                JogoTeste.mostrarStatus();
                JogoTeste.mostraMonstrosCriados();
                JogoTeste.opcoesHeroiteste();
                System.exit(0);
                break;
            case 2:  
                Scanner ina = new Scanner(System.in);
                while (faseCriada == false || opcoesadm < 0 || opcoesadm > 3) {
                    System.out.println("\n/===/ Menu ADM /===/");
                    System.out.println("Digite 1 para criar fases."); 
                    System.out.println("Digite 2 para criar itens.");
                    System.out.println("Digite 3 para excluir itens.");
                    System.out.println("Digite 0 para iniciar o jogo.");
                    try {
                    opcoesadm = Integer.parseInt(ina.nextLine().trim());
                        }
                    catch(NumberFormatException e) {}
                         
                    if(opcoesadm == 1){Jogo.criarFase();faseCriada=true;}
                    if(opcoesadm != 1){System.out.println("Voce primeiro precisa criar uma fase para acessar esse menu.");}
                }                
                while (faseCriada == true || itensCriados == false){
                    System.out.println("\n/===/ Menu ADM /===/");
                    System.out.println("Digite 1 para criar fases."); 
                    System.out.println("Digite 2 para criar itens.");
                    System.out.println("Digite 3 para excluir itens.");
                    System.out.println("Digite 0 para iniciar o jogo.");
                     try {
                    opcoesadm = Integer.parseInt(ina.nextLine().trim());
                        }
                    catch(NumberFormatException e) {}                        
                    if(opcoesadm == 1){Jogo.criarFase();}
                    if(opcoesadm == 2){Jogo.criarItem(); itensCriados=true;}
                    if(opcoesadm == 3){ System.out.println("Voce primeiro precisa criar itens para cessar esse menu.");} 
                    if(opcoesadm == 0){     
                        Jogo.criarHeroi();
                        Jogo.opcoesHeroi();
                    }
                    } 
                while (faseCriada == true || itensCriados == true){
                    System.out.println("\n/===/ Menu ADM /===/");
                    System.out.println("Digite 1 para criar fases."); 
                    System.out.println("Digite 2 para criar itens.");
                    System.out.println("Digite 3 para excluir itens.");     
                    System.out.println("Digite 0 para iniciar o jogo.");
                     try {
                    opcoesadm = Integer.parseInt(ina.nextLine().trim());
                        }
                    catch(NumberFormatException e) {}
                        
                    if(opcoesadm == 1){Jogo.criarFase();}
                    if(opcoesadm == 2){Jogo.criarItem();}
                    if(opcoesadm == 3){Jogo.menuExcluiItem();}     
                    if(opcoesadm == 0){     
                        Jogo.criarHeroi();
                        Jogo.opcoesHeroi();
                    }
                 }              

                itensCriados = true;
                break;
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
       
    }  
  
}

             
