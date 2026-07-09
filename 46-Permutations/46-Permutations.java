// Last updated: 7/9/2026, 3:19:47 PM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        permutations(0, nums);
        return ans;
    }

    void permutations(int i, int[] nums) {

        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            ans.add(temp);
            return;
        }

        for (int j = i; j < nums.length; j++) {

            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;

            permutations(i + 1, nums);

            t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}