class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int j;

        for (int i =min ; i <= max; i++) {
                boolean found =false;
            for ( j = 0; j < nums.length; j++) {
                      if(nums[j]==i){
                           found=true;
                           break;
                      }
            }
          if(!found){
            list.add(i);
          }
        }
        return list;


}
}