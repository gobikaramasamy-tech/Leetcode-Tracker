// Last updated: 7/12/2026, 6:37:19 PM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5
6    public int firstBadVersion(int n) {
7        int low = 0;
8        int high = n;
9
10        while(low<=high){
11            int mid = low + (high-low)/2;
12            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
13            else if(isBadVersion(mid)==false ) low = mid+1;
14            else high= mid;
15        }     
16        return -1;
17    }
18}