/*
 Write a program to print numbers from 1 to n in increasing order recursively.
Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
import java.util.Scanner;

public class IncreasingOrder {
    public static String m3(int n)
    {
        if(n==1)
        {
            return "1";
        }

        String str=m3(n-1)+ " " + n;
        return str;


    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(m3(s.nextInt()));
    }
}
