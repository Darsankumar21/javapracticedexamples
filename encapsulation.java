class Human{
    private int  age =11;
    private String s= "DARSAN";

    public void  getage()
    {
        System.out.print(s+age);
    }
}


public class encapsulation {
    public static void main(String args[])
    {
        Human h = new Human();
        // h.age =21;
        // h.s = "DARSAN";
        h.getage();
    }
    
}


