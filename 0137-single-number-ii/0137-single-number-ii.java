class Solution {
    public int singleNumber(int[] nums) {
     
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i=i+3){
            if(i==(nums.length-1)) return nums[nums.length-1];
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return 0;
        
    }
}