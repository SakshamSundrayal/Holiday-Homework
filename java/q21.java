// Write a program to print the number of vowels in each word of a sentence

import java.util.Scanner;
public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String input = sc.nextLine();
        String str = input.toLowerCase();
        
        
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (temp == 'a' || temp == 'e' || temp == 'i' ||
                temp == 'o' || temp == 'u') 
                vowelCount++;
        }
        
        System.out.println("Number of Vowels in the sentence : " + vowelCount);
    }
}
