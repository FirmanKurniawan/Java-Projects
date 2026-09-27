// JAVA program to get the number of common factors that are present for two numbers given 

class Solution {
    public int commonFactors(int a, int b) {
        int ans =1; // As 1 will always be the common factor among all the numbers
        
        int min = Math.min(a, b);
        
        for(int i=2; i <= min; i++){
            if(a % i ==0 && b % i ==0){
                ans++;
            }
        }
      
        return ans;
    }
}
