// Last updated: 7/9/2026, 3:19:45 PM
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        boolean[] visited = new boolean[nums.length];
        backtrack(nums, visited, new ArrayList<>(), ans);

        return ans;
    }

    private void backtrack(int[] nums, boolean[] visited,
                           List<Integer> temp,
                           List<List<Integer>> ans) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) continue;

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
                continue;

            visited[i] = true;
            temp.add(nums[i]);

            backtrack(nums, visited, temp, ans);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}