
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
    
    void loadData(int k){ // k: là dòng thứ k trong file
        String[] a = Lib.readLineToStrArray("data.txt", k);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(a[i]);
            // addLast
        }
    }
    
    void addFirst(int n){
        
    }
    
    void addLast(int n){
        
    }
}
