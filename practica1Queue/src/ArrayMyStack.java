public class ArrayMyStack<T> {
    private Object[] data;
    private int top;

    public ArrayMyStack() {
        this(50);
    }

    public ArrayMyStack(int capacity) {
        data = new Object[capacity];
        top = 0;
    }

    public void push(T value) {
        if (top == data.length) {
            System.out.println("Stack lleno");
            return;
        }
        data[top++] = value;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
