package leetCode;

public class searchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length -1;
        int mid = (l + r) / 2;
        while(l <= r){

            if(nums[mid] < target){
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
        if(nums[mid] < target){
            return mid + 1;
        } else {
            return mid;
        }
    }
}
