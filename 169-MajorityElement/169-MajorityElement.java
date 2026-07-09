// Last updated: 7/9/2026, 3:17:33 PM
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ad = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            ad.put(nums[i] ,ad.getOrDefault(nums[i],0)+1);
        }
        int m =  n/2; 
        for(Map.Entry<Integer,Integer> en : ad.entrySet()){
            if(en.getValue()>m) return en.getKey();
        }
        return 0;       
    }
}