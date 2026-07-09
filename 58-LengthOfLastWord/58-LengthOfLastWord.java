// Last updated: 7/9/2026, 3:19:28 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String last = s.substring(s.lastIndexOf(' ')+1);
        int count=last.length();
        return count;
        
    }
}