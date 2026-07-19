class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);

        }
        int uniquesize = set.size();

        int i = 0;
        for (int sets : set) {
            nums[i] = sets;
            i++;
        }
        Arrays.sort(nums,0,uniquesize);
            return uniquesize;
    }
}