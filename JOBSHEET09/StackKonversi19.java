package JOBSHEET09;

public class StackKonversi19 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi19(int size) {
        this.size = size;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            return -1;
        }
    }
}