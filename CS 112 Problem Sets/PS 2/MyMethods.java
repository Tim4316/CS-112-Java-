/*
 * MyMethods.java
 * 
 * name: Hyungu Lee
 * email: hlee18@bu.edu
 * 
 */
public class MyMethods {
    
    public static void printDecreasing(String a) {
        for (int i = 0; i <= a.length(); i++) {
            System.out.println(a.substring(0, a.length() - i));
        }
    }
    public static String firstAndLast(String str) {
        if(str.length() == 1) {
            return str;
        } else {
            return str.charAt(0) + "" + str.charAt(str.length() - 1);
        }
    }
    public static int lastIndexOf(String str, char ch) {
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                return i;
            } 
        }
        return -1;
    }
    public static String repeat(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;

    }
}
