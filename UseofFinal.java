public class UseofFinal{
    public final int finvar =90;
    public int nonfin =90;
    public UseofFinal(){
       // finvar++; // -- final keyword cant be modified after once created
        nonfin++;
    }
    public static void main(String []args)
    {
        UseofFinal uf = new UseofFinal();
        System.out.println("Final "+uf.finvar);
        System.out.println("Non final "+uf.nonfin);
    }
}
