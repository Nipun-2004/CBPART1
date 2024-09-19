package Assignements;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        int oddsum =0;
        int evensum =0;
        int temp = num;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Process the digits from left to right
        for (int i = digits; i > 0; i--) {
            int digit = num / (int) Math.pow(10, i - 1);  // Get the leftmost digit
             num %= (int) Math.pow(10, i - 1);  // Remove the leftmost digit

            // Check the position (1-based from left to right)
            if (i % 2 == 1) {
                oddsum += digit;
            } else {
                evensum += digit;
            }
        }

        
        System.out.println("Sum of Odd placed digits is  : " + oddsum);
        System.out.println("Sum of Even placed digits is  : " + evensum);
    
    }
   
  
} 

        

    
    
