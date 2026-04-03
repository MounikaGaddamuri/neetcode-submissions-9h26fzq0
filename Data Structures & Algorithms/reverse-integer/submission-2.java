class Solution {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        long rev = Long.parseLong(new StringBuilder(String.valueOf(x)).reverse().toString());

        rev *= sign;
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) rev;
    }
}
