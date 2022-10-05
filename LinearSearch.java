// Given an array of integers, return the number of times that two 6's are next to each other in the array. 
// Also count instances where the second element is 7 ( LINEAR SEARCH )
// Shivam

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter the element you want to search: ");
        int key = sc.nextInt();
        int flag = 0;
        for (int i : arr) {
            if (i == key) {
                flag++;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Element found!");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
