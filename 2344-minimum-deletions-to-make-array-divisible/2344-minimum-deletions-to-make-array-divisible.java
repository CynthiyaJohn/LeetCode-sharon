import java.util.*;

class Solution {

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public int minOperations(int[] nums, int[] numsDivide) {

        Arrays.sort(nums);

        int g = numsDivide[0];

        for (int i = 1; i < numsDivide.length; i++) {
            g = gcd(g, numsDivide[i]);
        }

        for (int j = 0; j < nums.length; j++) {
            if (g % nums[j] == 0) {
                return j;
            }
        }

        return -1;
    }
}