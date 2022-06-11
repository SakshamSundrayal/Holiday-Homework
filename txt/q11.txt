// Write a program to print the sum of odd digits of an entered number?

import java.util.Scanner;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int num = n;
        
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            
            if (temp % 2 != 0)
                sum = sum + temp;
            
            n = n / 10;
        }
        
        System.out.println("Sum of odd digits of entered number : " + sum);
    }
}