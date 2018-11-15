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
    
    public static void criarFase(){
        Fase fase = new Fase();                
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
                fase.addMostro(monstroNormal);
                for(int cont =0; cont < fase.monstros.size(); cont++){
                    System.out.println(fase.monstros.get(cont).nome);
                
                }
                    
                
            Scanner ss = new Scanner(System.in);
            System.out.println("cadastrar boss");
            System.out.println("Digite o nome do boss ");
            String boss = ss.next();
            }
        }                                                
    }
    
    
}
