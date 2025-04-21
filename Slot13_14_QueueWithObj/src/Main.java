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
        MyQueue mq = new MyQueue();
        
        // Create and enqueue several students
        mq.enqueue("S001", "Nguyen Van A", 20, 3.5);
        mq.enqueue("S002", "Tran Thi B", 21, 3.8);
        mq.enqueue("S003", "Le Van C", 19, 3.2);
        mq.enqueue("S004", "Pham Thi D", 22, 3.9);
        mq.enqueue("S005", "Hoang Van E", 20, 3.6);

        System.out.println("All students in the queue:");
        mq.display();

        // Find student with highest GPA 
    }
}
