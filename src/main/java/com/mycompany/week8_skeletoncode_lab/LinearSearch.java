
package com.mycompany.week8_skeletoncode_lab;

public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         // 
         for (int i = 0; i < n; i++){
             if (arr[i] == x)
                 return i;
         }
         return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
 
        // Function call
        int result = search(arr, x);
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
    
}
// The time complexity is O(n)

