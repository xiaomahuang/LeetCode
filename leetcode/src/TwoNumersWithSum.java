import java.util.ArrayList;
import java.util.List;

public class TwoNumersWithSum {
	private int[] nums;
	private int sum;

	public TwoNumersWithSum(int[] nums, int sum) {
		this.nums = nums;
		this.sum = sum;
	}
	
	public boolean getInts(){
		if (nums==null||nums.length<2) {
			return false;
		}
		int i=0;
		int j=nums.length-1;
		while(nums[i]+nums[j]!=sum){
			if (nums[i]+nums[j]>sum) {
				j--;
			}else if (nums[i]+nums[j]<sum) {
				i++;
			}else {
				return true;
			}
			if (i==j) {
				return false;
			}
		}
		return true;
	}
	private List<List<Integer>> lists=new ArrayList<List<Integer>>();
	public List<List<Integer>> getLists(){
		if (nums==null||nums.length<2) {
			return null;
		}
		int i=0;
		int j=1;
		while (nums[i]<sum/2) {
			int a=0;
			if (j==nums.length) {
				return lists;
			}
			for (int k =i; k <j+1; k++) {
				a+=nums[k];
			}
			if (a>sum) {
				i++;
			}else if(a<sum){
				j++;
			}else {
				List<Integer> integers=new ArrayList<Integer>();
				for (int k =i; k <j+1; k++) {
					integers.add(nums[k]);
					System.out.println(nums[k]);
				}
				lists.add(integers);
			}
		}
		return lists;
	}
}
