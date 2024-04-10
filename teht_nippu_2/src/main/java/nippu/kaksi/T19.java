package nippu.kaksi;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class T19<T> {
    int top;
    ArrayList<T> stack;

    public T19(int size) {
        stack = new ArrayList<>(size);
        this.top = -1;
    }

    public int size() {
        return this.stack.size();
    }

    public void push(T value) {
        this.stack.add(++top, value);
    }

    public T pop() {
        if (this.top == -1) {
            throw new EmptyStackException();
        }
        T removed = this.stack.remove(top--);
        System.out.println("Value: " + removed + " removed");
        return removed;
    }

    public boolean isEmpty() {
        return (this.top < 0);
    }
}
