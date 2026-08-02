class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0, maxlength = 0;
        List<Character> list = new ArrayList<>();
        while(end < n){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end += 1;
                maxlength = Math.max(maxlength, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start += 1;
            }
        }
        return maxlength;
    }
}