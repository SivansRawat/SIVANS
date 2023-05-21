class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        int ind = 0;
        int M = mat[0].length;
        int N = mat.length;
        int max = 0;
        for(int i=0;i<N;i++){
            int count=0;
            
            for(int j=0;j<M;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            
            if(count>max){
                max= count;
                ind = i;
                
            }
        }
        
        arr[0] = ind;
        arr[1] = max;
        return arr;
    }
}