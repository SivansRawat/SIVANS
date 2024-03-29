class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        
        int[] freq = new int[26];
        int max = 0;
        for(char ch : s.toCharArray())
        {
            int idxFromChar = ch-'a';
            max = Math.max(max, ++freq[idxFromChar]);
        }

        for(int freqValue : freq)
        {
            if(freqValue != 0 && freqValue != max) 
                return false;
        }
        return true;
    }
}