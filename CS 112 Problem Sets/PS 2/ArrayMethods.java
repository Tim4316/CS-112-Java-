/*
 * ArrayMethods.java
 * 
 * name: Hyungu Lee
 * email: hlee18@bu.edu
 * 
 */
public class ArrayMethods {

    public static void main(String[] args) {
      
        int a1[] = {1,2,3,4,5,6};
        int a2[] = {10,11,12,13};
        System.out.println( Arrays.toString( ArrayMethods.reverseInterchange(a1, a2) ) );
     }
    
    public static final String[] DAYS =
       {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static void swapAdjacent(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < (values.length -1); i += 2) {
            int a = values[i];
            values[i] = values[i + 1];
            values[i +1] = a;
        }
    }
    public static int[] copyReplace(int[] values, int oldVal, int newVal) {
        if (values == null) {
            throw new IllegalArgumentException();
        }
        int[] temp = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            temp[i] = values[i];
            if (temp[i] == oldVal) {
                temp[i] = newVal;
            } else {
                temp[i] = temp[i];
            }
        }
        return temp;
    }
    public static int maxSorted(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException();
        } else if (values.length == 0) {
            return 0;
        } else if (values.length == 1) {
            return 1;
        }
        int a = 1;
        int b = 1;
        for (int i = 0; i < (values.length - 1); i++) {
            if (values[i] <= values[i + 1]) {
                a ++;
            } else {
                a = 1;
            }
        if (a > b) {
            b = a;
        }
        }
        return b;      
    }
    public static int getIndexOfDay(String day) {
        int result = -1;
        if (day == null) {
            return -1;
        }
        for (int i = 0; i < DAYS.length; i++) {
            if(day.equalsIgnoreCase(DAYS[i])) {
                result = i;
            }
        }
        return result;

    }
    public static int[] reverseInterchange( int[] arr1, int [] arr2 ) {
        if (arr1 == null || arr2 == null) {
            throw new IllegalArgumentException();
        }
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;
        int shorterLen = arr1Len;
        if (arr1Len < arr2Len) {
            shorterLen = arr1Len;
        } else {
            shorterLen = arr2Len;
        }
        int[] temp = new int[shorterLen * 2];
        for (int i = 0; i < shorterLen; i++) {
            temp[i * 2] = arr1[i];
            temp[i * 2 + 1] = arr2[arr2Len - 1 - i];  
        }
        return temp;
    }
}
