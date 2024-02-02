package playy;

public class Stack {
    private int top;
    private Object[] elements;
    public Stack(int capacity){
        elements = new Object[capacity];
        top = -1;
    }

    public boolean isFull() {
        return top + 1 == elements.length;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(Object data) {
        if(isFull());
            //System.out.println("classes.Stack Overflow");
        else {
            top++;
            elements[top] = data;
        }
    }

    public Object pop() {
        if(isEmpty()) {
            // System.out.println("classes.Stack is Empty");
            return null;
        }
        else{
            Object returnData = elements[top];
            elements[top] = null;
            top--;
            return returnData;
        }
    }

    public Object peek() {
        if(isEmpty()) {
            // System.out.println("classes.Stack is Empty");
            return null;
        }
        else{
            return elements[top] ;
        }
    }



}