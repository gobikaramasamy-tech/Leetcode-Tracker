// Last updated: 7/9/2026, 3:18:50 PM
class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            // Virtual bar of height 0 to flush the stack
            int currentHeight = (i == n) ? 0 : heights[i];

            // Current bar is smaller,
            // so waiting bars can no longer extend right.
            while (!stack.isEmpty() &&
                   currentHeight < heights[stack.peek()]) {

                int height = heights[stack.pop()];

                // After popping:
                // i = first smaller bar on the right
                // stack.peek() = first smaller bar on the left
                int width = stack.isEmpty()
                        ? i
                        : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            // Current bar now waits for its own
            // first smaller bar on the right.
            stack.push(i);
        }

        return maxArea;
    }
}