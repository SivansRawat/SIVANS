class Solution {
    public int[] beautifulArray(int n) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(1);
        
        
        while(arr.size() < n){
            
        ArrayList<Integer> tmp = new ArrayList<>();
            
            for(int ele : arr  ){
                
                if(2 *ele -1 <=n ){
                    tmp.add(2*ele-1);
                }
                
            }
            
                
                for(int ele : arr){
                    if(2*ele <= n){
                        tmp.add(2*ele);
                    }
                }
            
            
                arr = tmp;
            
            }
            
            int[] res =  new int[n];
            for(int i=0;i<n;i++){
                res[i] = arr.get(i);
            }
            
            
            return res;
            
            
    }
}
    
