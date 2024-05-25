import java.util.ArrayDeque;
import java.util.*;
public class DequeueInterfaceexample {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(25);
        deque.push(5);

        System.out.println("\n Elements of dequeue - "+deque);
        System.out.println("\n First Element - "+deque.getFirst());
        System.out.println("\n Last Element - "+deque.getLast());
        System.out.println("\n First Element - "+deque.peekFirst());
        System.out.println("\n Last Element - "+deque.peekLast());
        System.out.println("\n Remove first element - "+deque.pop());
        System.out.println("\n Remove one more first element - "+deque.pollFirst());
        System.out.println("\n Remove last element - "+deque.pollLast());
        System.out.println("\n Remove one more first element - "+deque.removeFirst());
        System.out.println("\n Remove one more first element - "+deque.removeLast());
    }

}
