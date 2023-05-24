class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int N = arr1.length;
        int M = arr2.length;
        
         int[] ans = new int[N];
        
        Map<Integer,Integer> map = new TreeMap<>();
        
        for(int i =0;i<N;i++){
            
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
    
        }
            
        int k=0;
            
        for(int i=0;i<M;i++){
                
                if(map.containsKey(arr2[i])){
                    
                    while(map.get(arr2[i]) !=0){
                        ans[k++] = arr2[i];
                        map.put(arr2[i] , map.get(arr2[i])-1);
                    }
                }
            }
            
            
            if(N>k){
                
                for(Map.Entry<Integer,Integer> m : map.entrySet()){
                    
                    if(m.getValue()!=0){
                        
                        while(m.getValue()!=0){
                            ans[k++]= m.getKey();
                            map.put(m.getKey(),m.getValue()-1);
                        }
                    }
                }
            }
            
            
            
            
            return ans;
    }
}