class Solution {
    public int characterReplacement(String s, int k) {
          int maxlen = 0;

        /*brute force solution
        
        for (int i = 0; i < s.length(); i++) {
            // Brute force: Try making the sequence out of every possible letter 'A' through 'Z'
            for (char target = 'A'; target <= 'Z'; target++) {
                int c = 0; // Reset modifications for this specific window and target character
                int currentLen = 0;
                
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == target) {
                        currentLen++;
                    } else if (c < k) {
                        // It's a mismatch, but we still have replacements left
                        c++;
                        currentLen++;
                    } else {
                        // Mismatch and out of replacements
                        break;
                    }
                }
                maxlen = Math.max(maxlen, currentLen);
            }
        }

        */
        int [] arr=new int[26];
        int l=0, maxf=0;
        for(int r=0;r<s.length();r++){

            arr[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,arr[s.charAt(r)-'A']);

            if((r-l+1)-maxf>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);

        }

        return maxlen;
    }
        
}
