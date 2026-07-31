class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;
        Arrays.sort(nums);
        for (int current = 0; current < n; current++) {
            int i = current + 1;
            int j = n - 1;
            while (i < j) {

                if (nums[current] + nums[i] + nums[j] > 0) {
                    j--;

                } else if (nums[current] + nums[i] + nums[j] < 0) {
                    i++;

                }
                // else (nums[current] + nums[i] + nums[j] == 0) {
                else {
                    List<Integer> triplet = Arrays.asList(nums[current], nums[i], nums[j]);
                    Collections.sort(triplet);
                    set.add(triplet);
                    i++;
                    j--;                }
            }

        }
        return new ArrayList<>(set);

    }
}
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList<>();
//         int n = nums.length;

//         Arrays.sort(nums); // Step 1: sort

//         for (int current = 0; current < n; current++) {

//             // Step 2: skip duplicate current
//             if (current > 0 && nums[current] == nums[current - 1])
//                 continue;

//             int i = current + 1;
//             int j = n - 1;

//             while (i < j) {
//                 int sum = nums[current] + nums[i] + nums[j];

//                 if (sum < 0) {
//                     i++;
//                 } else if (sum > 0) {
//                     j--;
//                 } else {
//                     // Step 3: add directly (no sorting needed)
//                     result.add(Arrays.asList(nums[current], nums[i], nums[j]));

//                     i++;
//                     j--;

//                     // Step 4: skip duplicates for i
//                     while (i < j && nums[i] == nums[i - 1])
//                         i++;

//                     // Step 5: skip duplicates for j
//                     while (i < j && nums[j] == nums[j + 1])
//                         j--;
//                 }
//             }
//         }

//         return result;
//     }
// }