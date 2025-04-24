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

    }

    void preOrder(Node p) {

    }

    void inOrder(Node p) {

    }

    void postOrder(Node p) {

    }

    public Student findStudentById(int id) {

    }

    public double getAverageGPA() {

    }
}
