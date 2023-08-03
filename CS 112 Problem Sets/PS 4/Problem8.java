/*
 * Problem8.java
 *
 * Computer Science 112, Boston University
 * 
 * modified by:
 *   name: Hyungu Lee
 *   email: hlee18@bu.edu
 */
import java.util.*;

public class Problem8 {
    public static int[] intersect(int[] arr1, int[] arr2) {
        int sarr;
        if (arr1.length < arr2.length) {
            sarr = arr1.length;
        } else {
            sarr = arr2.length;
        }
        int arr3[] = new int[sarr];
        Sort.mergeSort(arr1);
        Sort.mergeSort(arr2);
       
        int i = 0;
        int j = 0;
        int k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (k < 1) {
                arr3[k] = arr1[i];
                i++; j++; k++;
                }
                else {
                    arr3[k] = arr1[i];
                    if (arr3[k] == arr3[k-1]) {
                        arr3[k] = 0;
                        i++; j++;
                    } else {
                       k++;
                    }
                }
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return arr3;
    } 


    public static void main(String [] args) {
        int[] a1 = {10, 5, 7, 5, 9, 4};
        int[] a2 = {7, 5, 15, 7, 7, 9, 10};
        int[] result1 = intersect(a1, a2);
        System.out.println("result1: " + Arrays.toString(result1));
        
        int[] a3 = {0, 2, -4, 6, 10, 8};
        int[] a4 = {12, 0, -4, 8};
        int[] result2 = intersect(a3, a4);
        System.out.println("result2: " + Arrays.toString(result2));
    }
}