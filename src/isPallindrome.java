package src;

import java.util.Scanner;

public class isPallindrome {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(isPallindrome(s));

        
    }


    static boolean isPallindrome(String s)
    {

        System.out.println("This is String: "+s);
        if(s.length()==0 || s.length()==1)return true;
        

        
        boolean pallindrom = isPallindrome(s.substring(1, s.length()-1));

        if(pallindrom && s.charAt(0)==s.charAt(s.length()-1))return true;

        return false;
    }
}
