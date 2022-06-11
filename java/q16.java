// Write a class with the function word () to input a sentence and display the following?
// a) Count number of times “in” occurs in the string? 
// b) ASCII code of each character in the string?
// c) reverse the string?

import java.util.Scanner;
public class q16 { 
    static void word(String s) {
        
        int inCount = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = s.charAt(i) + "" + s.charAt(i + 1);
            if (temp.equals("in"))
                inCount++;
        }
        
        System.out.println("\n'in' occurs " + inCount + " times.");


        
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            System.out.println(temp + " - " + (int)temp);
        }
        
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        System.out.println("\nReversed String : " + reverse);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        
        word(str);
    }
}
