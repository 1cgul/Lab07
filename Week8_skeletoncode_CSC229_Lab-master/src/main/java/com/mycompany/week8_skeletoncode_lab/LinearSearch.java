/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
         //         - prvoide asymptotic analysis of the developed solution
         // Big O = O(n), upper bound and lower bound = n so big theta = theta(n);
    }

    public static void main(String[] args){
        int target = 2;
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 9;
        arr[2] = 1;
        arr[3] = 2;
        arr[4] = 6;

        System.out.println("Target " + target + " found at index " + search(arr, target)+ ".");
    }
    
}
