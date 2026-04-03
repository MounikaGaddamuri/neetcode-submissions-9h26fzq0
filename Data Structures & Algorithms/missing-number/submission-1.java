class Solution {
    public int missingNumber(int[] nums) {

        int missingNumber=0;
        for(int i=0; i<nums.length+1; i++)
            missingNumber ^= i;
        for(int i=0; i<nums.length; i++)
            missingNumber ^= nums[i];
            
        return missingNumber;
    }
}
