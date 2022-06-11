// Write a program to print the number of the even digits of an entered number?

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        
        int count = 0;
        while (n != 0) {
            int temp = n % 10;
            
            if (temp % 2 == 0)
                count++;
            
            n = n / 10;
        }
        
        System.out.println("Number of Even Digits : " + count);
    }
}