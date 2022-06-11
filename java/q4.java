// Write a program to print the maximum digit of an entered number
// (eg:-9876, max=9)

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = Math.abs(sc.nextInt());
        
        int max = n % 10;
        n = n / 10;
        while (n != 0) {
            int temp = n % 10;
            
            if (temp > max)
                max = temp;
            
            n = n / 10;
        }
        
        System.out.println("Maximum Digit : " + max);
    }
}