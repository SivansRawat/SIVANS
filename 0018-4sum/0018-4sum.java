class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                long tSum = (long) target - nums[i] - nums[j];
                int l = j + 1, h = n - 1;

                while (l < h) {
                    if (nums[l] + nums[h] == tSum) {
                        List<Integer> oneAns = new ArrayList<>();
                        oneAns.add(nums[i]);
                        oneAns.add(nums[j]);
                        oneAns.add(nums[l]);
                        oneAns.add(nums[h]);
                        ans.add(oneAns);

                        while (l < h && nums[l] == nums[l + 1]) {
                            l++;
                        }
                        while (l < h && nums[h] == nums[h - 1]) {
                            h--;
                        }

                        l++;
                        h--;
                    } else if (nums[l] + nums[h] < tSum) {
                        l++;
                    } else {
                        h--;
                    }
                }
            }
        }

        return ans;
        
    }
}