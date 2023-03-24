/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

import javax.swing.plaf.synth.SynthSplitPaneUI;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if(a[inner] > a[inner+1]){
                    temp= a[inner];
                    a[inner]= a[inner+1];
                    a[inner+1]=temp;
                }
            }
        
         }
       for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        } 
    }
    public static void main(String[] args){

        int[] a = new int[5];
        a[0] = 5;
        a[1] = 4;
        a[2] = 24;
        a[3] = 41;
        a[4] = 15;
        bubbleSort(a, a.length);

        //the time complexity of this code is O(n^2)
        
    }
    
    
}
