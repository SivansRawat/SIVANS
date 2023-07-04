class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

    int count  = 0;
    
    int prod = 1;
    
    int n = nums.length;
    int i=0,j=0;
    
    while(j<n){
        
        prod *= nums[j];
        
        while(prod >= k  ){
            
            if(i>=n){
                return 0; 
            }
            prod /= nums[i];
            
            i++;
            
            
           
        }
        
        count += j-i+1;
        
        j++;
    }
    
    return  count;

            

        }


    }
