public class StringTest {
    
    public static void main(String[] args) {

        String s1 = "Boston";
        String s2 = "University";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println( s1.substring(3, 6) );
        System.out.println( s2.substring(0, 3) );
        System.out.println( s2.toUpperCase().substring(0, 3));
        System.out.println( s2.charAt(3) );
        System.out.println( s1.toUpperCase().substring(2) + s2.toUpperCase().substring(4, 5));
    }
    public static String replaceStart(String s1, String s2) {
        int s1Len = s1.length();
        if (s1Len < s2.length()) {
            return s1 + s2.substring(s1Len);
        } else {
            return s1;
        }
    }
    
}