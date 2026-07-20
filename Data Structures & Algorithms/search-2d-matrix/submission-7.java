class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //search row by row using BS (log m)
        //then search column by column using BS (log n)
        //therefore log m + log n
        //O(log(m*n)
        
        int row = matrix.length;
        int col = matrix[0].length;

        //rows
        int top = 0;
        int bottom = row-1;

        //cols
        int left = 0;
        int right = col-1;

        while(top<=bottom){
            int mid = (top+bottom)/2;
            if(target > matrix[mid][left] && target > matrix[mid][right]){
                top = mid+1; //move down
            }else if(target < matrix[mid][left] && target < matrix[mid][right]){
                bottom = mid-1; //move up
            }else{
                break;
            }
        }

        row = (top+bottom)/2;

        while(left<=right){
            int mid = (left+right)/2;
            if(target > matrix[row][mid]){
                left = mid + 1;
            }else if(target < matrix[row][mid]){
                right = mid - 1;
            }else{
                return true;
            }
        }

        return false;

    }

}