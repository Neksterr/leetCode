import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }

        return  ans;
    }

    public static void main(String[] args) {
        Solution solve = new Solution();
        int[] myArray = {3, 3};

        System.out.println(Arrays.toString(twoSum(myArray, 6)));


    }


}
