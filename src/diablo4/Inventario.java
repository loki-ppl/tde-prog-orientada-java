/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diablo4;

import java.util.ArrayList;

/**
 *
 * @author augusto.coelho
 */
public class Inventario {
    static ArrayList<Item> itensDefesa;
    static ArrayList<Item> itensAtaque;
    
    public static void addItem(Item item){
        if (item.getIdItem()% 2 == 0){
            itensDefesa.add(item);
        }
        else{
            itensAtaque.add(item);
        }
    }
    public static void removeItem(Item item){
         if (item.getIdItem()% 2 == 0){
            itensDefesa.remove(item);
        }
         else{
            itensAtaque.remove(item);
        }
    }
    
}
