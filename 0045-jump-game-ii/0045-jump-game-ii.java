class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int s=0,e=0,count=0;
        for(int i=0;i<n-1;i++){
            s=Math.max(s,i+nums[i]);
            if(i==e){
            count++;
            e=s;
            if(e>=n-1)
            return count;
            
            }
        }return 0;


    }
}