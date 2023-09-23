class Solution {
    public int pivotIndex(int[] nums) {
           int n = nums.length;
        int rightSum = 0;
        int leftSum = 0;
        int totalSum =0;
        
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        
        rightSum = totalSum;
        
        for(int i=0;i<n;i++){
            
            rightSum -= nums[i];
            
            if(rightSum == leftSum){
                return i;
                
            }
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}