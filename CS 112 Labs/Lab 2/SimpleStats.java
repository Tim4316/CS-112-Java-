/*
 * Simple Stats skeletol code
 * 
 * A simple interactive program that performs operations 
 * on a set of three integers.
 */

import java.util.*;

public class SimpleStats {

    public static void printMenu() {
        System.out.println("(0) Enter new numbers");
        System.out.println("(1) Find the largest");
        System.out.println("(2) Compute the sum");
        System.out.println("(3) Compute the range (largest - smallest)");
        System.out.println("(4) Compute the average");
        System.out.println("(5) Print the numbers in ascending order");
        System.out.println("(6) Quit");
        System.out.println();
    }
    
    /*** PUT YOUR SEPARATE HELPER METHODS FOR OPTIONS 1-5 HERE ***/
    public static int largest(int n1,int n2,int n3) {
        return Math.max(n3, Math.max(n1, n2));
    }
    public static int smallest(int n1,int n2,int n3) {
        return Math.min(n3, Math.max(n1, n2));
    }
    public static int sum(int n1,int n2,int n3) {
        return n1 + n2 + n3;
    }
    public static int range(int n1,int n2,int n3) {
        return largest(n1, n2, n3) - smallest(n1, n2, n3);
    }
    public static double average(int n1,int n2,int n3) {
        return sum(n1, n2, n3)/3.0;
    }
    public static void ascending(int n1,int n2,int n3) {
        String print = "";
        int largest = largest(n1, n2, n3);

        if (n1 == largest) {
            if (n2 > n3) {
                print = n1 + " " + n2 + " " + n3;
            }else {
                print = n1 + " " + n3 + " " + n2;
            }
        } else if (n2 == largest) {
            if (n1 > n3) {
                print = n2 + " " + n1 + " " + n3;
            } else {
                print = n2 + " " + n3 + " " + n1;
            }
        } else {
            if (n1 > 2) {
                print = n3 + " " + n1 + " " + n2;
            } else {
                print = n3 + " " + n2 + " " + n1;
            }
        }
        System.out.print(print);
    }
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        

        // Declare all needed variables
        int choice = 0;

        boolean more_input = true;
        
        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            
            /*
             * Expand this conditional statement to process choices 1-5.
             * Make sure to follow the guidelines in the assignment for
             * doing so.
             */
            if (choice == 0) {
                System.out.print("Enter three new numbers: ");
                int n1 = scan.nextInt();
                int n2 = scan.nextInt();
                int n3 = scan.nextInt();

                System.out.println( "Numbers entered are: " + n1 + " " + n2 + " " + n3 );
            } else if (choice == 6) {
                more_input = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (more_input);
        
        System.out.println("Have a nice day!");
    }
}
