class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int i=0,j=0,count=0;
        int max=Integer.MAX_VALUE;
        while(i<blocks.length()){
            if(blocks.charAt(i)=='W') count++;
            if(i-j+1==k){
                max=Math.min(count,max);
                if(blocks.charAt(j)=='W') count--;
                j++;
            }
             i++;
        }
        return max;
    }
}