class Solution {
    
     HashMap<Integer,Integer> map = new HashMap<>();
    int sum=0;
    public int rob(int[] nums) {
        int max_sum = 0;
        for(int i=nums.length-1;i>=0;i--)
        {
            max_sum = Math.max(max_sum,helper(nums,i));
            // store result in the memoization map
            map.put(i,max_sum);
            sum=0;

        }
        return max_sum;
        
    }
    public int helper(int arr[] , int index)
    {
        // return maximum sum when we reach out of bound
        if(index>=arr.length)
        return sum;
        //  if result for this house is already computed , return it
        if(map.containsKey(index))
        {
            sum+=map.get(index);
            return sum;
        }
        sum+=arr[index];
        helper(arr,index+2);
        return sum;
    }
}