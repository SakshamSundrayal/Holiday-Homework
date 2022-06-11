// TAKE THE INPUT OF STRING FROM USER AND OUTPUT THE FOLLOWING:- 
// a) -Number of uppercase?
// b) -Number of lower case? 
// c) -Number of spaces?

import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        
        int upper = 0, lower = 0, space = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            
            if (Character.isUpperCase(temp))
                upper++;
            else if (Character.isLowerCase(temp))
                lower++;
            else if (Character.isWhitespace(temp))
                space++;
        }
        
        System.out.println("Number of Upper Case letters : " + upper);
        System.out.println("Number of Lower Case letters : " + lower);
        System.out.println("Number of White Spaces : " + space);
    }
}
