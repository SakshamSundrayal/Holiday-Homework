// Write a program to print the factorial of its digits
// (hint:-3!=3*2*1,4!=4*3*2*1)

import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = Math.abs(sc.nextInt());
        
        while (n != 0)
        {
            int temp = n % 10;
            int factorial = 1;
            for (int i = 1; i <= temp; i++)
                factorial = factorial * i;
                
            System.out.println("Factorial of " + temp + " : " + factorial);
            n = n / 10;
        }
        
    }
}