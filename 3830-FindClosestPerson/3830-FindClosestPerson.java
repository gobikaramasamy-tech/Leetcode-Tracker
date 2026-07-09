// Last updated: 7/9/2026, 3:13:10 PM
class Solution {
    public int findClosest(int x, int y, int z) {
       int a=0;
       int b=0;
       if(x<z) a=z-x;
       else a=x-z;

       if(y<z) b=z-y;
       else b=y-z;
       if(a==b) return 0;
       else if(a>b) return 2;
       else return 1;
    }
}