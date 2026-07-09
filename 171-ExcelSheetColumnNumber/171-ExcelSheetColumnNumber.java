// Last updated: 7/9/2026, 3:17:32 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int r=0;
        for(int i=0;i<columnTitle.length();i++){
            int v=columnTitle.charAt(i) -'A'+1;
            r=r*26+v;

        }
        return r;

        
    }
}