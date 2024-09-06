class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;

        for ( int i = 0; i < N; i++ ) {

         for ( int j = i + 1; j < N; j++) {

            if ( nums[i] + nums[j] == target) {

                return new int[] { i, j };

            }
        }
    } // Empty array if no solution have found
     return new int[0];
} 
  public static void main(String[] args) {
    Solution solution = new Solution();
    // Case 1
    int[] nums1 = { 2, 7, 11, 15 };
    int target1 = 9;
    int[] result1 = solution.twoSum(nums1, target1);
    System.out.println("Case 1: " + java.util.Arrays.toString(result1));

    // Case 2 
    int[] nums2 = { 3, 2, 4};
    int target2 = 6;
    int[] result2 = solution.twoSum(nums2, target2);
    System.out.println("Case 2: " + java.util.Arrays.toString(result2));

    // Case 3 
    int[] nums3 = { 3, 2, 4};
    int target3 = 6;
    int[] result3 = solution.twoSum(nums3, target3);
    System.out.println("Case 3: " + java.util.Arrays.toString(result3));

 }
}