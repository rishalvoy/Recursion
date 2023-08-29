package src;

import java.util.Scanner;

public class PrintNTo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNTo1(n);
    }

    public static void printNTo1(int n)
    {
        if(n==1)
        {
            System.out.println(n+" ");
            return;
        }

        System.out.print(n+" ");
        printNTo1(n-1);

        return ;
    }

}
