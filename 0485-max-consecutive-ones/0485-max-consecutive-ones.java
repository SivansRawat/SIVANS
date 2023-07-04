class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int max = 0;

        for(int i=0;i<n;i++){

            if(nums[i] == 1){
                max +=1;
                if(max>=ans){
                    ans = max;
                }
               
            }

            else{
                max = 0;
            }
        }

        return ans;

    }
}