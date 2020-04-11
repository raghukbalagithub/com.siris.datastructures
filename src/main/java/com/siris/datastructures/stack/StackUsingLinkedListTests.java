package com.siris.datastructures.stack;

public class StackUsingLinkedListTests {
    public static void main(String[] args) {

        StackUsingLinkedList stack = new StackUsingLinkedList();
        int pushCount = 0;

        System.out.println("Pushing 10 values into stack");
        for (int i = 1; i <= 10; i++) {
            stack.push(i * 10);
            pushCount++;
        }
        System.out.println();

        System.out.println("Peeking value");
        System.out.println(stack.peek());
        System.out.println();

        stack.push(110);
        pushCount++;

        stack.push(120);
        pushCount++;

        System.out.println("Poping 11 values from stack");
        for (int i = 1; i <= pushCount; i++) {
            System.out.println(stack.pop());
        }
        System.out.println();

        stack.deleteStack();
        System.out.println();

        System.out.println("peeking value after delete: " +stack.peek());
        System.out.println("poping a value after delete: " +stack.pop());
        System.out.println("inserting a value 30 after delete.");
        stack.push(30);
        System.out.println("poping a value after delete: " +stack.pop());
    }
}
