package com.model;

import javax.persistence.*;

@Entity
@Table(name = "hibernate")
public class Student {

    @Id
    @GeneratedValue
    private  int id;

    @Column(name = "student_marks")
    private double marks;

    @Column(name = "student_name")
    private String name;


    public  Student(){
        super();
    }

    public Student(double marks, int id) {
        this.marks = marks;
        this.id = id;
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMarks(double v) {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName(String aaadi) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
