/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SackInJava;

/**
 *
 * @author Anand
 */
public class Stack {
    private int[]  array;
    private int top;
    private int capacity;
    
    public Stack(int capacity)
    {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }
    public void push(int item)
    {
       if(isFull())
        {
            throw new RuntimeException("Stack is full");
        }
        array[++top] = item;
    }
    public int pop()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top--];
        
    }
    
    public  int peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is Empty");
        }
        return array[top];
    }

    private boolean isFull() {
return top==capacity-1;        
    }

    private boolean isEmpty() {
        return top==-1;
    }
            
}
