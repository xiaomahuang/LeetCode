import tree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {
	static {

	}

	public boolean canWinNim(int n) {
		if ((n % 4) != 0) {
			return true;
		}
		return false;
	}

	public int addDigits(int num) {

		while (num > 9) {
			int a = 0;
			do {
				a += num % 10;
				num = num / 10;
			} while (num > 0);
			num = a;
		}
		return num;

	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {

		}

		return 0;

	}

	public void moveZeroes(int[] nums) {
		int a = nums.length;
		int[] numsCopy = new int[a];
		int total = 0;
		int rum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				total++;
			} else {
				numsCopy[rum] = nums[i];
				rum++;
			}
		}
		for (int i = 0; i < total; i++) {
			numsCopy[a - i - 1] = 0;
		}
		for (int i = 0; i < numsCopy.length; i++) {
			System.out.println(numsCopy[i]);
		}
		nums = numsCopy;
		for (int i = 0; i < numsCopy.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public boolean isAnagram(String s, String t) {
		if (s.isEmpty() && t.isEmpty()) {
			return true;
		}
		if ((!s.isEmpty() && t.isEmpty()) || (s.isEmpty() && !t.isEmpty())) {
			return false;
		}
		if (s.length() != t.length()) {
			return false;
		}
		char[] cs = new char[27];
		int[] is = new int[27];
		char[] cs2 = new char[27];
		int[] is2 = new int[27];
		int num = 1;
		int num2 = 1;
		cs[0] = s.charAt(0);
		cs2[0] = t.charAt(0);
		is[0] = 1;
		is2[0] = 1;
		for (int i = 1; i < s.length(); i++) {
			int a = 0;
			int b = 0;
			for (int j = 0; j < cs.length; j++) {
				if (cs[j] == s.charAt(i)) {
					is[j]++;
					a++;
				}
			}
			for (int j = 0; j < cs2.length; j++) {
				if (cs2[j] == t.charAt(i)) {
					is2[j]++;
					b++;
				}
			}
			if (a == 0) {
				cs[num] = s.charAt(i);
				is[num]++;
				num++;
			}
			if (b == 0) {
				cs2[num2] = t.charAt(i);
				is2[num2]++;
				num2++;
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.println(cs[i] + ":" + is[i]);
		}
		for (int i = 0; i < num2; i++) {
			System.out.println(cs2[i] + ":" + is2[i]);
		}

		for (int i = 0; i < num; i++) {
			char arg0 = cs[i];
			int a = 0;
			for (int j = 0; j < num2; j++) {

				if (arg0 == cs2[j]) {
					if (is[i] != is2[j]) {
						return false;
					}
					a++;
				}

			}
			if (a == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		if (nums.length == 0) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			int a = nums[i];
			if (i == nums.length - 1) {
				return false;
			}
			if (a == nums[i + 1]) {
				return true;
			}

		}
		return false;
	}

	public int titleToNumber(String s) {
		if (s == null) {
			return 0;
		}
		char[] cs = s.toCharArray();
		int num = 0;
		for (int i = 0; i < cs.length; i++) {

			num += (cs[i] - 64) * (Math.pow(26, cs.length - i - 1));
		}
		return num;

	}

	public boolean findNumber(int[][] matrix, int num) {
		// System.out.println(matrix.length);
		// System.out.println(matrix[0].length);
		if (matrix == null) {
			return false;
		}
		int raw = 0;
		int column = matrix[0].length - 1;
		while (raw < matrix.length && column >= 0) {
			if (matrix[raw][column] > num) {
				column--;
			} else if (matrix[raw][column] < num) {
				raw++;
			} else {
				return true;
			}

		}
		return false;
	}

	public String replaceBlank(String string) {
		if (string == null && string.length() <= 0) {
			return null;
		}
		List<Integer> integers = new ArrayList<Integer>();
		List<String> arrayList = new ArrayList<String>();
		arrayList.get(3);
		char[] cs = string.toCharArray();
		int length = string.length();
		int blank_num = 0;
		for (int i = 0; i < length; i++) {
			if (cs[i] == ' ') {
				blank_num++;
			}
		}
		int num = length + blank_num * 2;

		char[] newString = new char[num];
		num--;
		for (int i = 0; i < length; i++) {
			if (cs[length - i - 1] == ' ') {
				newString[num--] = '0';
				newString[num--] = '2';
				newString[num--] = '%';
			} else {
				newString[num--] = cs[length - i - 1];
			}
		}
		// char[] cs = string.toCharArray();
		// StringBuilder builder = new StringBuilder();
		// for (int i = 0; i < cs.length; i++) {
		// if (cs[i] == ' ') {
		// builder.append("%20");
		// } else {
		// builder.append(cs[i]);
		// }
		// }
		int i = 4;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer integer = new Integer(i);
		return String.valueOf(newString);

	}

	public int findMin(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		} else {
			int minNum = findMin(nums, 0, nums.length - 1);
			return nums[minNum];
		}
	}

	public int findMin(int[] nums, int start, int end) {
		int mid = (start + end) / 2;
		while ((end - start) != 1) {
			if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
				mid = find(nums, start, end);
			} else {
				if (nums[mid] <= nums[end]) {
					mid = findMin(nums, start, mid);
				}
				if (nums[mid] >= nums[start]) {
					mid = findMin(nums, mid, end);
				}
			}
		}
		return mid;
	}

	public int find(int[] nums, int start, int end) {
		int result = nums[start];
		for (int i = start; i < end; i++) {
			if (result > nums[i]) {
				return i;
			}
		}
		return 0;
	}

	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			System.out.println(n - 1);
			n = (n - 1) & n;
		}
		return count;
	}

	public double power(double base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		double result = power(base, exponent >> 1);
		result *= result;
		if ((exponent & 0x1) == 1) {
			result *= base;
		}
		return result;
	}

	public void printMax(int n) {
		char[] cs = new char[n];
		for (int i = 0; i < cs.length; i++) {
			cs[i] = '0';
		}

	}

	public List<Integer> spiralOrder(int[][] matrix) {
		if (matrix == null) {
			return null;
		}
		if (matrix.length == 0 || matrix[0].length == 0) {
			return null;
		}
		int row = matrix.length - 1;
		int column = matrix[0].length - 1;
		List<Integer> list = new ArrayList<Integer>();
		return getList(0, 0, list, matrix, row, column);

	}

	public List<Integer> getList(int startx, int starty, List<Integer> list,
			int[][] matrix, int row, int column) {
		if (starty == column - starty) {
			for (int i = startx; i <= row - startx; i++) {
				System.out.println(matrix[i][column - starty]);
				list.add(matrix[i][column - starty]);
				return list;
			}
		}
		if (startx == (row - startx)) {
			for (int i = starty; i <= column - starty; i++) {
				list.add(matrix[startx][i]);
				System.out.println(matrix[startx][i]);
				return list;
			}
		}
		if (2 * starty > column - 1 || 2 * startx > row - 1) {
			return list;
		}
		for (int i = starty; i < column - starty; i++) {
			list.add(matrix[startx][i]);
			System.out.println(matrix[startx][i]);
		}
		for (int i = startx; i < row - startx; i++) {
			list.add(matrix[i][column - starty]);
			System.out.println(matrix[i][column - starty]);
		}
		for (int i = column - starty; i > starty; i--) {
			list.add(matrix[row - startx][i]);
			System.out.println(matrix[row - startx][i]);
		}
		for (int i = row - startx; i > startx; i--) {
			list.add(matrix[i][starty]);
			System.out.println(matrix[i][starty]);
		}
		return getList(startx + 1, starty + 1, list, matrix, row, column);
	}

	Queue<Integer> queue = new LinkedList<Integer>();

	public void name() {
		queue.offer(2);
		queue.size();
		queue.poll();
		int i = 0;
		for (; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("i:" + i);
	}

	ListNode listNode = null;

	public TreeNode sortedListToBST(ListNode head) {
		if (head == null) {
			return null;
		}
		int size = 0;
		listNode = head;
		while (head != null) {
			size++;
			head = head.next;
		}
		TreeNode node = getTree(0, size - 1);
		return node;
	}

	private TreeNode getTree(int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode leftTreeNode = getTree(start, mid - 1);
		TreeNode node = new TreeNode(listNode.val);
		node.left = leftTreeNode;
		TreeNode rightTreeNode = getTree(mid + 1, end);
		node.right = rightTreeNode;
		return node;

	}

	public TreeNode sortedArrayToBST(int[] nums) {

		if (nums.length == 0) {
			return null;
		}
		TreeNode node = convertToTree(nums, 0, nums.length - 1);
		return node;
	}

	public TreeNode convertToTree(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		TreeNode node = new TreeNode(nums[(start + end) / 2]);
		node.left = convertToTree(nums, start, (start + end) / 2 - 1);
		node.right = convertToTree(nums, (start + end) / 2 + 1, end);
		return node;
	}

	List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		Map<Integer, Integer> maps = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			maps.put(i, nums[i]);
		}
		createList(list, null);
		return lists;
	}

	private void createList(List<Integer> list1, List<Integer> list2) {
		if (list1.size() == 0) {
			lists.add(list2);
		}
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			int i = (Integer) iterator.next();
			List<Integer> listCopy = new ArrayList<Integer>(list1);
			List<Integer> listNum = new ArrayList<Integer>();
			listCopy.remove(listCopy.indexOf(i));
			listNum.add(i);
			createList(listCopy, new ArrayList<Integer>(listNum));
		}
	}
}
