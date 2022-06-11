// Write a program using string function to input any word and print the same sc alphabetical order

import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine().toUpperCase();
        int length = str.length();

        String sortedStr = ""; //Empty String
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < length; i++) {
                char strCh = str.charAt(i);
                if (ch == strCh) {
                    sortedStr += strCh;
                }
            }
        }
        
        System.out.println("Alphabetical order:");
        System.out.println(sortedStr);
    }
}