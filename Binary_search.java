/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/**
 *
 * @author zenalarifin
 */

/**

Two examples where you can use binary search and how it works. See comments for more information.

l = left
r = right
m = middle 
*/

import java.util.Random;
import java.util.Arrays;

public class Program
{
    //find a peak in an array
    //e.g. a b c d
    //b is a peak if b >= a && b >= c
    public static int getPeak(int[] arr, int l, int r){
    
        int m = (l + r) / 2;
        
        //if the value in the middle is smaller than its left neighbour: search on the left side
        if(m > 0 && arr[m] < arr[m - 1]){
            
            return getPeak(arr, l, m - 1);
        }
        
        //if the value in the middle is smaller than its right neighbour: search on the right side
        if(m < r && arr[m] < arr[m + 1]){
            
            return getPeak(arr, m + 1, r);
        }
        
        //peak is found 
        return arr[m];
    }
    
    //find index of value x in a sorted array
    public static int getIndex(int[] arr, int l, int r, int x){
        
        int m = (l + r) / 2;
        
        //x is in the middle of the array
        //return m
        if(arr[m] == x){
            
            return m;
        }
        
        //x is larger than the value in the middle: search on the right side
        if(m < r && arr[m] < x){
            
            return getIndex(arr, m + 1, r, x);
        }
        
        //x is smaller than the value in the middle: search on the left side
        if(m > 0 && arr[m] > x){
            
            return getIndex(arr, l, m - 1, x);
        }
        
        //x is not found
        return -1;
    }
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        int n = rand.nextInt(16) + 1;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            
            arr[i] = rand.nextInt(21) - 10;
        }
               System.out.println(Arrays.toString(arr));
        System.out.println("peak: " + getPeak(arr, 0, n - 1));
        
        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        int num = 5;
        int index = getIndex(arr, 0, n - 1, num);
        
        System.out.print("index of number " + num + ": ");
        
        if(index == -1){
            
            System.out.println("not found");
       
        }else{
            
            System.out.println(index);
        }
   
    }
}
