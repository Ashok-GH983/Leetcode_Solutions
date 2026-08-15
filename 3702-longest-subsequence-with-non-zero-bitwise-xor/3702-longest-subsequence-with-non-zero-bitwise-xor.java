class Solution {
    public static boolean checkBit(int n,int pos)
    {
        return (n&(1<<pos))!=0;
    }
    public int longestSubsequence(int[] nums) {
       int xor = 0;
        boolean hasNonZero = false;

        for(int num : nums) {
            xor ^= num;

            if(num != 0) {
                hasNonZero = true;
            }
        }

        if(xor != 0)
            return nums.length;

        return hasNonZero ? nums.length - 1 : 0;
    }
}