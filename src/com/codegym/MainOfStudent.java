package com.codegym;

public class MainOfStudent {
    public static void main(String[] args) {
        Student student1=new Student(111,"Hoang");
        Student student2=new Student(222,"Cuong");
        Student student3=new Student(333,"Chinh");
        student2.change();
        student1.display();
        student2.display();
        student3.display();
    }
}
