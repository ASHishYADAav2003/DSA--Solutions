class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        // Step 1: Count frequency of every character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int freq = charFreqMap.getOrDefault(c, 0);//

            charFreqMap.put(c, freq + 1);
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            if (charFreqMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}