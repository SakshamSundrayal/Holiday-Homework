// Write a program to print the sum of the prime digits of an entered number

import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        
        int sum = 0;
        while (n != 0) {
            int temp = n % 10;
            
            if (temp == 2 || temp == 3 || temp == 5 || temp == 7)
                sum += temp;
            
            n = n / 10;
        }
        
        System.out.println("Sum of Prime Digits : " + sum);
    }
}