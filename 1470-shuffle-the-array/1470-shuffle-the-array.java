class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        
        
        int result[]=new int[2*n];
        int ptr=n;
        int i=0,j=0;
        while(j<2*n-1){
           result[j]=nums[i];
           result[j+1]=nums[ptr+i];
           j+=2;
           i+=1;
        }
        return result;

    }

   
}