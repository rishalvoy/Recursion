package src;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementStack {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        Stack<Integer>st = new Stack<>();
    
        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }

        int mid;

        // IP - top 6 5 4 3 2 1 bottom;
        // OP - 6 5 4 2 1;
        if(n%2==0)
        {
            mid = n/2+1;
        }
        else
        {
            mid = (n+1)/2;
        }

        deleteMiddleElement(st, mid);

        System.out.println(st);

    }

    static void deleteMiddleElement(Stack<Integer>st, int mid)
    {
        if(mid==1)
        {
            st.pop();
            return;
        }

        int elem = st.pop();
        deleteMiddleElement(st, mid-1);

        st.push(elem);

        return ;



    }



}
