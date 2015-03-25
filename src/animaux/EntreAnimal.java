/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

/**
 *
 * @author sgoyet
 */
public abstract class EntreAnimal {
    public Animal animal;
    public Box box;
    
    public abstract void entre(Animal animal, Box box);
    public Box getBox(){return box;}
    public Animal getnimal(){return animal;}  
    
}
