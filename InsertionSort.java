import java.util.*;
import java.lang.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        Random ran = new Random();
        for(int i=0;i<n;i++){
            arr[i] = ran.nextInt(n);
        }
        long start = System.currentTimeMillis();
        // insertion sort
        for(int i=1;i<n;i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[++j] = curr;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken by insertion sort: "+(end-start)+" ms");
        sc.close();
    }
}