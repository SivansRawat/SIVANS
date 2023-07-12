class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int i = 0;  // a_pointer 
        int j = 0;  // b_pointer
        
        while(i<g.length && j<s.length){
            
            if(g[i] <= s[j]){
                i++;
                j++;
            }
            
            
            else{
                j++;
            }
        }
        
        
        return i;
        
    }
}