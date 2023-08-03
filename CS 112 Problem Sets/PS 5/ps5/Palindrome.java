/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name: Junho Son
 *     username: U64222022
 */

public class Palindrome {

    /*
     takes a String object as a parameter and determines if it is a palindrome,
     returning true if it is and false if it is not.
    */
    public static boolean isPal(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }

        if (s.length() == 0 || s.length() == 1) {
            return true;
        }

        ArrayQueue<Character> charArray = new ArrayQueue<Character>(s.length());
        ArrayStack<Character> restArray = new ArrayStack<Character>(s.length());

        for (int i = 0; i < s.length(); i ++) {
            Character c = Character.toLowerCase(s.charAt(i));
            if (Character.isLetter(c)) {
                charArray.insert(c);
                restArray.push(c);
            }
        }


        while(! charArray.isEmpty()) {
            if (charArray.remove() != restArray.pop()) {
                return false;
            }
        }


        return true;
    }
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */

        System.out.println("(1) Testing on \"abccba\"");
        try {
            boolean results = isPal("abccba");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }

        System.out.println();


        System.out.println("(2) Testing on \"ABCCBA\"");
        try {
            boolean results = isPal("ABCCBA");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }

        System.out.println();


        System.out.println("(3) Testing on \"AAAAAAB\"");
        try {
            boolean results = isPal("AAAAAAB");
            boolean expected = false;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }

        System.out.println();




        System.out.println("(4) Testing on \"AAAA!!!\"");
        try {
            boolean results = isPal("AAAA!!!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }

        System.out.println();



        System.out.println("(5) Testing on \"123123123a\"");
        try {
            boolean results = isPal("123123123a");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }

        System.out.println();


        System.out.println("(6) Testing on \"123ab123\"");
        try {
            boolean results = isPal("123ab123");
            boolean expected = false;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }

        System.out.println();
    }
}