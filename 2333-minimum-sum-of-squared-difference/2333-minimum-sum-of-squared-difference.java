class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) k1 + k2;

        int[] freq = new int[100001];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            freq[d]++;
            max = Math.max(max, d);
        }

        for (int d = max; d > 0 && k > 0; d--) {

            if (freq[d] == 0) {
                continue;
            }

            long operations = Math.min(k, freq[d]);

            freq[d] -= operations;
            freq[d - 1] += operations;
            k -= operations;
        }

        long sum = 0;

        for (int d = 1; d <= 100000; d++) {
            sum += (long) d * d * freq[d];
        }

        return sum;
    }
}