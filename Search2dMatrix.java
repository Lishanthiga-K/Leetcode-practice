class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1;
        while(top<=bottom){
            int mid = (top+bottom)/2;
            if(matrix[mid][0]<target && matrix[mid][matrix[mid].length-1]>target){
                break;
            }
            else if(matrix[mid][0]>target){
                bottom = mid-1;
            }
            else{
                top = mid + 1;
            }
        }
        int row = (top+bottom)/2;
        int left = 0,right=matrix[row].length-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return false;
    }
}
