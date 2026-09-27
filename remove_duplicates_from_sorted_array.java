/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	    for(int i=0;i<n;i++){
	        nums[i]=sc.nextInt();
	        
	    }
		int i=0,j=0,temp = -101;
        while(i<n)
        {
            temp = nums[i];
            while(i<n && temp==nums[i])
            {
                i++;
            }
            nums[j] = nums[i-1];
            j++;
        }
        System.out.println(j);
    }

	}
