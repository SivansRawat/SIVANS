class Solution {
    public int[] singleNumber(int[] nums) {
        
          HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[2];
        int j=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                ans[j]=entry.getKey();
                j++;
            }
        }
        Arrays.sort(ans);
        return ans;
        
    }
}