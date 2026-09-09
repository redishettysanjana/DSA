class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            // If this is the last number OR the next number is not consecutive
            if (i == nums.length - 1 || nums[i + 1] != nums[i] + 1) {

                if (start == i) {
                    result.add("" + nums[start]);
                } else {
                    result.add(nums[start] + "->" + nums[i]);
                }

                start = i + 1;
            }
        }

        return result;
    }
}