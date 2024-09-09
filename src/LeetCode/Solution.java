package LeetCode;

import java.util.Scanner;

public class Solution {

    // Method to convert date to binary format
    public String convertDateToBinary(String date) {
        String y = date.substring(0, 4);
        String m = date.substring(5, 7);
        String d = date.substring(8, 10);
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(y)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(m)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(d)));
        return sb.toString();
    }

    // Main method to test the convertDateToBinary method
    public static void main(String[] args) {
        // Create a Solution object
        Solution solution = new Solution();

        // Get user input for the date
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in YYYY-MM-DD format: ");
        String date = scanner.nextLine();

        // Call the convertDateToBinary method
        String binaryDate = solution.convertDateToBinary(date);

        // Print the binary date
        System.out.println("Binary representation of the date: " + binaryDate);

        // Close the scanner
        scanner.close();
    }
}
