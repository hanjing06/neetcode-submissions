class Solution {
    public int[] twoSum(int[] nums, int target) {
        //two pointers
        //go through array and compare
        //return an array

        int[]sums = new int[2]; //outputs two elements

        for(int i = 0; i<nums.length; i++){ //pointer 1 starts at index 0
            for(int j = i+1; j<nums.length; j++){ //pointer 2 starts at index 1
                if(nums[i]+nums[j]==target && i!=j){ //if pointer 1 + pointer 2 is equal to the targets number
                    sums[0]=i;
                    sums[1]=j;
                }
            }
        }

        return sums;
    }
}
