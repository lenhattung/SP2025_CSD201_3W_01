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
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(10);
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list1.get(i));
        }
        
        list1.remove(0);
        
        list1.remove(list1.size()-1);

        System.out.println("Số lượng: "+ list1.size());
    }

}
