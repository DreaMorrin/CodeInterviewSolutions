
public class Quicksort {
	
	static void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
	static int partition(int[] nums, int l, int r) {

		int value = nums[r];
		int i = l - 1;
		for (int j = l; j < r; j++) {
			if (nums[j] < value) {
				swap(nums, ++i, j);
			}
		}
		swap(nums, i + 1, r);
		return i + 1;
	}
	
	static void quickSort(int[] nums, int l, int r) {
		if (l < r) {
			int p = partition(nums, l, r);
			quickSort(nums, l, p - 1);
			quickSort(nums, p + 1, r);
		}
	}

	public static void main(String[] args) {
		int[] x = {3,45,6,752,65,4,1,7,8};
		quickSort(x, 0, x.length - 1);
		System.out.println(x);
	}

}
