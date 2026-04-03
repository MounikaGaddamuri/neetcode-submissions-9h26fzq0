class Solution {
    public int[] productExceptSelf(int[] nums) {

        int multiplicationResult=nums[0];
        int zeroCount=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==0){
                zeroCount++;
                continue;
            }
            multiplicationResult*=nums[i];
        }
        if(zeroCount>1)
            return new int[nums.length];

        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            
            if (zeroCount > 0)
                res[i] = (nums[i] == 0) ? multiplicationResult : 0;
            else 
                res[i] = multiplicationResult / nums[i];
        }

        return res;
    }
}  
