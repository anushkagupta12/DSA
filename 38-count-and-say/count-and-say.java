class Solution {
    private static String getNext(String s) {
        StringBuilder next = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                next.append(count).append(s.charAt(i - 1));
                count = 1; 
            }
        }

        next.append(count).append(s.charAt(s.length() - 1));

        return next.toString();
    }

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String result = "1";

        // Iteratively compute the count-and-say sequence up to n
        for (int i = 2; i <= n; i++) {
            result = getNext(result);
        }

        return result;
    }
}