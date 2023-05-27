class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
           List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = nums.length;
        ans.add(new ArrayList<Integer>()); 

        Arrays.sort(nums); 
        

        for(int i = 0; i < n; i++){
            int j = ans.size();
            while(j-- > 0){
                List<Integer> subset = new ArrayList<Integer>(ans.get(j));
                subset.add(nums[i]);
                ans.add(subset);
            }
        }
        
        return ans;
        
    }
}