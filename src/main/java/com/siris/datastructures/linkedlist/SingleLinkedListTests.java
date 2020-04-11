package com.siris.datastructures.linkedlist;

public class SingleLinkedListTests {
    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.createLinkedList(5);
        list.traverseLinkedList();

        System.out.println();
        list.insertIntoLinkedList(10, 1);
        list.traverseLinkedList();

        System.out.println();
        list.insertIntoLinkedList(60, 1);
        list.traverseLinkedList();

        System.out.println();
        list.insertIntoLinkedList(20, 2);
        list.traverseLinkedList();

        System.out.println();
        list.insertIntoLinkedList(30, 2);
        list.traverseLinkedList();

        System.out.println();
        list.insertIntoLinkedList(40, 1);
        list.traverseLinkedList();

        System.out.println();
        list.traverseLinkedList();
        System.out.println();


        System.out.println("\nSearching the node having value 40...");
        list.searchNodeInLinkedList(40);

        System.out.println("\nSearching the node having value 500...");
        list.searchNodeInLinkedList(500);


        System.out.println("\n\nDeleting the node having location = 0: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(0);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();

        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(2);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();


        System.out.println("\n\nDeleting the node having location = 100: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(100);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();


        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(2);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();

        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(1);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();

        System.out.println("\n\nDeleting the node having location = 2: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(2);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();

        System.out.println("\n\nDeleting when list is empty = 2: ");
        System.out.println("Before Deletion:");
        list.traverseLinkedList();
        list.deleteNodeFromLinkedList(2);
        System.out.println("After Deletion:");
        list.traverseLinkedList();
        System.out.println();

        list.deleteLinkedList();
        list.traverseLinkedList();
    }
    }
