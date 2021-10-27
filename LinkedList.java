/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Irfan
 */
public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertFirst(int data){
        if(head == null){
            head = new Node(data);
        }
        else{
            Node n = new Node(data);
            n.next = head;
            head = n;
        }
    }
    public void insert(int data) {
        //check if list is empty
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = new Node(data);
        }
    }
    
    public void printList(){
        Node n = head;
        if(n==null){
            System.out.println("List is empty");
        }
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list  = new LinkedList();
        list.printList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        
        list.insertFirst(9);
        list.insertFirst(10);
        list.printList();
        
    }
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//
//        Node ref1 = head;
//        while (ref1 != null) {
//            System.out.println(ref1.data);
//            ref1 = ref1.next;
//        }
//
//        Node nHead;
//        Node n1 = new Node(3);
//        nHead = n1;
//        Node n2 = new Node(4);
//        nHead.next = n2;
//        Node n3 = new Node(5);
//        n2.next = n3;
//
//        Node ref = nHead;
//        while (ref != null) {
//            System.out.println(ref.data);
//            ref = ref.next;
//        }

//    }
}
