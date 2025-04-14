/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot02_a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tungi
 */
public class Slot02_a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(10);
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get(i));
        }
        
//        list1.remove(0);
//        
//        list1.remove(list1.size()-1);
        
        list1.add(0, -1);
        
        list1.add(list1.size()-1, -100);
        
        list1.indexOf(5); // Vị trí
        
        list1.get(list1.indexOf(5));
        
        // list1....

        System.out.println("Số lượng: "+ list1.size());
    }

}
