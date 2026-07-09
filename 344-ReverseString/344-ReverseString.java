// Last updated: 7/9/2026, 3:16:04 PM
class Solution {
    public void reverseString(char[] s) {

        int start = 0;
        int end = s.length - 1;

        while(start <= end){

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}