package com.Sachin.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(5);
        

        stack.push(34);
        stack.push(4);
        stack.push(44);
        stack.push(24);
        stack.push(14);
        stack.push(77);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
