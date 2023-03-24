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
    
    public static long getSumOfPrimes(int n){// Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    long sum = 0;
    for(int i = 2; i <= n; i++){
        boolean isPrimeNum = true;
        for(int j = 2; j <=Math.sqrt(i); j++){
            if (i%j ==0){
                isPrimeNum = false;
                break;
            }
        }
        if(isPrimeNum){
            sum+=i;
        }
    }
    return sum;
    
    }//          Analyze its space and time  
    // space complexity is O(1) because its not creating reference types like String, Integer, etc
    // time complexity is O(n*logn) because the outer loop is O(n) and the inner is O(logn)
    public static void main(String[] args){
        int target = 49;
        System.out.println(getSumOfPrimes(target)); //          Test your solution
    }
    
}
