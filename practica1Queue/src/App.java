public class App {
    public static void main(String[] args) {
        ArrayQueue<Customer> queue = new ArrayQueue<>();

        
        queue.offer(new Customer(1, "Ana"));
        queue.offer(new Customer(2, "Luis"));
        queue.offer(new Customer(3, "Maya"));
        queue.offer(new Customer(4, "Carlos"));
        queue.offer(new Customer(5, "Sofía"));
        queue.offer(new Customer(6, "Diego"));

        System.out.println("Antes de invertir:");
        queue.print();
        int before = queue.getSize();

        
        reverse(queue);

        System.out.println("Después de invertir:");
        queue.print();
        int after = queue.getSize();

        System.out.println("Elementos antes = " + before + ", elementos después = " + after);
    }

    
    public static <T> void reverse(ArrayQueue<T> queue) {
        ArrayMyStack<T> stack = new ArrayMyStack<>();

        
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
    }
}
