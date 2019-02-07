// Author: Atharv Damle
// Create a function to insert a node at the end of a linked list.
/*
// Node class:
class Node {
	int data;
	Node next;
	Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

// Full Question: https://www.hackerrank.com/challenges/30-linked-list/problem

public static  Node insert(Node head,int data) {
    Node temp = new Node(data);
    Node current = head;
    
    // If list is empty...
    if (head == null)
    {
        head = temp;
    }
    else
    {
        // While there exists a next node,
        while (current.next != null)
        {
            // Go to the next node.
            current = current.next;
        }
        // Insert node at the end of list.
        current.next = temp;
    }
    return head;
}
