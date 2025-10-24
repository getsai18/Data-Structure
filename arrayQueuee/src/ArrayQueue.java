public class ArrayQueue<T> implements IQueue<Object> {
    private Object[] data;
    private int rear;// indice de inserción.
    private int front;
    private int size;

    private static final int INITIAL_CAPACITY = 10;// CONSTANTE PARA EL TAMANIO INICIAL

    public ArrayQueue() {
        this.data = new Object[INITIAL_CAPACITY];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    @Override
    public void offer(Object element) {
        data[rear] = element;
        rear = (rear + 1) % data.length;// recalcula rear, pero evita que se desborde al llegar al limite.
        size++;
    }

    @Override
    public Object poll() {
        if (isEmpty()) {
            System.out.println("La fila esta vacia");
            return null;
        }
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return result;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            System.out.println("Queue esta vacia");
            return null;
        }
        return data[front];
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }


    private void expandCpacity(){
        Object[] newArr = new  Object[data.length * 2];
        for(int i = 0; i < size; i++){
            newArr[i] = data[ (front + 1) % data.length ];
        }
        //reiniciamos los valores del arreglo para poder seguier utilizandolos
        front = 0;//pone el frente en la primera posicion
        data = newArr;//asignada el nuevo arreglo al atributo data
        rear = size;//incice de la siguiendo insercicion
    }





    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            if (i > 0)
                sb.append("->");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

}
