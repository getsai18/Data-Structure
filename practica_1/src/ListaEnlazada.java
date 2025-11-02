public class ListaEnlazada {
    Node head;
    Node headPar;
    Node headImpar;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void printList(Node head) {
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node current = head;

        while (current != null) {
            if (current != head) {
                System.out.print(" -> ");
            }
            System.out.print(current.getData());
            current = current.next;
        }
        System.out.println(" -> " + current);
    }


    public void imprimirListas(){
        System.out.println("Lista original");
        printList(head);
        System.out.println("Lista ordenada con numeros pares");
        printList(headPar);
        System.out.println("Lista ordenada con numeros impares");
        printList(headImpar);

    }



    public void ordenarLista() {
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }

        Node current = head;
        Node currentPar = headPar;
        Node currentImpar = headImpar;

        while (current != null) {
            Node newNode = new Node(current.getData());

            if (newNode.getData() % 2 == 0) {

                if (headPar == null) {
                    headPar = newNode;
                    currentPar = headPar;
                }else{
                    currentPar.next = newNode;
                    currentPar = currentPar.next;
                }

            }else{
                if(headImpar == null){
                    headImpar = newNode;
                    currentImpar = headImpar;
                }else{
                    currentImpar.next = newNode;
                    currentImpar = currentImpar.next;
                }
            }

            // final
            current = current.next;
        }
    }
}
