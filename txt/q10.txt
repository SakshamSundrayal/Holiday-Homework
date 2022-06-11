// Write a program to print factors of each digit of an entered number

import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int num = n;
        
        while (n != 0) {
            int temp = n % 10;
            
            System.out.println("Factors of " + temp);
            for (int i = 1; i <= temp; i++) {    
                if (temp % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println();
            
            
            n = n / 10;
        }
    }
}