/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student that) {
        //return this.id-that.id;
        return Integer.compare(this.id, that.id);
    }

    @Override
    public String toString() {
        return this.id+"-"+this.getName()+"-"+this.id;
    }
    
    
}
