
import java.io.RandomAccessFile;

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

    Node head, tail;
    int size;

    public MyList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    void traverse() {
        Node p = head;
        while (p != null) {
            System.out.print(p.info);
            p = p.next;
        }
    }

    void ftraverse(RandomAccessFile f) throws Exception {
        Node p = head;
        while (p != null) {
            f.writeBytes(p.info + " ");
            p = p.next;
        }
        f.writeBytes("\r\n");
    }

    void loadData(int k) { // k: là dòng thứ k trong file
        String[] a = Lib.readLineToStrArray("data.txt", k);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(a[i]);
            addLast(number);
        }
    }

    void addFirst(int n) {
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n);
        if (head == null) {
//            head = newNode;
//            tail = newNode;
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
        //------------------------------------------------------------------------------------
    }

    void addLast(int n) {
        //------ Start your code here---------------------------------------------------------
        Node newNode = new Node(n);
        if (head == null) {
            head = tail = newNode;
        } else {
           tail.next = newNode;
           tail = tail.next;
        }
        size++;
        //----------------------------------------------------
    }
}
