class Solution {
    int sum(int n){
        int ans=0,rem=0;
        while(n>0){
            rem = n%10;
            ans += rem * rem;
            n/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1 && n>1){
            n = sum(n);
            if(set.contains(n))
                return false;
            set.add(n);
        }
        if(n==1)
            return true;
        return false;
    }
}
