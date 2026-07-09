// Last updated: 7/9/2026, 3:16:44 PM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        HashMap<Integer,Integer> ad = new HashMap<>();
        for(int i=0;i<n;i++){
            ad.put(nums[i] , ad.getOrDefault(nums[i],0)+1);

        }
        int m=n/3;
        List<Integer> lt = new ArrayList();
        for(Map.Entry<Integer,Integer> en : ad.entrySet()){
            if(en.getValue()>m) lt.add(en.getKey());
        }
        return lt;

        
    }
}