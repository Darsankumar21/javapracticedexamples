public class Sample2 {
    int add(int a, int b)
    {
        return a+b;
    }
// var arg -- variable length args during input
    int add(int...i)
    {
        int sum =0;
        for(int a:i)
            sum+=a;
        return sum;
    }
    public static void main(String[]args){
        Sample2 s = new Sample2();
        System.out.println(s.add(11,12,13));
        System.out.println(s.add(1,2,3,4));
    }
}