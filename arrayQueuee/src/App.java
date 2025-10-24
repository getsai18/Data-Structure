public class App {
    public static void main(String[] args) throws Exception {
        ArrayQueue <Character> custoQueue = new ArrayQueue<>();
        custoQueue.print();
        custoQueue.offer('A');
        custoQueue.offer('B');
        custoQueue.poll();
        custoQueue.print();
        custoQueue.offer('C');
        custoQueue.offer('D');
        custoQueue.offer('E');
        custoQueue.offer('F');
        System.out.println("-----------------------");
        custoQueue.print();
        System.out.println("El primero en la fila es: "+custoQueue.peek());
    }
}
