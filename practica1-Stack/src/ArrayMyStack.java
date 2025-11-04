public class ArrayMyStack<T> implements MyStack<T> {
    Object[] data;
    int top;

    public ArrayMyStack(){
        this(50);
    }

    public ArrayMyStack(int Inicializacion){
        data = new Object[Inicializacion];
        top = 0;
    }

    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("Pila vacia");
            return;
        }
       
        for(int i = 0; i < top; i++){
            data[i] = null;
        }
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            System.out.println("Lista vacia");
            return null;
        }

        return  (T) data[top - 1];
    }


    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("Lista vacia");
            return null;
        }

        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @Override
    public void printList() {
        if(isEmpty()){
            System.out.println("Lista vacia");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i = top - 1; i >= 0; i--){
            sb.append(data[i]);
            if(i!=0) sb.append(" -> ");
        }
        sb.append("]");
        System.out.println(sb.toString());
        
    }

    @Override
public void push(T data) {
    if (top == this.data.length) {
        Object[] nuevo = new Object[this.data.length * 2];
        System.arraycopy(this.data, 0, nuevo, 0, this.data.length);
        this.data = nuevo;
    }
    this.data[top++] = data;
}

    @Override
    public int size() {
        return top;
    }

    
}
