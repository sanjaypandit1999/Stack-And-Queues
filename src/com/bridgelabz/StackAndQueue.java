package com.bridgelabz;

public class StackAndQueue {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.peak();
        stack.pop();
        stack.peak();
        stack.display();

    }
}
