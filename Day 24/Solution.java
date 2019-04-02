// Author: Atharv Damle
// Remove duplicate values from a Linked List
// Full Question: https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

public static Node removeDuplicates(Node head) {
    Node current = head;
    while (current != null)
    {
        Node next = current.next;
        if (current.next != null && current.data == next.data)
        {
            current.next = next.next;
        }
        else
        {
            current = current.next;
        }
    }
    return head;
}
