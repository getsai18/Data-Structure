public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList list= new DoubleLinkedList();
        list.printForward();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.printForward();
        System.out.println("---imprimir backward---");
        list.printBackward();
    }
}
