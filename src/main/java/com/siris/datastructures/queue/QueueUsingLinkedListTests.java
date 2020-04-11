package com.siris.datastructures.queue;

public class QueueUsingLinkedListTests {
    public static void main(String[] args) {

        System.out.println("Creating a queue");
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        System.out.println("Enqueuing 6 values into queue");
        for(int i=1 ; i<=6; i++) {
            queue.enQueue(i*10);
        }
        System.out.println();

        System.out.println("Peeking value");
        System.out.println(queue.peek());
        System.out.println();

        System.out.println("Dequeuing 6 values into queue");
        for(int i=0; i<6; i++) {
            System.out.println(queue.deQueue());
        }

    }
}
