import java.util.*;
public class Stringc {
    public static void main(String []args)
    {
        // String str = "SixPhrase";
        // String str, nstr="";
        // char ch;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the string");
        // str = sc.next();
        // System.out.println("Original String "+str);
        // for (int i=0; i<str.length();i++)
        // {
        //     ch= str.charAt(i);
        //     nstr= ch + nstr;
        // }
        // System.out.println("Reversed string :"+nstr);
        // str.replace(0, 0)
        StringBuilder  sb = new StringBuilder("Arcus");
        sb.append("Infotech");
        System.out.println(sb);
        System.out.println(sb.reverse());
        StringBuffer sf = new StringBuffer("Arcus");
        System.out.println(sf);
        System.out.println("here "+sf.reverse());
        StringTokenizer st = new StringTokenizer("Arcus infotech bengaluru");
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
}
}
