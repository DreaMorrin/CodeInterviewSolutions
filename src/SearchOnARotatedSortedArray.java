/*
 * Question:
Given a sorted array of integers that has been rotated, find a particular value in the array without finding the pivot.
 */
public class SearchOnARotatedSortedArray {

	static int find(int[] nums, int target) {

		int n = nums.length;

		if (n == 0) {
			return -1;
		}

		int start = 0;
		int end = n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				return mid;
			} else {
				if (nums[start] < nums[mid]) {
					if (target >= nums[start] && target < nums[mid]) {
						end = mid - 1;
					} else {
						start = mid + 1;
					}
				} else {
					if (target <= nums[end] && target > nums[mid]) {
						start = mid + 1;
					} else {
						end = mid - 1;
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] x = { 5, 6, 7, 8, 1, 2, 3, 4 };
		int target = 8;
		System.out.println(find(x, target));
	}

}
