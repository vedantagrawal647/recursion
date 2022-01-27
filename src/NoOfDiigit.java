/*
Write a program to find out and return the number of digits present in a number recursively.
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */
import java.util.Scanner;

public class NoOfDiigit {
    public static int m4( int n)
    {

        if(n/10==0)
        {
            return 1;
        }
        return m4(n/10) + 1;
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(m4(s.nextInt()));
    }
}
