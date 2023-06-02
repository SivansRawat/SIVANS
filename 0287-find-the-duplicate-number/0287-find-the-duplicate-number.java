class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int[] hash = new int[n + 1];
    for (int i = 0; i < n; i++) {
        hash[nums[i]]++;
    }
    int repeating = -1, missing = -1;
    for (int i = 1; i <= n; i++) {
        if (hash[i] >=2) {
            repeating = i;
        }
        if (hash[i] == 0) {
            missing = i;
        }
        if (repeating != -1 && missing != -1) {
            break;
        }
    }
        
        
    return repeating;
        
    }
    
    }


    
