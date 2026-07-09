// Last updated: 7/9/2026, 3:14:03 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans =0;
        for(int i=0;i<boxTypes.length;i++){
            int nums =boxTypes[i][0];
            int q = boxTypes[i][1];
            int boxTake = Math.min(nums,truckSize);
            truckSize = truckSize-boxTake;
            ans += boxTake * q;
        }
        return ans;   
    }
}