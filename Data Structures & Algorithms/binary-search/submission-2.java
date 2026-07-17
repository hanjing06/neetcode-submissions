class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right){ //loop will keep going until the last number
            int mid = left+(right-left)/2;

            if(target==nums[mid]){ //the search stops when the target is equal to value of mid index
                return mid;
            }

            if(target>nums[mid]){ //search right of mid index
                left=mid+1;
            }

            else{
                right=mid-1; //search left of mid index
            }
        }
        return -1;
}

}
