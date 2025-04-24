/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class StudentBST {

    Node root;

    public StudentBST() {
        this.root = null;
    }

    public void load() {
        insert(20, "Alice", 3.8);
        insert(10, "Bob", 3.5);
        insert(30, "Charlie", 3.9);
        insert(5, "David", 3.2);
        insert(15, "Eva", 3.7);
        insert(25, "Frank", 3.6);
        insert(35, "Grace", 4.0);
        insert(100, "Henry", 3.4);
    }

    public void insert(int id, String name, double gpa) {
        Student st = new Student(id, name, gpa);
        root = insertRec(root, st);
    }

    private Node insertRec(Node p, Student st) {
        if (p == null) {
            p = new Node(st);
        } else if (st.getId() < p.info.getId()) {
            p.left = insertRec(p.left, st);
        } else if (st.getId() > p.info.getId()) {
            p.right = insertRec(p.right, st);
        }
        return p;
    }

    public void visit(Node p) {
        System.out.println(p.info);
    }

    void preOrder(Node p) {
        if (p == null) {
            return;
        } else {
            visit(p);
            preOrder(p.left);
            preOrder(p.right);
        }
    }

    void inOrder(Node p) {
        if (p == null) {
            return;
        } else {
            inOrder(p.left);
            visit(p);
            inOrder(p.right);
        }
    }

    void postOrder(Node p) {
        if (p == null) {
            return;
        } else {
            postOrder(p.left);
            postOrder(p.right);
            visit(p);
        }
    }

    public Student findStudentById(int id) {
        return findStudentById2(root, id);
    }

    public Student findStudentById2(Node p, int id) {
        if (p == null) {
            return null; // Không tìm thấy
        }
        if (p.info.getId() == id) {
            return p.info;
        }
        if (id < p.info.getId()) {
            return findStudentById2(p.left, id);
        } else {
            return findStudentById2(p.right, id);
        }
    }

    private int countNodes(Node p) {
        if (p == null) {
            return 0;
        }

        return 1 + countNodes(p.left) + countNodes(p.right);
    }

    private double sumGPA(Node p) {
        if (p == null) {
            return 0;
        }

        return p.info.getGpa() + sumGPA(p.left) + sumGPA(p.right);
    }

    public double getAverageGPA() {
        double sum = sumGPA(root);
        double count = countNodes(root);
        return (count > 0) ? (sum / count) : 0;
    }

    // f1 - test insert
    public void f1() {
        System.out.println("Students after insertion:");
        inOrder(root);
    }

    // f2 - count students/nodes
    public int f2() {
        return countNodes(root);
    }

    // f3 - sum of GPAs
    public double f3() {
        return getAverageGPA();
    }

    // f4 - pre-order traversal
    public void f4() {
        preOrder(root);
    }

    // f5 - in-order traversal
    public void f5() {
        inOrder(root);
    }

    // f6 - post-order traversal
    public void f6() {
        postOrder(root);
    }

    // f7 - find student by ID
    public Student f7(int id) {
        return findStudentById(id);
    }
}
