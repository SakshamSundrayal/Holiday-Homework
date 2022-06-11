// Write a program to print the minimum digit of an entered number
// (eg:-1234,min=1)

import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = Math.abs(sc.nextInt());
        
        int min = n % 10;
        n = n / 10;
        while (n != 0) {
            int temp = n % 10;
            
            if (temp < min)
                min = temp;
            
            n = n / 10;
        }
        
        System.out.println("Minimum Digit : " + min);
    }
}