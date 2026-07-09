// Last updated: 7/9/2026, 3:13:37 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int c=0;
        int s=0;
        for(int i:nums){
            c+=i;
            i++;

        }
        for(int i:nums){
            while(i>0){
                s+=i%10;
                i=i/10;
            
            }
 
        }
         return c-s;
    }
}