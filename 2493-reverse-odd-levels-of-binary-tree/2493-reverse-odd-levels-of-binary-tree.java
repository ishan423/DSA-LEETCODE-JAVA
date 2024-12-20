/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int level = 0;

        while (!queue.isEmpty()) {
            List<TreeNode> currLevel = new ArrayList<>();

            int currentSize = queue.size();

            for (int i = 0; i < currentSize; i++) {
                TreeNode currentNode = queue.remove();

                currLevel.add(currentNode);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            if (level % 2 == 1) {
                int left = 0;
                int right = currLevel.size() - 1;

                while (left < right) {
                    int temp = currLevel.get(left).val;
                    currLevel.get(left).val = currLevel.get(right).val;
                    currLevel.get(right).val = temp;

                    left++;
                    right--;
                }
            }

            level++;
        }

        return root;
    }
}