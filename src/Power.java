import java.util.Scanner;

public class Power {
    public static int m2(int a,int n)
    {
        if(n==1)
        {
            return a;
        }
        return a*m2(a,n-1);
    }
    public static void main(String[] args) {
        int a,n,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        n=s.nextInt();
        c=m2(a,n);
        System.out.println(c);

    }
}
