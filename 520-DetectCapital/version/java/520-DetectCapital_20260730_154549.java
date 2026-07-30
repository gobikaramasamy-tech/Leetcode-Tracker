// Last updated: 7/30/2026, 3:45:49 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3
4        int step = k * 2;
5        char[] arr = s.toCharArray();
6
7        for(int i = 0; i < arr.length; i += step){
8
9            int start = i;
10            int end = Math.min(i + k - 1, arr.length - 1);
11
12            while(start < end){
13
14                char temp = arr[start];
15                arr[start] = arr[end];
16                arr[end] = temp;
17
18                start++;
19                end--;
20            }
21        }
22
23        return new String(arr);
24    }
25}