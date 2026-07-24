class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int n = nums.length;
        int h_count = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;

            } else if (nums[i] == 0) {
                if (count > h_count) {
                    h_count = count;
                    count = 0;

                }
                else{
                    count=0;
                }
            }

        }
        if (count > h_count) {
            return count;
        } else {
            return h_count;
        }

    }
}