class Solution {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        int duplicate = x;
        x = Math.abs(x);
        long res = Long.parseLong(new StringBuilder(
            String.valueOf(x)).reverse().toString());

        if(duplicate < 0)
            res *= -1;
        if(res < -(1 << 31) || res > (1 << 31) -1)
            return 0;

        return (int) res;
    }
}
