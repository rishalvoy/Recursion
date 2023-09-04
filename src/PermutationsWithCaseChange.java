package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * PermutationsWithCaseChange
 */
public class PermutationsWithCaseChange {

    static List<String>ans = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String output = "";
        generatePermutations(input,output);

        System.out.println(ans);
    }

    static void generatePermutations(String input, String output)
    {

        if(input.length()==0)
        {
            ans.add(output);
            return;
        }
        String op1 = output+input.substring(0, 1).toUpperCase();
        generatePermutations(input.substring(1), op1);
        String op2 = output+input.substring(0, 1);
        generatePermutations(input.substring(1), op2);

    }
}