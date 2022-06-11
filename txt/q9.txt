// Write a program to print whether the sum of digits of an entered number is odd or even

import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }
        
        String result = (sum % 2 == 0)?"Even":"Odd";
        
        System.out.println("Sum of digits of entered number is " + result);
    }
}