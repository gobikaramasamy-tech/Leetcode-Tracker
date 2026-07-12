// Last updated: 7/12/2026, 6:44:14 PM
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        // Special case...
4        if (head == null || head.next == null)
5            return head;
6        // create a fake node that acts like a fake head of list pointing to the original head and it points to the original head......
7        ListNode fake = new ListNode(0);
8        fake.next = head;
9        ListNode curr = fake;
10        // Loop till curr.next and curr.next.next not null
11        while(curr.next != null && curr.next.next != null){         // curr.next means the next node of curr pointer and curr.next.next means the next of next of curr pointer...
12            // if the value of curr.next and curr.next.next is same...
13            // There is a duplicate value present in the list...
14            if(curr.next.val == curr.next.next.val) {
15                int duplicate = curr.next.val;
16                // If the next node of curr is not null and its value is eual to the duplicate value...
17                while(curr.next !=null && curr.next.val == duplicate) {
18                    // Skip those element and keep updating curr...
19                    curr.next = curr.next.next;
20                }
21            }
22            // Otherwise, move curr forward...
23            else{
24                curr = curr.next;
25            }
26        }
27        return fake.next;       // Return the linked list...
28    }
29}