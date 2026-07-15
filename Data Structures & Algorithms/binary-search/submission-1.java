class Solution {
    public int search(int[] nums, int target) {

        //binary search bdf:
        //compare target with root
        //if target<root, go left, else go right
        //if target = nums[node], return index
        //else -1

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid]==target){
                return mid;
            }
            
            if(nums[mid]>target){ //search left
                right = mid-1;
            }else{
                left = mid + 1;
            }
        }
        return -1;

    }
}
