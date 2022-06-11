/*
 * Read any 7 three digit numbers and store them in an array. using a menu display the following choices and based on the users choice print
 * 1) - Number of numbers begins with 7
 * 2) - Number of numbers where sum of 1st and last digit is 10?
*/

import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking numbers for array as input
        System.out.println("Enter 7 numbers :");
        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        // Taking choice
        System.out.println("\nEnter 1 for getting -> Number of numbers begining with 7");
        System.out.println("Enter 2 for getting -> Number of numbers where sum of 1st and last digit is 10");
        int choise = sc.nextInt();
        switch (choise) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    int firstDigit = Integer.parseInt((arr[i] + "").charAt(0) + "");
                    
                    if (firstDigit == 7)
                        System.out.println(arr[i]);
                }
                break;
            case 2:
                for (int i = 0; i < arr.length; i++) {
                    int firstDigit = Integer.parseInt((arr[i] + "").charAt(0) + "");
                    int lastDigit = arr[i] % 10;
                    
                    if (firstDigit + lastDigit == 10)
                        System.out.println(arr[i]);
                }
            default :
                System.out.println("Invalid Choise");
        }
        
        System.out.println("Program Terminates");
    }
}