/*
 * PalindromeTest.java
 * 
 * name: Hyungu Lee
 * email: hlee18@bu.edu
 * source consulted:https://www.techiedelight.com/remove-non-alphanumeric-characters-from-string-java/
 */
import java.util.Scanner;

public class PalindromeTest {

    public static void main (String[] args) {

        inputStringPalindrome();
    }
    public static boolean isPalindrome( String s ) {
        boolean isPal = false; 
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z0-9]", "");
        for (int i = 0; i < (s.length() / 2); i++ ) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPal = false;
                break;
            } else {
                isPal = true;
            }
        }
        return( isPal );
    }
    public static int[] inputStringPalindrome() {
        System.out.println("\nWelcome to the StringPalindrome Test Program!");
        System.out.println("This demonstrates if the string is a palindrome from the console.");
    
        Scanner userInput = new Scanner(System.in);

        System.out.print("\nType in a line of text (a String) or \"quit\" to end: ");
        
        int arr[] = new int[2];
        arr[0] = 0; 
        arr[1] = 0;
        while (userInput.hasNextLine()) {
            String line = userInput.nextLine();
            if (line.equals("quit"))
                break;
            else {
                System.out.println("Your input:" + line);
                if(isPalindrome(line)) {
                    System.out.println("The string is a palindrome");
                    arr[0]++;
                }
                else {
                    System.out.println("The string isn't a palindrome");
                    
                }
                arr[1]++;
                System.out.print("\nType in a line of text (a String) or \"quit\" to end: ");
            }
        } 
        System.out.println("goodbye");
        System.out.println(arr[1]);
	    System.out.println(arr[0]);
        userInput.close();
        return arr; 
    }
}
