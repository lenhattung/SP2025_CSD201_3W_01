
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Main {
    public static void main(String[] args) {
        MyList t = new MyList();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of list: ");
        int size = sc.nextInt();
        
        t.loadData(size);
        
        // test f1
        t.f1();
    }
}
