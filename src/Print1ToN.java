package src;

import java.util.Scanner;

public class Print1ToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print1ToN(n);
    }


    public static void print1ToN(int n)
    {
        if(n==1)
        {
            System.out.print(1+" ");
            return ;
        }

        print1ToN(n-1);
        System.out.print(n+" ");

        return ;
    }
}
