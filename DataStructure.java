/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

/**
 *
 * @author Irfan
 */
public class DataStructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack stack = new Stack(5);
        stack.pop();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.push(2);
        stack.push(1);
        stack.push(7);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.pop();
    }

}

class Stack {

    int arr[];
    int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int item) {
        System.out.println("Push: " + item);
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = item;
            System.out.println(item + " pushed");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int temp = arr[top];
            top--;
            System.out.println(temp + " popped");
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int temp = arr[top];
            System.out.println("Peek: " + temp);
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("----------------------------------");
            System.out.println("Stack");

            for (int i = top; i > 0; i--) {
                System.out.println(arr[i]);

            }
            System.out.println("----------------------------------");

        }
    }

}
