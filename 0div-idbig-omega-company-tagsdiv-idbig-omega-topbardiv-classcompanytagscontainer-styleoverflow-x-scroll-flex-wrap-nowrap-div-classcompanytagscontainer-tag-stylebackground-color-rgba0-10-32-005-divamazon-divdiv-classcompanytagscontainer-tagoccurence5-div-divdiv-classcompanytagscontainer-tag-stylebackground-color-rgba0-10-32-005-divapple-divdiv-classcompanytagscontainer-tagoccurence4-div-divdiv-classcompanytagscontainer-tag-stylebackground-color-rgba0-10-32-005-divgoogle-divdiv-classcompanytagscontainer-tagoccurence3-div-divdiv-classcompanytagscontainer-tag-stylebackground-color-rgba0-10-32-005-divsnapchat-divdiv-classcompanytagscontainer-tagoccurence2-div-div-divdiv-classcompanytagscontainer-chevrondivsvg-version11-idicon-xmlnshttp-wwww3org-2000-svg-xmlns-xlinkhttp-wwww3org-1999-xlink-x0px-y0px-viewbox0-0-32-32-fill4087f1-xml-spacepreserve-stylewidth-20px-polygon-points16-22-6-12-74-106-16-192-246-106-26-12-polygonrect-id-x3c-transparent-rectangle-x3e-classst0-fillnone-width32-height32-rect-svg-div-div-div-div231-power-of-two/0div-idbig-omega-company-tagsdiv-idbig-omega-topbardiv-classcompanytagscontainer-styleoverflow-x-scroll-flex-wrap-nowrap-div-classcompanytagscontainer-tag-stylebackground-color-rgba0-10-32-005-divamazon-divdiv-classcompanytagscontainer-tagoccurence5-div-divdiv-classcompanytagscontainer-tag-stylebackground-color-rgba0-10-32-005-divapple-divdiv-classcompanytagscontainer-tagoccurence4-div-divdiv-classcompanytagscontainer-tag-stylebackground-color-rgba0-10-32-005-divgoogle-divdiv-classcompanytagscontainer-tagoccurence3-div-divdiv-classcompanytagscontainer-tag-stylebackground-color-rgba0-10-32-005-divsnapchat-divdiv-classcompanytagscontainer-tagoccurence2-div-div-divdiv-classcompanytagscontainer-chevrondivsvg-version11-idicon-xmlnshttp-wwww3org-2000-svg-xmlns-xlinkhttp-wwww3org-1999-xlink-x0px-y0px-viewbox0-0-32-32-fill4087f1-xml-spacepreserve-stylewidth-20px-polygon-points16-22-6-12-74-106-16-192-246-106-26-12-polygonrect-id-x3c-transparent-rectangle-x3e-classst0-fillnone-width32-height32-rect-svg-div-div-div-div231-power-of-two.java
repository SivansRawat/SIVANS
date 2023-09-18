class Solution {
    public boolean isPowerOfTwo(int n) {
      int val = (n & (n-1));
        
        if(n==0 || n<0){
            return false;
        }
        if(val == 0){
            return true;
        }
        
        else{
            return false;
        }   
    }
}