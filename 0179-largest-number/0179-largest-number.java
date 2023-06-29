class Solution {
    public String largestNumber(int[] nums) {
        
        
        String[] arr = new String[nums.length];
        
        String str = "0";
        
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
            if (nums[i] != 0){
                flag  = true;
            }
            
        }
        
        
        if (flag == false) return str;
        
         Arrays.sort(arr,(a,b)->((a+b).compareTo(b+a)));
         	String ff="";
	        for(int i=arr.length-1;i>=0;i--) ff+=arr[i];
	        return ff;
        
    }
    
    
    
}