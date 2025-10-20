public class App {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();

        lista.add(5);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(3);
        lista.add(9);

        System.out.println("Antes de eliminar duplicados:");
        lista.printList();

        lista.eliminarDuplicados();

        System.out.println("Después de eliminar duplicados:");
        lista.printList();
    }
}
