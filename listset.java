import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
public class listset {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("one string");
        l1.add(220);
        l1.add("one string");
        l1.add(220);
        System.out.println("Output of list--"+l1);


        Set l2 = new HashSet();
        l2.add("one string");
        l2.add(220);
        l2.add("one string");
        l2.add(220);
        l2.add(new String("Hello"));
        System.out.println("Output of Set--"+l2);
        
        
    }
}
