/* 
https://leetcode.com/problems/duplicate-zeros/
1089. Duplicate Zeros
Easy

1755

553

Add to List

Share
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

 

Example 1:

Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: arr = [1,2,3]
Output: [1,2,3]
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Constraints:

1 <= arr.length <= 104
0 <= arr[i] <= 9
*/

package Urok2;

import java.util.Arrays;

public class leetCode1089 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 0, 4, 5 };
        System.out.println(Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) {
                sdvigMassiva(arr, i);
                i++;
            }
    }

    public static void sdvigMassiva(int[] array, int begNum) {
        for (int i = array.length - 1; i > begNum; i--) {
            array[i] = array[i - 1];
        }
        
    }
}
