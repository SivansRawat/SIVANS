class Solution {
    public int mySqrt(int x) {
        
        int start = 1;
        int end = x;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(Math.pow(mid,2) == x) return mid;
            else if(Math.pow(mid,2) > x) end = mid-1;
            else start = mid+1;
         }
         return (int)start-1;
    }
}