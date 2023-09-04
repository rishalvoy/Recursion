package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationWithSpaces {

    static List<String>ans = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String output = "";

        output=output+input.charAt(0);

        System.out.println("Input "+input.substring(1)+" Output "+output);

        generatePermutation(input.substring(1),output);

        System.out.println("FINAL ANSWER ARRAY");
        System.out.println(ans);
    }


    public static void generatePermutation(String input, String output)
    {

        
        if(input.length()==0)
        {
            ans.add(output);
            System.out.println("Final Output + AB"+output);
            return;
        }
        String output1 = output+"_"+input.charAt(0);
        generatePermutation(input.substring(1), output1);

        String output2 = output+input.charAt(0);
        generatePermutation(input.substring(1), output2);

    }
    
}
