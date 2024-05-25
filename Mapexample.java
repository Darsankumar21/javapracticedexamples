import java.util.*;

public class Mapexample {
    public static void main(String []args)
    {
        Map mp = new HashMap();
        mp.put("first","Hi all");
        mp.put("second","Good morning");
        mp.put("third","Namaskar");
        System.out.println(mp.get("second"));
        System.out.println("K-V pairs :"+mp.entrySet());// return type can be set
        System.out.println("Values :"+mp.values());//return type can be list or set
        System.out.println("Keys :"+mp.keySet());// return type can be set
    }
}
// -xlint
// complile time type safety
// generics in java
// generics means parameterised types. The idea allows type(Integer, String..etc and user defined types) to be
// a parameter methids,classes, and interfaces
// List<String> li = new ArrayList<String>()