// Last updated: 7/9/2026, 3:13:00 PM
import java.util.Arrays;
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n=nums.length;
        long t =0;
        for(int i=0;i<k;i++){
            long cN = nums[n-1-i];
            long cM = mul-i;
            long con = Math.max(cN*cM,cN);
            t +=con;
        }
        return t;
    }
}