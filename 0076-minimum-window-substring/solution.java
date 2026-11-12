class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Frequency map for characters in t
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int requiredTypeCount = 0; // Number of unique characters in t that need to be matched
        for (int count : need) {
            if (count > 0) requiredTypeCount++;
        }

        int formed = 0; // How many unique characters currently match the desired frequency
        int[] windowCounts = new int[128];

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCounts[c]++;

            if (need[c] > 0 && windowCounts[c] == need[c]) {
                formed++;
            }

            // Try and contract the window until it ceases to be 'desirable'
            while (l <= r && formed == requiredTypeCount) {
                c = s.charAt(l);

                // Update the smallest window found so far
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                // Character at the left pointer is about to be excluded from the window
                windowCounts[c]--;
                if (need[c] > 0 && windowCounts[c] < need[c]) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }
}
