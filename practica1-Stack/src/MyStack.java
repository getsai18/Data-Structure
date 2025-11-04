public interface MyStack <T> {
    void push(T data);
    T pop();
    T peek();
    void clear();
    void printList();
    int size();
    boolean  isEmpty();
}
