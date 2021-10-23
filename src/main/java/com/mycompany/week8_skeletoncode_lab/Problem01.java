/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    static boolean checkPrime(int numberToCheck)
    {
        if(numberToCheck == 1) {
            return false;
        }
        for (int i = 2; i*i <= numberToCheck; i++) {
            if (numberToCheck % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int primeSum(int l, int r)
    {
        int sum = 0;
        for (int i = r; i >= l; i--) {
 
            // Check for prime
            boolean isPrime = checkPrime(i);
            if (isPrime) {
 
                // Sum the prime number
                sum = sum + i;
            }
        }
        return sum;
    }
    // Time Complexity is O(r x sqrt(N))
   
}

