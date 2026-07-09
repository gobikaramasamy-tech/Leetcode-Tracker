// Last updated: 7/9/2026, 3:13:07 PM
class Solution {
    public String reverseWords(String s) {
        String[] words =s.split(" ");
        int tv = cv(words[0]);
        for(int i=1;i<words.length;i++){
            if(cv(words[i]) == tv){
                words[i]=new StringBuilder(words[i]).reverse().toString();
            }
        }
        return String.join(" ",words);
    }
    private int cv(String words){
        int c=0;
        for(char ch : words.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
        }
        return c;
    }
}