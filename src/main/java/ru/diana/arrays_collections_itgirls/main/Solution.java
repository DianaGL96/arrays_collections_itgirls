package ru.diana.arrays_collections_itgirls.main;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);
        System.out.println(Arrays.equals(result, expectedNums));
    }

    public static int[] removeDuplicates (int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        Arrays.fill(result, 0);
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                result[j++] = nums[i];
            }
        }
        return result;
    }
}
