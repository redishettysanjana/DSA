class Solution {
    public int romanToInt(String s) {

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'I') {

                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    total = total - 1;
                } 
                else {
                    total = total + 1;
                }
            }

            else if (s.charAt(i) == 'V') {
                total = total + 5;
            }

            else if (s.charAt(i) == 'X') {

                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    total = total - 10;
                } 
                else {
                    total = total + 10;
                }
            }

            else if (s.charAt(i) == 'L') {
                total = total + 50;
            }

            else if (s.charAt(i) == 'C') {

                if (i + 1 < s.length() && 
                    (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    total = total - 100;
                } 
                else {
                    total = total + 100;
                }
            }

            else if (s.charAt(i) == 'D') {
                total = total + 500;
            }

            else if (s.charAt(i) == 'M') {
                total = total + 1000;
            }
        }

        return total;
    }
}