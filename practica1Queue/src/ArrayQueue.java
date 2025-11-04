public class ArrayQueue<T> implements IQueue<T> {
    private Object[] data;
    private int rear;
    private int front;
    private int size;

    private static final int INITIAL_CAPACITY = 10;

    public ArrayQueue() {
        this.data = new Object[INITIAL_CAPACITY];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    @Override
    public void offer(T element) {
        if (size == data.length) {
            expandCapacity();
        }
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    @Override
    public T poll() {
        if (isEmpty()) {
            System.out.println("La fila está vacía");
            return null;
        }
        @SuppressWarnings("unchecked")
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return result;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue está vacía");
            return null;
        }
        @SuppressWarnings("unchecked")
        T result = (T) data[front];
        return result;
    }

    @Override
    public void clear() {
        data = new Object[INITIAL_CAPACITY];
        front = 0;
        rear = 0;
        size = 0;
    }

    private void expandCapacity() {
        Object[] newArr = new Object[data.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = data[(front + i) % data.length];
        }
        front = 0;
        rear = size;
        data = newArr;
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i > 0)
                sb.append(", ");
            sb.append(data[(front + i) % data.length]);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }
}
