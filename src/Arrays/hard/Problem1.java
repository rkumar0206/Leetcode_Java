package Arrays.hard;

// Median of Two Sorted Arrays

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */

import java.util.Arrays;

public class Problem1 {

    public static void main(String[] args) {

        int[] n = {2};
        int[] k = {};

        System.out.println(new Problem1().findMedianSortedArrays(n, k));

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);

        Arrays.sort(mergedArray);

        int mergedArrayLength = mergedArray.length;
        int n = mergedArrayLength - 1;

        if(mergedArrayLength == 1) {

            return mergedArray[0];
        }

        double median;

        if (mergedArrayLength % 2 == 0) {

            int a = mergedArray[n] / 2;
            int b;

            if (a == 0) {
                b = 0;
            }else {
                b = mergedArray[n] / 2 + 1;
            }

            median = (a + b) / 2f;
        } else {

            median = (mergedArray[n] + 1) / 2f;
        }

        return median;
    }
}
