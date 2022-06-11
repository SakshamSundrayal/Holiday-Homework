// Write a program to check is a number is magic number or not

// Magic Number is a number in which the 
// eventual sum of digits of the number is one...

import java.util.Scanner;
public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int n = Math.abs(sc.nextInt());
        int num = n;



        while (n > 10) {
            int temp = n;
            int sum = 0;
            while (temp != 0) {
                int rem = temp % 10;
                sum = sum + rem;
                temp = temp / 10;
            }
            n = sum;
        }
        
        
        if (n == 1 || n == 10)
            System.out.println(num + " is a Magic Number");
        else
            System.out.println(num + "is not a Magic Number");
   }
}