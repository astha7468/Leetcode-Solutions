class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        int windowSize = s1.length();

       
        for (int right = 0; right < s2.length(); right++) {
            
            windowFreq[s2.charAt(right) - 'a']++;

           
            if (right >= windowSize) {
                windowFreq[s2.charAt(right - windowSize) - 'a']--;
            }

          
            if (right >= windowSize - 1) {
                if (matches(s1Freq, windowFreq)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}