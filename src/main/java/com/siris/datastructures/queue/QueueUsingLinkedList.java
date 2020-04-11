package com.siris.datastructures.queue;

import com.siris.datastructures.linkedlist.SingleLinkedList;

public class QueueUsingLinkedList {

    SingleLinkedList list = null;

    public QueueUsingLinkedList() {
        list = new SingleLinkedList();
    }

    public void enQueue(int value) {
        if (list.getHead() == null) {
            list.createLinkedList(value);
        } else {
            list.insertIntoLinkedList(value, list.getSize()+1);
        }
        list.traverseLinkedList();
    }

    public int deQueue() {
        int value = -1;
        if (!isEmpty()) {
            value = list.getHead().getValue();
            list.deleteNodeFromLinkedList(0);
        } else {
            System.out.println("Queue is empty.");
        }
        return value;
    }

    public int peek() {
        int value = -1;
        if (!isEmpty()) {
            value = list.getHead().getValue();
        } else {
            System.out.println("Queue is empty.");
        }
        return value;
    }

    public boolean isEmpty() {
        return list.getHead() == null;
    }

    public void deleteQueue() {
        list.deleteLinkedList();
    }
}
