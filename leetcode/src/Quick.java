public class Quick {
	public int sort(int[] arr, int low, int high) {
		if (arr.length == 0 || arr == null || low > high) {
			return 0;
		}
		int l = low;
		int h = high;
		int k = arr[h];
		int small = l - 1;
		for (int i = l; i < h; ++i) {
			if (arr[i] < k) {
				small++;
//				if (arr[small] != arr[i]) {
				if (small!=i) {
					int temp = arr[small];
					arr[small] = arr[i];
					arr[i] = temp;
				}
			}
		}
		small++;
		int temp=arr[small];
		arr[small]=arr[h];
		arr[h]=temp;
		return small;
	}
	public  void getSort(int[] arr, int low, int high) {
		if (low==high) {
			return;
		}
		int index=sort(arr, low, high);
		if (low<index) {
			getSort(arr, low, index-1);
		}
		if (index<high) {
			getSort(arr, index+1, high);
		}
	}
}
