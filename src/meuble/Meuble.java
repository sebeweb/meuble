/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuble;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastien-javary
 */
public abstract class Meuble {
    List<Element> e;
    abstract int getHeight();
    abstract String getName();

    public static void main(String[] args) {
        Meuble table = new Table();
        Meuble arm = new Armoire();
        ArrayList<Meuble> meubles = new ArrayList<>();
        meubles.add(arm);
        meubles.add(table);
        for (Meuble meuble : meubles) {
            System.out.println(meuble.getName()+" hauteur : "+meuble.getHeight()+" cm");
        }
        
    }

}
