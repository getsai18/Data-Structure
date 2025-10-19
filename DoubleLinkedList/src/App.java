public class App {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList list= new DoubleLinkedList();
        

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Lista original:");
        list.printForward();

        list.remove(10);
        list.printForward();

        list.remove(30);
        list.printForward();

        list.remove(40);
        list.printForward();

        list.remove(100);
        
    }
}
