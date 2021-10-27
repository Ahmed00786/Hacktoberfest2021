/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure;

import java.util.Stack;

public class StackCollection {
    Stack<Integer> st;
    public StackCollection(Stack<Integer> st){
        this.st = st;
    }
    public void push(int value) {
        System.out.println(value + " pushed");
        st.push(value);
    }

    public void pop() {
        System.out.println(st.pop());
    }

    public void printStack() {
        System.out.println(st.hashCode());
        for (int el : st) {
            System.out.println(el);
        }
    }

    public void peek() {
        System.out.println(st.peek());
    }

    public void search(int value) {
        int index = st.search(value);
        if (index == -1) {
            System.out.println(value + " isn't available");
        } else {
            System.out.println(value + " is at " + index + " index");
        }
    }
}

class MainStack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        StackCollection ob = new StackCollection(st);
        ob.push(5);
        ob.push(3);
        ob.push(7);
        ob.push(1);
        st.pop();
        System.out.println("popped from main class");
        System.out.println(st.hashCode());
        ob.printStack();
        ob.search(3);
        ob.search(4);
        ob.pop();
        ob.pop();
        ob.peek();
    }
}
