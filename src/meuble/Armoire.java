/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuble;

/**
 *
 * @author sebastien-javary
 */
public class Armoire extends Meuble{
    public String couleur;
    public String name;
    public int pieds;
    public int hauteur;

    Armoire() {
        this.name = "KVIKNE";
        this.couleur = "red";
        this.pieds = 4;
        this.hauteur = 110;
    }

    @Override
    int getHeight() {
        return hauteur;
    }

    @Override
    String getName() {
        return name;
    }
    
    
}
