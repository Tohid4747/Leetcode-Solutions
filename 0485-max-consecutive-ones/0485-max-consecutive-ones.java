class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int h_count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;

            }
            if(nums[i]==0){
                if(count>h_count){
                    h_count=count;
                    count=0;
                }
                else{
                    count=0;
                }
            }
        }
        if(count>h_count){
            return count;
        }
        else{
            return h_count;
        }
        
    }
}