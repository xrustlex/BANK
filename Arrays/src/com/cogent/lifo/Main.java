/**
 * 
 */
package com.cogent.lifo;

import java.util.*;  
  
class Main {  
    // Pushing element on the top of the stack  
    static void Push(Stack<Integer> s)  
    {  
        for (int i = 0; i < 5; i++) {  
            s.push(i);  
        }  
    }  
  
    // Popping element from the top of the stack  
    static void Pop(Stack<Integer> s)  
    {  
        System.out.println("Pop :");  
  
        for (int i = 0; i < 5; i++) {  
            Integer x = (Integer)s.pop();  
            System.out.println(x);  
        }  
    }  
  
    // Displaying element on the top of the stack  
    static void Peek(Stack<Integer> s)  
    {  
        Integer info = (Integer)s.peek();  
        System.out.println("Element on the top of the stack is : " + info);  
    }  
  
    // Searching element in the stack  
    static void Search(Stack<Integer> stack, int data)  
    {  
        Integer pos = (Integer)stack.search(data);  
  
        if (pos == -1)                 // Checking the underflow condition of the stack //  
            System.out.println("Element not found");  
        else  
            System.out.println("Element is found at position " + pos);  
    }  
  
    public static void main(String[] args)  
    {  
        Stack<Integer> stack = new Stack<Integer>();  
  
        Push(stack);  
        Pop(stack);  
        Push(stack);  
        Peek(stack);  
        Search(stack, 1);  
        Search(stack, 7);  
    }  
}  