class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int sw=1;
        for(int i=0; i<nums.length; i++){
            sw=1;
            while(sw<=k && i+sw < nums.length){
                if(nums[i]==nums[i+sw])
                    return true;
            sw++;
            }
        }
        return false;
        
    }
}