public class Useofstatic{
    public static int staVar=0;  // 
    public int nonsta =0;

    public Useofstatic(){
        System.out.println("constructor gets executed");
        staVar++;
        nonsta++;
    }
    static {
        System.out.println("static initializer executed");
    }
    public static void main(String[] args)
    {
        System.out.println("main() started...");
        System.out.println("Static var"+Useofstatic.staVar);
        Useofstatic obj = new Useofstatic();
        System.out.println("Static var "+Useofstatic.staVar);
        System.out.println("non static var "+obj.nonsta);
        Useofstatic obj1 = new Useofstatic();
        System.out.println("Static var "+Useofstatic.staVar);
        System.out.println("non static var "+obj1.nonsta);
    }
}
