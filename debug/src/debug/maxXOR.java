class Solution {
    public int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int resultSize = n * (n - 1) / 2;  // Since we are storing XOR of each pair once
        int[] result = new int[resultSize];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                result[index] = nums[i] ^ nums[j];
                index++;
            }
        }
        int max = 0;

        for (int i = 0; i < result.length; i++)
            if (result[i] > max)
                max = result[i];
        return max;
    }
}
