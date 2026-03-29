class Solution {
    public boolean isAnagram(String S, String T) {
        if (S.length() != T.length()) {
            return false;
        }
        
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : S.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : T.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }
        
        return charCount.isEmpty();
    }
}
