
import java.io.File;
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
public class StudentStack {

    Node top;

    public StudentStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void clear() {
        this.top = null;
    }

    void ftraverse(RandomAccessFile f) throws Exception {
        Node p = top;
        while (p != null) {
            f.writeBytes(p.info.toString()); // write data in the node p to the file f
            p = p.next;
        }

        f.writeBytes("\r\n");
    }

    void loadData(int k) {
        String[] a = Lib.readLineToStrArray("data.txt", k);
        String[] b = Lib.readLineToStrArray("data.txt", k + 1);
        String[] c = Lib.readLineToStrArray("data.txt", k + 2);
        String[] d = Lib.readLineToStrArray("data.txt", k + 3);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int age = Integer.parseInt(c[i]);
            double gpa = Double.parseDouble(d[i]);
            push(a[i], b[i], age, gpa);
        }
    }

    public void push(String id, String name, int age, double gpa) {

    }

    public Student pop() {
        return null;
    }

    public Student peek() {
        return null;
    }

    // f1: Load data from file and display all students
    void f1() throws Exception {
        clear();
        loadData(0);
        String fname = "f1.txt";
        File g123 = new File(fname);
        if (g123.exists()) {
            g123.delete();
        }
        RandomAccessFile f = new RandomAccessFile(fname, "rw");
        ftraverse(f);
        f.close();
    }

    // f2: Add a new student from console input
    void f2() throws Exception {

    }

    // f3: Calculate average GPA of all students
    void f3() throws Exception {

    }
}
