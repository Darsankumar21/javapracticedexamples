class exceptionhandling{
    public static void main(String[] args) {
        int sum =0;
        try{
            for (String i : args)
            {
                int num = Integer.parseInt(i);
                sum += num;
            }
            System.out.println("Result="+sum);
        }catch(NumberFormatException nf)
        {
            System.out.println("enter only digits");
        }
    }
}