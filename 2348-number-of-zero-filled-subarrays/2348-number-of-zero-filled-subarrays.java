class Solution {
    public long zeroFilledSubarray(int[] nums) {

         int curSum =0;
        int start = 0;
        // int end = -1;
        long count =0; 
        int N = nums.length;
        
        
        for(int i=0;i<N;i++){
            if(nums[i] != 0){
                nums[i] = 1;
            }
        }
        
      
        // Solution using HashMap  but this question is of Variable Sliding Window 
        
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        // if(nums[0] == 0 && nums[1] == 0 && nums[N-1] == 0){
        //     return (N*(N+1))/2;
        // }
        
        
        for(int i =0;i<N;i++){
             curSum += nums[i];
            if (map.containsKey(curSum))
                count += (long)map.get(curSum );
            map.put(curSum, map.getOrDefault(curSum, 0) + 1);
        }
        
        
        return (long)count ;
        
        
    }
}