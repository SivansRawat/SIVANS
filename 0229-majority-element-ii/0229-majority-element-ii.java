class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        int n = nums.length;

        for(int i =0 ;i <n;i++){
            
            if(map.containsKey(nums[i]) == false){
                map.put(nums[i] , 0);
            }
            
            
            if(map.containsKey(nums[i]) == true){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            
            
            if((map.get(nums[i])) > (n/3)  && map.get(nums[i]) <= (n/3)+1){
                arrList.add(nums[i]);
        
            }
        }
        
        
        
        if(arrList.size() == 0){
            // arrList.add(-1);
            return arrList;
            
        }
        
        else{
            
            return arrList;
        }



        
    }
}