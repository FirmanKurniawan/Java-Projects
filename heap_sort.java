/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

/*
 *
 * @author zenalarifin
 */

import java.util.Arrays;

public class HeapSort {
	public void sort(int arr[])
	{
		int n = arr.length;

		// Build heap
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// Extract element from heap
		for (int i = n - 1; i > 0; i--) {
			// Move root
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// Max heapify reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree that has root node i
	void heapify(int arr[], int n, int i)
	{
		int large = i; // Set largest as root
		int left = 2 * i + 1; 
		int right = 2 * i + 2;

		// If left child is larger than root
		if (left < n && arr[left] > arr[large])
			large = left;

		// If right child is larger than largest so far
		if (right< n && arr[right] > arr[large])
			large = right;

		// If largest is not root
		if (large != i) {
			int swap = arr[i];
			arr[i] = arr[large];
			arr[large] = swap;

			// Recursively heapify the subtree
			heapify(arr, n, large);
		}
	}

	// Main driver code
	public static void main(String args[])
	{
		int arr[] = { 132, 44, 5, 42, 45, 167, 4, 52, 31, 16, 42 };
		int n = arr.length;

		HeapSort heap = new HeapSort();
	 	heap.sort(arr);

		System.out.println("HeapSorted array is:");
		System.out.println(Arrays.toString(arr));
	}
}

