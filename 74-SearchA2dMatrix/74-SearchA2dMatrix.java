// Last updated: 7/9/2026, 3:19:04 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int t=0,b=m-1;
        while(t<=b){
            int row =t+(b-t)/2;
            if(target>matrix[row][n-1]){
                t=row + 1;
            }else if(target<matrix[row][0]){
                b=row-1;
            }else{
                int left =0,right=n-1;
                while(left<=right){
                    int mid = left+(right-left)/2;
                    if(matrix[row][mid] == target){
                        return true;
                    }else if(matrix[row][mid]<target){
                        left = mid + 1;
                    }else{
                        right = mid -1;
                    }
                }
                return false;
            }
        }
        return false;
        
    }
}