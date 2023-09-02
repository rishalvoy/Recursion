package src;

import java.util.Scanner;
import java.util.Stack;

/**
 * SortStackUsingRecursion
 */
public class SortStackUsingRecursion {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Stack<Integer>st = new Stack<>();

        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            st.push(sc.nextInt());
        }

        System.out.println(st);

        sortStack(st);

        //insertElem(st,0);

        System.out.println("Sorted Stack: "+st);
    }


    public static void sortStack(Stack<Integer>st)
    {
        //1 3 2 4
        if(st.size()==0)return ;
        System.out.println("This is Stack: "+st);
        Integer elem = st.pop();

        sortStack(st);

        insertElem(st,elem);

    }

    public  static void insertElem(Stack<Integer>st, Integer elem)
    {
        System.out.println("Stack From The Insert Fuction "+st);
        if(st.size()==0 || st.peek()<=elem)
        {
            st.push(elem);
            return;
        }

        int elem1 = st.pop();
        insertElem(st, elem);
        st.push(elem1);
        return;
    }
}