// Last updated: 7/9/2026, 3:14:07 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int a=0;
       for(int i=0;i<mat.length;i++) {
        for(int j=0;j<mat.length;j++){
            if(i==j||i+j==mat.length-1)
            a+=mat[i][j];
        }
       }
       return a;
    }
}