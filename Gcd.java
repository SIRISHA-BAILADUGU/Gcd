import java.util.*;
public class Gcd {
    public static void main(String args[])
    {
        int gcd=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gcd=findGCD(a,b);
        System.out.println(gcd);
    }    
    public static int findGCD(int a,int b)

{
    while(b!=0)
    {
        if(a>b)
        {
            a=a-b;
        }
        else{
            b=b-a;
        }
    }
    return a;
}
}
