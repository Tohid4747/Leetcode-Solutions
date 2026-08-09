class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int cur = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // Add all missing numbers before nums[i]
            while (cur < nums[i]) {
                ans.add(cur);
                cur++;
            }

            // Skip duplicate numbers
            if (nums[i] == cur) {
                cur++;
            }
        }

        return ans;
    }
}