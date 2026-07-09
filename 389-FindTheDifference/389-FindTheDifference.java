// Last updated: 7/9/2026, 3:15:50 PM
class Solution {
    public char findTheDifference(String s, String t) {
        char r=0;
        for(int i=0;i<s.length();i++){
            r^=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            r^=t.charAt(i);
        }
        return r;
        
    }
}