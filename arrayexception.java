public class arrayexception {
    public static void main(String []args)
    {
        int arr[]={3,4,5,6,7};
        int sum =0;

        try{
            System.out.println(arr[arr.length]);
        }
        catch (ArrayIndexOutOfBoundsException ae){
            System.err.println("Index out of bound");
        }
    }
    
}
