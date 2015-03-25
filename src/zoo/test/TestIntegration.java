/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo.test;

import animaux.Animal;
import animaux.Box;
import animaux.Lezard;
import animaux.Loup;
import animaux.Porc;
import animaux.Vache;
import animaux.Zoo;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author sgoyet
 */

public class TestIntegration extends TestCase {
@Test
    public void testIntegration() {
        System.out.println("Test iuntegration");
        Loup loup = new Loup();
        boolean jaiUnLoup = false;
        boolean jaiUneVache = false;
        boolean jaiUnLezard = false;
        boolean jaiUnPorc = false;
        for (Box box : Zoo.boxes) {
            for (Animal animal : box.getAnimaux()) {
                jaiUnLoup = jaiUnLoup || animal instanceof Loup;
                jaiUneVache = jaiUneVache || animal instanceof Vache;
                jaiUnLezard = jaiUnLezard || animal instanceof Lezard;
                jaiUnPorc = jaiUnPorc || animal instanceof Porc;
                for (Animal animal1 : box.getAnimaux()) {
                    if (!animal.equals(animal1)) {
                        assertFalse(animal1.mange(animal));
                    }
                }
            }
        }
        assertTrue(jaiUnLoup);
        assertTrue(jaiUneVache);
        assertTrue(jaiUnPorc);
        assertTrue(jaiUnLezard);
        assertTrue(Zoo.boxes.size() == 3);
    }

}
