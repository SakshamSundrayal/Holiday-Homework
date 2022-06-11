/*
 * Write a a program for the following series:- 
 * S=1+3+5+7+9+___________+n
 * S=1-2+3-4+_______________+n
 * S=1 , 22 , 333 , 4444 , 55555 , __________+n
 * S=1 , 12 , 123 , 1234 , 12345
*/

import java.util.Scanner;
public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n =sc.nextInt();
        
        // Series 1
        int s1 = 0;
        for (int i = 1; i <= n; i +=2 ) 
            s1 = s1 + i;
            
        System.out.println("Result of Series 1 : " + s1);
        
        // Series 2
        int s2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                s2 = s2 - i;
            else
                s2 = s2 + i;
        }
        
        System.out.println("Result of Series 2 : " + s2);
        
        // Printing Series 3
        System.out.println("\nResult of Series 3");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(i + " ");
            System.out.println();
        }
        
        
        // Printing Series 4
        System.out.println("\nResult of Series 4");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) 
                System.out.print(j + " ");
            System.out.println();
        }
    }
}