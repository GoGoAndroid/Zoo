/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaux;

import java.util.List;

/**
 *
 * @author sgoyet
 */
public class Zoo {
    public static List<Box> boxes;
    
    public void addBox(Box box){
        boxes.add(new Box());
        boxes.add(new Box());
        boxes.add(new Box());
    }
}
