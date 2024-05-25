public class exceptionhandling2 {
    public static int div(int a , int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String []args){
        int  i =0;
        try{
            i = div(12,2);
        }
        catch (ArithmeticException ae){
            System.out.println("change 0 zero");
        }
        finally{
            System.out.println(i);
        }
    }
}
