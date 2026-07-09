// Last updated: 7/9/2026, 3:18:49 PM
class Solution {

    public int findArea(int[] nums){
        int n=nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int area=0;
        for(int i=0;i<=n;i++){
            while(!stack.isEmpty() && ((i==n) || (nums[stack.peek()]) >= nums[i])) {
                int height=nums[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                area=Math.max(area,width*height);
            }
            stack.push(i);
        }
        return area;
    }

    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] temp=new int[m];
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){
                    temp[j]+=1;
                }else{
                    temp[j]=0;
                }
            }
            int current=findArea(temp);
            res=Math.max(res,current);
        }
        return res;

    }
}