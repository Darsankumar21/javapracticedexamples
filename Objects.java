class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        int r = n1 + n2;
        return r ;   
    }
}




public class Objects {
    public static void main(String[] args) {
            int num1 = 4; // Corrected spacing around the assignment
            int num2 = 9;
            int num3 = 0;
            Calculator calc = new Calculator();
            int res = calc.add(num1,num2,num3);
            System.out.println(res);  
    }
}
