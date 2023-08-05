class Solution {
    public int distributeCandies(int[] candyType) {
        
        
        
        int n= candyType.length;
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        
        int typesOfNum= 0;

        for(int i : candyType) {
            min= Math.min(min, i);
            max= Math.max(max, i);
        }
        boolean arr[]= new boolean[max-min+1];

        for(int i : candyType) {
            int j= i - min;

            if(!arr[j]) {
                arr[j]= true;
                typesOfNum++;
            }
        }
        return Math.min(n/2, typesOfNum);
    }
}