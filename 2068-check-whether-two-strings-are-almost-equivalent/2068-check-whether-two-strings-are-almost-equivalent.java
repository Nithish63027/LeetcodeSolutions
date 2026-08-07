class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n = word1.length();
        int[] frequency = new int[26];
        for(int i = 0; i < n; i++){
            frequency[word1.charAt(i) - 'a'] = frequency[word1.charAt(i) - 'a'] + 1;
            frequency[word2.charAt(i) - 'a'] = frequency[word2.charAt(i) - 'a'] - 1;
        }
        for(int i = 0; i < 26; i++){
            if(Math.abs(frequency[i]) > 3){
                return false;
            }
        }
        return true;
    }
}