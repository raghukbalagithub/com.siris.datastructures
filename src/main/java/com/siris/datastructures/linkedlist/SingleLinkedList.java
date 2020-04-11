package com.siris.datastructures.linkedlist;

public class SingleLinkedList {

    private SingleNode head;
    private SingleNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode createLinkedList(int value) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(null);

        System.out.println("Creating the LinkedList");

        this.head = this.tail = node;
        this.setSize(1);

        return head;
    }

    public void insertIntoLinkedList(int value, int location) {
        if (existsLinkedList()) {
            SingleNode node = new SingleNode();
            node.setValue(value);
            node.setNext(null);

            if (location <= 1) {
                System.out.println("Inserting at 1st location");
                node.setNext(head);
                head = node;
            } else if (location > this.getSize()) {
                System.out.println("Inserting at last location");
                tail.setNext(node);
                tail = node;
            } else {
                //traverse to the location-1 position and insert
                System.out.println("Traversing till " +(location-1) +" position");
                SingleNode tmpNode = head;
                int loc = 1;
                while (loc < (location - 1)) {
                    tmpNode = tmpNode.getNext();
                    loc++;
                }
                node.setNext(tmpNode.next);
                tmpNode.setNext(node);
            }
            this.setSize(this.getSize()+1);
        } else {
            System.out.println("LinkedList doesn't exists.");
        }
    }

    public void traverseLinkedList() {
        if(existsLinkedList()) {
            SingleNode tmpNode = head;
            do {
                System.out.print(tmpNode.value +" --> ");
                tmpNode = tmpNode.getNext();
            }while(tmpNode != null);
        } else {
            System.out.println("LinkedList doesn't exist");
        }
    }

    public boolean searchNodeInLinkedList(int value) {
        if(existsLinkedList()) {
            SingleNode tmpNode = head;
            do {
                if (tmpNode.value == value) {
                    System.out.print(tmpNode.value +" --> Found ");
                    return true;
                }
                tmpNode = tmpNode.getNext();
            }while(tmpNode != null);
        } else {
            System.out.println("LinkedList doesn't exist");
            return false;
        }
        System.out.println(value +" -- Not Found");
        return false;
    }

    public void deleteNodeFromLinkedList(int location) {
        if (existsLinkedList()) {
            if (location <=1) {
                head = head.getNext();
                this.setSize(this.getSize()-1);
                if(this.getSize() == 0) {
                    tail = null;
                }
            } else if (location > this.getSize()) {
                SingleNode tmpNode = head;
                int loc = 1;
                while (loc < (this.getSize()-1)) {
                    tmpNode = tmpNode.getNext();
                    loc++;
                }
                tmpNode.setNext(null);
                tail = tmpNode;
                this.setSize(this.getSize()-1);
            } else {
                //traverse to the location-1 position
                System.out.println("Traversing till " +(location-1) +" position");
                SingleNode tmpNode = head;
                int loc = 1;
                while (loc < (location-1)) {
                    tmpNode = tmpNode.getNext();
                    loc++;
                }
                tmpNode.setNext(tmpNode.getNext().getNext());
                this.setSize(this.getSize()-1);
            }
        } else {
            System.out.println("LinkedList doesn't exist");
        }
    }

    public void deleteLinkedList() {
        System.out.println("Deleting Linked List...");
        head = null;
        tail = null;
    }

    public boolean existsLinkedList() {
        if (head != null) {
            return true;
        }
        return false;
    }
}
