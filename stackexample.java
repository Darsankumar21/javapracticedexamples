import java.util.PriorityQueue;
import java.util.Queue;
//fifo-- queue
public class stackexample {
    public static void main(String[] args) {
            Queue queue = new PriorityQueue();// interface
            queue.offer(10);
            queue.offer(20);
            queue.offer(30);
            queue.offer(40);

            System.out.println("\n Queue elements are - "+queue);
            System.out.println("\n Head element - "+queue.element());
            System.out.println("\n Head elements again - "+queue.peek());
            queue.remove();
            System.out.println("\nElements after head removal - "+queue);
            queue.poll();
            System.out.println("\n Elements after one more head removal  - "+queue);

            
    }
}
