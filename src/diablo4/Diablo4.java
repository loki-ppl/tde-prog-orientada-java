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
                JogoTeste.mostraMonstrosCriados();
                JogoTeste.mostrarStatus();   
                JogoTeste.opcoesHeroiteste();
                System.exit(0);
                break;
            case 2:  
                Scanner ina = new Scanner(System.in);
                while (faseCriada == false || opcoesadm < 0 || opcoesadm > 9) {
                    System.out.println("\n/===/ Menu ADM /===/");
                    System.out.println("Digite 1 para criar fases."); 
                    System.out.println("Digite 2 para criar itens.");
                    System.out.println("Digite 3 para excluir itens.");
                    System.out.println("Digite 4 para excluir fases."); 
                    System.out.println("Digite 5 para editar  itens.");
                    System.out.println("Digite 6 para editar fases.");
                    System.out.println("Digite 7 para criar monstros.");
                    System.out.println("Digite 8 para editar monstros.");
                    System.out.println("Digite 9 para excluir monstros.");
                    System.out.println("Digite 0 para iniciar o jogo.");
                    try {
                    opcoesadm = Integer.parseInt(ina.nextLine().trim());
                        }
                    catch(NumberFormatException e) {}
                         
                    if(opcoesadm == 1){Jogo.criarFase();faseCriada=true; Jogo.criarItensDefault(); itensCriados=true;}
                    if(opcoesadm != 1){System.out.println("Voce primeiro precisa criar uma fase para acessar essa opção.");}
                }               

                while (faseCriada == true || itensCriados == true){
                    System.out.println("\n/===/ Menu ADM /===/");
                    System.out.println("Digite 1 para criar fases."); 
                    System.out.println("Digite 2 para criar itens.");
                    System.out.println("Digite 3 para excluir itens.");
                    System.out.println("Digite 4 para excluir fases."); 
                    System.out.println("Digite 5 para editar  itens.");
                    System.out.println("Digite 6 para editar fases.");
                    System.out.println("Digite 7 para criar monstros.");
                    System.out.println("Digite 8 para editar monstros.");
                    System.out.println("Digite 9 para excluir monstros.");
                    System.out.println("Digite 0 para iniciar o jogo.");
                     try {
                    opcoesadm = Integer.parseInt(ina.nextLine().trim());
                        }
                    catch(NumberFormatException e) {}
                        
                    if(opcoesadm == 1){Jogo.criarFase();}
                    if(opcoesadm == 2){Jogo.criarItem();}
                    if(opcoesadm == 3){Jogo.menuExcluiItem();}
                    if(opcoesadm == 4){
                        if(Jogo.fases.size()==1){ 
                            System.out.println("Voce nao pode excluir sua unica fase!"); continue;}
                    Jogo.menuExcluirFase();
                    }
                    if(opcoesadm == 5){Jogo.menuEditarItem();}
                    if(opcoesadm == 6){}   
                    if(opcoesadm == 7){}
                    if(opcoesadm == 8){}
                    if(opcoesadm == 9){}   
                    if(opcoesadm == 0){     
                        Jogo.criarHeroi();
                        Jogo.opcoesHeroi();
                    }
                 }              
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

             
