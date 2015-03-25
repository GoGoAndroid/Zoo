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
public abstract class Animal {
    public static String HEBIVORE ="herbivore";
    public static String CARNIVORE ="carnivore";
    public static String ONIVORE ="omnivore";
    
    public static String MAMIFERE ="mamifere";
      public static String REPILE ="mamifere";
    
    
    String regime;
    String genre;

    public abstract boolean mange(Animal animaux);

    public  String getRegime(){return regime;}
   public  String getGenre(){return genre;}
   
    
    

    public void show() {
        System.out.println( " Genre " + genre + " Régime " + regime);
    }

}
