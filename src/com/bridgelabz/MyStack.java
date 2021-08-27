package com.bridgelabz;

public class MyStack {
    Node head;
    Node tail;
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node tempNode = head;
            head= newNode;
            head.next = tempNode;
        }
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        }else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }
    public void insertAt(int index, int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void pop(){
        if (head != null)
            head = head.next;
    }
    public void search(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                System.out.println("element is found " +temp.data);
                break;
            }
            temp= temp.next;
        }
    }
    public void popLast(){
        Node temp = head;
        while (temp.next!= null){
            tail = temp;
            temp = temp.next;
        }
        tail.next = null;
    }

    public void display(){
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
}
