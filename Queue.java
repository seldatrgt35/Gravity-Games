package playy;

public class Queue {
    private int rear, front;
    private Object[] elements;

    public Queue(int capacity) {
        elements = new Object[capacity];
        rear = -1;
        front = 0;
    }


    public void enqueue(Object data) {
        rear = (rear + 1) % elements.length;
        elements[rear] = data;
    }

    public Object dequeue() {
        Object data = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        return data;
    }

    public Object peek() {
       Object data = elements[front];
       return data;
    }

    public boolean isEmpty() {
      if (elements[front] == null) return true;
      else return false;
    }

    public boolean isFull() {
        if (front == ( rear + 1) % elements.length &&
        elements[front] != null &&
        elements[rear] != null) return true;
        else return false;
    }

    public int size() {
        if (elements[front] == null) {
            return 0;
        }
        else {
            if (rear >= front)
                return rear - front + 1;
            else
                return elements.length - (front - rear) + 1;
        }
    }



}