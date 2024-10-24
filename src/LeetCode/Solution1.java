package LeetCode;

class Solution1 {

    // Method to calculate the maximum number of water bottles that can be drunk
    public int numWaterBottles(int n, int target) {
        int sum = n;
        while (n / target != 0) {
            sum += n / target;
            n = n / target + n % target;
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        // Hardcoded values for n (number of water bottles) and target (exchange rate)
        int n = 9;
        int target = 3;

        // Create an instance of the Solution class
        Solution1 solution = new Solution1();

        // Call the numWaterBottles method
        int result = solution.numWaterBottles(n, target);

        // Print the result
        System.out.println("Maximum number of water bottles that can be drunk: " + result);
    }
}

