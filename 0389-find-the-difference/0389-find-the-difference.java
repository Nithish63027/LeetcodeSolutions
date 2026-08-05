class Solution {
    public char findTheDifference(String s, String t) {
        int total = 0;
        int m = s.length(), n = t.length();
        for(int i = 0; i <= n - 1; i++){
            total = total + t.charAt(i);
        }
        for(int i = 0; i <= m - 1; i++){
            total = total - s.charAt(i);
        }
        return (char) total;
    }
}