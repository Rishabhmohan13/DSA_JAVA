import java.util.*;

class TreeNode {
	int val;
	TreeNode left, right;
	
	TreeNode(int x) {
		val = x;
		left = null;
		right = null;
	}
}

class Main {
	public static TreeNode buildTree(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(nums[0]);
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int i = 1;
		while (i < nums.length) {
			TreeNode curr = q.remove();
			if (i < nums.length) {
				curr.left = new TreeNode(nums[i++]);
				q.add(curr.left);
			}
			if (i < nums.length) {
				curr.right = new TreeNode(nums[i++]);
				q.add(curr.right);
			}
		}
		return root;
	}

	public static void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		printTree(root.left);
		System.out.print(root.val + " ");
		printTree(root.right);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
		TreeNode root = buildTree(nums);
		printTree(root);
	}
}
