/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;
import java.util.ArrayList;
/**
 *
 * @author Cliente
 */
public class Fase{
    public static ArrayList<Monstro> monstros = new ArrayList();
    
    public static void addMostro(Monstro monstro){
        monstros.add(monstro);
    }
    
    
}
