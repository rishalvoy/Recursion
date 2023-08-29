package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortArrayUsingRecursion {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        List<Integer>arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }

        System.out.println("Before Sorting");
        System.out.println(arr);
        System.out.println("After Sorting");
        sortArrayRecursion(arr);
        System.out.println(arr);



    }

    public static void sortArrayRecursion(List<Integer> arr)
    {
        if(arr.size()==1)return ;
        int lastIndex = arr.size()-1;
        int elem = arr.remove(lastIndex);

        sortArrayRecursion(arr);
        insertinArray(arr,elem);

    }

    public static void insertinArray(List<Integer>arr,int elem)
    {
        if(arr.size()==0 || arr.get(arr.size()-1)<elem)
        {
            arr.add(elem);
            return;
        }

        int lastIndex = arr.size()-1;
        int temp = arr.remove(lastIndex);

        insertinArray(arr, elem);
        arr.add(temp);


        return ;

    }
}
