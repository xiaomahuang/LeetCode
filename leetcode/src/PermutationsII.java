import java.util.*;

/**
 * Created by majun on 16/9/2.
 */
public class PermutationsII {


    //这个答案是错误的
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return lists;
        }
        Arrays.sort(nums);
        helper(nums, 0);
        return lists;
    }

    public void helper(int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i : nums) {
                list.add(i);
            }
            lists.add(list);
            return;
        }
        int preNum = nums[index];
        for (int i = index; i < nums.length; i++) {
            if (i != index && (nums[i] == nums[index]|| nums[i] == preNum)) {
                continue;
            }
            swap(nums, index, i);
            helper(nums, index + 1);
            swap(nums, index, i);
            preNum=nums[i];
        }
    }

    public void swap(int[] nums, int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }


    //这个复杂度低
    public List<List<Integer>> permuteUnique1(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int num : nums) list.add(num);
        permute(list, 0, res);
        return res;
    }
    private void permute(LinkedList<Integer> nums, int start, List<List<Integer>> res){
        if (start == nums.size() - 1){
            res.add(new LinkedList<Integer>(nums));
            return;
        }
        for (int i = start; i < nums.size(); i++){
            if (i > start && nums.get(i) == nums.get(i - 1)) continue;
            nums.add(start, nums.get(i));
            nums.remove(i + 1);
            permute(nums, start + 1, res);
            nums.add(i + 1, nums.get(start));
            nums.remove(start);
        }
    }

//这个好理解
    public List<List<Integer>> permuteUnique2(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null || nums.length==0) return res;
        boolean[] used = new boolean[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        dfs(nums, used, list, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<Integer> list, List<List<Integer>> res){
        if(list.size()==nums.length){
            res.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i]=true;
            list.add(nums[i]);
            dfs(nums,used,list,res);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }
}