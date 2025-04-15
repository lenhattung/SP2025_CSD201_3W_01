
import java.util.Random;
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
public class MyList {

    Node head;

    public MyList() {
        this.head = null;
    }

    public boolean isEmpty() {
//        if (this.head == null)
//            return true;
//        else
//            return false;

        return this.head == null;
    }

    public void clear() {
        this.head = null;
    }

    public void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info);
            System.out.print(" ");
            p = p.next;
        }
    }

    void loadData(int k) {
        Random generator = new Random();
        for (int i = 0; i < k; i++) {
            int number = generator.nextInt(1000) + 1;
            // add into list
            addLast(number);
        }
    }

    public void addFirst(int n) {
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n);
        // addFirst
        newNode.next = head;
        head = newNode;

        //------ End your code here-----------------------------------------------------------
    }

    public void addLast(int n) {
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n);
        // addLast
        // Case 1: if list is empty, make the new node as head
        if (head == null) {
            head = newNode;
            return;
        }
        // Case 2: if list is not empty
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        // add the new node at the end
        last.next = newNode;
        //------ End your code here-----------------------------------------------------------
    }

    void f1() {
        System.out.println("Linked List: ");
        this.traverse();
    }

    // f2: nhap du lieu mot con so tu ban phim => addLast
    void f2() {
        System.out.println("Before: ");
        this.traverse();
        //------ Start your code here---------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to add at the end:");
        int value = sc.nextInt();
        addLast(value);
        //------ End your code here-----------------------------------------------------------
        System.out.println("After: ");
        this.traverse();
    }

    // f3: ham addPos ==> them node vao vi tri thu k, 
    // trong do node moi va chi so k duoc nhap tu ban phim
    void f3() {
        System.out.println("Before: ");
        this.traverse();
        //------ Start your code here---------------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to add at the end:");
        int value = sc.nextInt();
        System.out.println("Enter position k (0-based index): ");
        int k = sc.nextInt();
        
        //  ...
        //------ End your code here-----------------------------------------------------------
        System.out.println("After: ");
        this.traverse();
    }
}
