//JAVA code to get median of two sorted Arrays..

class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] arr = new double[nums1.length + nums2.length];
        int i=0;
        int j=0;
        int k=0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k] = nums1[i];
                i++;
            }else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        
        while(i < nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j < nums2.length){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        
        int mid = arr.length / 2;
        
        if(arr.length % 2 == 1){
            return arr[mid];
        }else{
            return (arr[mid] + arr[mid-1]) / 2;  
        }
    }
}
