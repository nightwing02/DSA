class Solution {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                result[i] = nums[i] ^ nums[j];
            }
        }
        int max = 0;

        for (int i = 0; i < result.length; i++)
            if (result[i] > max)
                max = result[i];
        return max;
    }
}
