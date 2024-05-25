public class throwexception {
    static void help()
    {
        try{
            throw new NullPointerException("error_unknown");
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught inside help().");
            throw e;
        }
    }
    
}
