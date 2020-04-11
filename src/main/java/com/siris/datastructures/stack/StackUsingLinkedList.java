package com.siris.datastructures.stack;

import com.siris.datastructures.linkedlist.SingleLinkedList;

import javax.sound.midi.SysexMessage;

public class StackUsingLinkedList {

    SingleLinkedList list = null;

    public StackUsingLinkedList() {
        list = new SingleLinkedList();
    }

    public void push(int value) {
        if (list.getHead() == null) {
            list.createLinkedList(value);
        } else {
            list.insertIntoLinkedList(value, 1);
        }
    }

    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = list.getHead().getValue();
            list.deleteNodeFromLinkedList(1);
        } else {
            System.out.println("Stack is empty.");
        }
        return value;
    }

    public int peek() {
        int value = -1;
        if(!isEmpty()) {
            value =  list.getHead().getValue();
        } else {
            System.out.println("Stack is empty");
        }
        return value;
    }

    public boolean isEmpty() {
        return list.getHead() == null;
    }

    public void deleteStack() {
        list.deleteLinkedList();
        System.out.println("Stack is deleted");
    }
}
