import java.util.ArrayList;
class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num : nums) {
            String a = String.valueOf(num);
            for (char b : a.toCharArray()) {
                answer.add(b - '0');
            }
        }
        int[] finalAnswer = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            finalAnswer[i] = answer.get(i);
        }
        return finalAnswer;
    }
}
