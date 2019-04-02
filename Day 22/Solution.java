// Author: Atharv Damle
// To study binary search trees: implement a function to calculate height of the Binary Search Tree.
// Full Question: https://www.hackerrank.com/challenges/30-binary-search-trees/problem

/** Recursively get the height of the tree.
  * Calculate height of the left subtree, then the right subtree
  * Then return height as 1 + whichever subtree's height is greater.
*/
public static int getHeight(Node root){
    if (root == null)
    {
        return -1;
    }
    else
    {
        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (left > right)
        {
            return left+1;
        }
        else
        {
            return right+1;
        }
    }
}
