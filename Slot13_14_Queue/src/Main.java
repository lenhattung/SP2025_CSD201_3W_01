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
        mq.enqueue(10);
        mq.enqueue(8);
        mq.enqueue(4);
        System.out.println("-----");
        mq.display();
        mq.dequeue();
        System.out.println("-----");
        mq.display();
        mq.front();
        System.out.println("-----");
        mq.display();
    }
}
