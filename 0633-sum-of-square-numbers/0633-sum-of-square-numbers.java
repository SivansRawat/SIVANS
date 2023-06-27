class Solution {
    public boolean judgeSquareSum(int c) {
        
        
        // if (c == 2) return true;
        long left = 0;
        long right = (long)Math.sqrt(c);
        
        while(left<=right){
            
        long sum = left*left + right*right;
        if (sum == c) return true;
            
        else if (sum < c) left++;
            
        else right --;
            
        }
        
        
        return false;
    }
}