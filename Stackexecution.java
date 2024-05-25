import java.util.*;
// FILO

public class Stackexecution {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        // animals.push("Dog");
        // animals.push("Dog");
        System.out.println("Initial stack: "+animals);
        String element = animals.pop();
        System.out.println("Removed element: "+element);

        element = animals.peek();
        System.out.println("Element at top: "+element);

        int position = animals.search("Horse");
        System.out.println("position of Horse "+position);
    }
}
