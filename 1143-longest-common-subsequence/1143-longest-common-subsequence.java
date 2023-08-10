class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int x = text1.length();
        int y = text2.length();
        
        int arr[][] = new int[x+1][y+1];
        for(int i=x; i>=0;i--){
            for(int j=y; j>=0; j--){
                if(i==x|| j==y){
                    arr[i][j]=0;
                }
                else if(text1.charAt(i)==text2.charAt(j)){
                    arr[i][j]= 1 + arr[i+1][j+1];
                }
                else if(text1.charAt(i)!=text2.charAt(j)){
                    arr[i][j] = Math.max(arr[i][j+1],arr[i+1][j]);
                }
            }
        }
        return arr[0][0];
        
        
    }
}