package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college="Vinh University";

    Student(int r,String name){
        this.rollno=r;
        this.name=name;
    }
    void change(){
        college="BUON BA University";
    }
    void display(){
        System.out.println("Rollno: "+rollno+", Name: "+name+", College: "+college);
    }
}
