package src;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStackUsingRecurion {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer>st = new Stack<>();

        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }

        //Stack Before Reversing
        System.out.println(st);

        //Stack After Reversing
        

    }
    
}
