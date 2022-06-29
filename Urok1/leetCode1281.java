/*
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
1281. Subtract the Product and Sum of Digits of an Integer
Easy

1288

190

Add to List

Share
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 

Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 

Constraints:

1 <= n <= 10^5
*/

package Urok1;

import java.io.*;

public class leetCode1281 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        int num = Integer.parseInt(br.readLine());

        System.out.print(Solution(num));
    }

    public static int Solution(int num) {
        int sum = 0, mult = 1;
        while (num != 0) {
            int d = num % 10;
            sum += d;
            mult *= d;
            num /= 10;
        }
        return mult-sum;
    }
}
