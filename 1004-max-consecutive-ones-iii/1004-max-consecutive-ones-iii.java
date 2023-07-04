class Solution {
    public int longestOnes(int[] nums, int k) {

        int max=0;
        int start=0;
        int zerocount=0;
        int n = nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zerocount++;
                }

            while(zerocount>k)
            {
                if(nums[start]==0)
                {
                    zerocount--;
                }
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}