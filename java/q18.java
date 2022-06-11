// Write a function newstr() to display each word of the string in reverse order?
// Ex-_if the string is=”Trip to saat tal” Output- “pirt ot taas lat”


import java.util.Scanner;
public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        
        String[] words = str.split(" ");
        
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                temp = temp + words[i].charAt(j);
            }
            result = result + temp + " ";
        }
        
        System.out.println("Result String is :");
        System.out.println(result);
    }
}