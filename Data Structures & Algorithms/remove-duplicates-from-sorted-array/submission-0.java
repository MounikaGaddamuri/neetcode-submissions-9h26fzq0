class Solution {
    public int removeDuplicates(int[] nums) {

        int i=0; 
        TreeSet<Integer> set = new TreeSet<>();
        for(int n: nums)
            set.add(n);

        for(int n: set)
            nums[i++] = n;
        
        return set.size();
    }
}