class Solution {
    public int lengthOfLIS(int[] nums) {
        
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(nums[0]);
        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > ans.get(ans.size() - 1)) {
                ans.add(nums[i]);
                length++;
            } else {
                int index = lowerBound(ans, nums[i]);
                ans.set(index, nums[i]);
            }
        }
        return length;
        
    }
    
    
    
     private static int lowerBound(ArrayList<Integer> list, int target) {
        int low = 0;
        int high = list.size();

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}