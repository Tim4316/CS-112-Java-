public class ArrayRecursion {
    public static boolean search(Object item, Object[] arr, int start) {
        if(arr == null)
            throw new IllegalArgumentException();
        if(start >= arr.length){
            return false;
            } else {
            if(arr[start]==item) {
                return true;
                } else {
                    return search(item,arr,start+1);
                }
            }
    }
    
    public static String reverseArrayToString(Object[] arr, int index ) {
        if (arr == null)
            return "";
        if (arr.length == 0)
            return "[]";
        if (index == 0) {
            return "[" + reverseArrayToString(arr, index + 1) + arr[index] + "]";
            } else if (index < arr.length) {
                return reverseArrayToString(arr, index + 1) + arr[index] + ", ";
            } else {
                return "";
            }
    }
}

  
