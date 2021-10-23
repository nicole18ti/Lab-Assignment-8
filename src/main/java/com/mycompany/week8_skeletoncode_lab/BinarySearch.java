
package com.mycompany.week8_skeletoncode_lab;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    public static void main(String args[]){
        
         BinarySearch binarySearch = new BinarySearch();
         
         int[] sortedArray = {
            0,
            1,
            2,
            3,
            4,
            5,
            5,
            6,
            7,
            8,
            9,
            9
        };
        int key = 5;
        int low = 0;
        int high = sortedArray.length - 1;
        List < Integer > sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9);

        int result = binarySearch.runBinarySearchIteratively(sortedArray, key, low, high);
        System.out.println("runBinarySearchIteratively result -> " + result);
    }
    
    // The time complexity is O(n)

}
