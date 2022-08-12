package com.Sachin.Searching;

public class Demo {
    public static void main(String[] args) {
//        Scanner press = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int rollno = press.nextInt();
//        System.out.println("Your roll no is " + rollno);

        int salary = 30000;
        if(salary>100000) {
            System.out.print("You will get a bonus : ");
            salary = salary + 20000;
        }else {
            System.out.println("you will not get a bonus : ");
            salary = salary + 2000;
        }
        System.out.print( salary);
    }
}
