// Author: Atharv Damle
// To print out the level order traversal of a binary search tree.
// Full Question: https://www.hackerrank.com/challenges/30-binary-trees/problem

/**
  * Level order traversal: Look at all the nodes at the current level in the tree, then go down one level and repeat.
  * Level order traversal of a binary search tree is implemented as a simple Breadth First Search.
*/
static void levelOrder(Node root){

    // Ideally use Deque instead of Queue and LinkedList...
    Queue<Node> q = new LinkedList<Node>();
    q.add(root);
    while (!q.isEmpty())
    {
        Node current = q.remove();
        System.out.print(current.data + " ");
        if (current.left != null)
        {
            q.add(current.left);
        }
        if (current.right != null)
        {
            q.add(current.right);
        }
    }

}
