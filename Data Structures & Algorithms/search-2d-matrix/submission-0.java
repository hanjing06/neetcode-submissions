class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //row 1: 1,2,4,8
        //row 2: 10,11,12,13
        //row 3: 14,20,30,40

        //target = 10 is [2][0]

        //start from greatest number is easier

        //start top right
        int i = 0; //start row 1
        int j = matrix[0].length - 1; //gives index 3
        
        while(i<matrix.length && j>=0){ //goes through each column of each row
            if(matrix[i][j] == target){
                return true;
            }
            if(target<matrix[i][j]){ //move left
                j--;
            }
            else{ //move down rows
                i++;
            }
        }

        return false;
    }
}
