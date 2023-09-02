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

        reverseStack(st);
        System.out.println(st);

    }

    public static void reverseStack(Stack<Integer>st)
    {
        if(st.size()==1)
        {
            return ;
        }
        int elem = st.pop();
        reverseStack(st);

        insertAtBottom(st, elem);

        return;
    }

    public static void insertAtBottom(Stack<Integer>st, int elem)
    {
        System.out.println("Stac From Insert: "+st);
        if(st.size()==0)
        {
            st.push(elem);
            return ;
        }
        int elem1 = st.pop();
        insertAtBottom(st,elem);
        st.push(elem1);
        return;
    }


    
}
