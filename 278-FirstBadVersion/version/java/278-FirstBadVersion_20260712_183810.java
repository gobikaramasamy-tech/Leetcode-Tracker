// Last updated: 7/12/2026, 6:38:10 PM
1class Solution {
2    public int longestPalindrome(String s) {
3        int oddCount = 0;
4        Map<Character, Integer> map = new HashMap<>();
5        for (char ch : s.toCharArray()) {
6            map.put(ch, map.getOrDefault(ch, 0) + 1);
7            if (map.get(ch) % 2 == 1)
8                oddCount++;
9            else
10                oddCount--;
11        }
12        if (oddCount > 1)
13            return s.length() - oddCount + 1;
14        return s.length();
15    }
16}