// Last updated: 7/12/2026, 6:39:07 PM
1// Brute force
2
3// class Solution {
4//     public int thirdMax(int[] nums) {
5//         List<Integer> list = new ArrayList<>();
6        
7//         for(int i=0; i<nums.length; i++) {
8//             if(!list.contains(nums[i])) {
9//                 list.add(nums[i]);
10//             }
11//         }
12
13//         Collections.sort(list);
14        
15//         if(list.size() < 3) {
16//             return list.get(list.size()-1);
17//         } else {
18//             return list.get(list.size()-3);
19//         }
20//     }
21// } 
22
23
24
25
26// Optimized solution
27
28class Solution {
29    public int thirdMax(int[] nums) {
30        Long first = null;
31        Long second = null;
32        Long third = null;
33
34        for(int num : nums) {
35            long n = num;
36
37            // skip duplicates
38            if((first != null && first == n) ||
39                (second != null && second == n) ||
40                (third != null && third == n)) {
41                continue;
42            }
43
44            if(first == null || n > first) {
45                third = second;
46                second = first;
47                first = n;
48            } else if(second == null || n > second) {
49                third = second;
50                second = n;
51            } else if(third == null || n > third) {
52                third = n;
53            }
54        }
55
56        return third == null ? first.intValue() : third.intValue();
57    }
58} 