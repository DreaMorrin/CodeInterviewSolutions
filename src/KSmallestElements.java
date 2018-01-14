
public class KSmallestElements {
	
	static void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}
	
	static int partition(int[] nums, int low, int high) {
		int value = nums[high];
		
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (nums[j] < value) {
				swap(nums, ++i, j);
			}
		}
		swap(nums, i + 1, high);
		return i + 1;
	}
	
	static int quickSort(int[] nums, int low, int high, int k) {
		if (low < high) {
			int pivot = partition(nums, low, high);
			
			if (k == pivot) {
				return nums[pivot];
			}
			
			if (k < pivot) {
				return quickSort(nums, low, pivot - 1, k);	
			}
			
			if (k > pivot) {
				return quickSort(nums, pivot + 1, high, k);	
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] x = {2,3,46,7,8,9};
		int k = 2;
		System.out.println(quickSort(x, 0, x.length - 1, k - 1));

	}

}
