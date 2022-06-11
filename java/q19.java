// Write a program to accept name of 10 countries and their capital.
// Input name of countries and find whether it 
// exist in the list if yes then display name of country and its capital

import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int length = 10;
        System.out.println("Enter the names of 10 countries and their capitals :");
        String[] name = new String[length];
        String[] capital = new String[length];
        
        for (int i = 0; i < name.length; i++){
            System.out.println("Country " + (i + 1));
            name[i] = sc.next();
            System.out.println("Capital " + (i + 1));
            capital[i] = sc.next();
        }
        
        
        System.out.println("\n");
        System.out.println("Enter the country to be searched");
        String country = sc.next();
        
        boolean found = false;
        loop:
        for (int i = 0; i < length; i++) {
            if (country.toLowerCase().equals(name[i].toLowerCase())) {
                System.out.println("Found Match!");
                System.out.println("Country - " + name[i]);
                System.out.println("Capital - " + capital[i]);
                found = true;
                break loop;
            }
        }
        
        if (!found) {
            System.out.println("Match not Found");
        }
    }
}