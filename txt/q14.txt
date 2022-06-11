// WAP with the function to input a string.
// Using this form another string by adding 5 to each character in the string 

import java.util.Scanner;
public class q14 {
    // Function to input string
    static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    
    
    // Function to convert String
    static String convert(String x) {
        String newStr = "";
        for (int i = 0; i < x.length(); i++) {
            int temp = x.charAt(i) + 5;
            char temp2 = (char) temp;
            newStr = newStr + temp2;
        }
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println("Enter the string :");
        String str = input();
        
        System.out.println("New String : " + convert(str));
    }
}