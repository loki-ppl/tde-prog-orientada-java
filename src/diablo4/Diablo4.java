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
        int opcaoItem = 0;
        int quantItem;
        int excluirItem;
        boolean faseCriada = false;
        boolean itensCriados = false;
        
        //Item.listaItensProntos();
        
        Scanner start = new Scanner(System.in);     
        Scanner inputItem = new Scanner(System.in); 
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
                System.out.println("Iniciando jogo pronto"); 
                JogoTeste.heroiCriado();
                JogoTeste.faseCriada();
                JogoTeste.criarItemTeste();
                JogoTeste.mostrarStatus();
                JogoTeste.mostraMonstrosCriados();
                JogoTeste.opcoesHeroiteste();
                System.exit(0);
                break;
            case 2:      
                Jogo.criarFase();
                Jogo.criarItem();
                switch(opcaoItem){
                    case 1:
                        Jogo.mostrarItens();
                        System.out.println("Caso deseje excluir algum item, digite 2, se nao digite 0"); 
                        opcaoItem = inputItem.nextInt();
                        if (opcaoItem == 0)
                            break;
                    case 2:
                        Jogo.mostrarItens();
                        System.out.println("Digite quantos itens quer excluir");
                        quantItem = inputItem.nextInt();
                        for(int i =0; i < quantItem; i++){
                            Jogo.mostrarItens();
                            System.out.println("Digite o numero do item que queira excluir");
                            excluirItem = inputItem.nextInt();
                            Jogo.excluirItem(excluirItem);
                        }
                        break;
                }
                Jogo.criarHeroi();
                faseCriada = true;
                itensCriados = true;
                break;
            }       
        
    if (faseCriada == true || itensCriados == true){
        //System.out.println("Digite 1 para iniciar o jogo."); 
        }
    
     Jogo.opcoesHeroi();
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

             
