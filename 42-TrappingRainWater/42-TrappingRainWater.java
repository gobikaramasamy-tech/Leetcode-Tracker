// Last updated: 7/9/2026, 3:19:54 PM
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int prefix[] = new int[n];
        int sufix[] = new int[n];
        prefix[0] = height[0];
        sufix[n-1] = height[n-1]; 
        for(int i=1;i<n;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            sufix[i] = Math.max(sufix[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(prefix[i],sufix[i]);
            ans=ans-height[i];
        }
        return ans;
    }
}