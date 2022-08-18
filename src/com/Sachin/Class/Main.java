package com.Sachin.Class;

class Student{
    int rNo;
    String name;
    int age;

    void insert(int r, String n, int a) {
        rNo = r;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(rNo + " " + name + " " + age);
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.insert(1, "Sachin", 19);
        s1.display();

    }

}
