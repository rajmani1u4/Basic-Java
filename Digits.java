public class IncrementLargeInteger {
    public static int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // Otherwise, set the current digit to 0 and continue to the next digit
            digits[i] = 0;
        }
        
        // If all digits are 9, we need to add a 1 at the beginning of the array
        int[] result = new int[digits.length + 1];
        result[0] = 1; // All other elements in result array are 0 by default
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] digits1 = {1, 2, 3};
        System.out.println(java.util.Arrays.toString(plusOne(digits1))); // Output: [1, 2, 4]

        // Example 2
        int[] digits2 = {4, 3, 2, 1};
        System.out.println(java.util.Arrays.toString(plusOne(digits2))); // Output: [4, 3, 2, 2]

        // Example 3
        int[] digits3 = {9};
        System.out.println(java.util.Arrays.toString(plusOne(digits3))); // Output: [1, 0]

        // Example 4
        int[] digits4 = {9, 9, 9};
        System.out.println(java.util.Arrays.toString(plusOne(digits4))); // Output: [1, 0, 0, 0]
    }
}
