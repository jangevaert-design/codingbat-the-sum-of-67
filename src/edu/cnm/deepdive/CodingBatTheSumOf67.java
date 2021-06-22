package edu.cnm.deepdive;

/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6
and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */

public class CodingBatTheSumOf67 {

  private static int[] one = {1, 2, 2};
  private static int[] two = {1, 2, 2, 6, 99, 99, 7};
  private static int[] three = {1, 1, 6, 7, 2};

  public static void main(String[] args) {
    System.out.println("with the array [1, 2, 2] the outcome is " + sum67(one) + ".");
    System.out.println("with the array [1, 2, 2, 6, 99, 99, 7] the outcome is " + sum67(two) + ".");
    System.out.println("with the array [1, 1, 6, 7, 2] the outcome is " + sum67(three) + ".");
  }

  public static int sum67(int[] nums) {

    int len = nums.length;
    int sum = 0;

    if (len == 0) {
      return 0;
    }

    for (int i = 0; i < len; i++) {
      if (nums[i] != 6) {
        sum += nums[i];
      } else {
        while (nums[i] != 7) {
          i++;
        }
      }
    }
    return sum;
  }

}
