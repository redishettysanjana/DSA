class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }

        }
        // if the digit is 9,99,999......create new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}