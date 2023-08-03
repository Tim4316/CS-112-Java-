public class StringRecursion {
    public static void printReverse(String str) {
        if (str == null || str.length() <= 0 ) {
            return;
        } else {
            printReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }

    public static String trim(String str) {
        int startIndex = 0;
        int endIndex = str.length() -1;
        if (str == null)
            return null;
        if (str.equals("")) {
            return "";
        } else {
            trim(str.substring(1));
            if (str.charAt(startIndex)!=' ' && str.charAt(endIndex)!=' ') { 
                return str.substring(startIndex, endIndex + 1);
            } else if (str.charAt(startIndex)==' ' && str.charAt(endIndex)==' '){
                return str.substring(startIndex, endIndex);
            } else if (str.charAt(startIndex)==' ' && str.charAt(endIndex)!=' '){ 
                startIndex ++;
                return str.substring(startIndex + 1, endIndex + 1);
            } else {
                endIndex--;
                return str.substring(startIndex, endIndex - 1);
            }
        }
    }
      


    public static int find(char ch, String str){
        if (str == null || str.equals("")) {
            return 0;
            } else {
            int rest = find(ch, str.substring(1));
            if (str.charAt(0) == ch) {
                return 1 + rest;
            } else if (str.charAt(0) != ch) {
                return rest; 
            } else {
                return -1;
            }
        }
    }   

    public static String weave(String str1, String str2) {
        if (str1 == null && str2 == null)
            throw new IllegalArgumentException();
        if (str1.equals(""))
            return str2;
        if (str2.equals(""))
            return str1;
        if (str1.equals("") && str2.equals("")) {
            return "";
        } else {
            String rest = weave(str1.substring(1), str2.substring(1));
            return str1.substring(0, 1) + str2.substring(0, 1) + rest;
        }
    }

    public static int indexOf(char ch, String str) {
            if (str == null || str.equals("")) {
                return -1;
                } else {
                int rest = indexOf(ch, str.substring(1));
                if (str.charAt(0) == ch) {
                    return 1 + rest;
                } else if (str.charAt(0) != ch) {
                    return rest; 
                } else {
                    return -1;
                }
            }
    }  
      public static void main(String[] args) {
        System.out.println(indexOf('e', "bye")) ;
        
     }   
}
   