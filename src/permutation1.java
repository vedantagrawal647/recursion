import java.util.Scanner;

class Ab
{
    int n;
    Ab(int n)
    {
        this.n=n;
    }
    public static int m1(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*m1(n-1);
    }
}
public class permutation1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Ab obj=new Ab(s.nextInt());
        int c=obj.m1(obj.n);
        System.out.println(c);
    }
}
