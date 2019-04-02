// Author: Atharv Damle
// To practice using Stacks and Queues
// Full Question: https://www.hackerrank.com/challenges/30-queues-stacks/submissions/code/89555553

public class Solution {

    // Stacks and Queues are deprecated in Java 8.
    // Use Deque instead!
    // Stack<Character> s;
    // Queue<Character> q;

    // Stack variable
    Deque<Character> s;

    // Queue.
    Deque<Character> q;
    
    
    Solution()
    {
        // s = new Stack<Character>();
        // q = new LinkedList<Character>();

        s = new Deque<Character>();
        q = new Deque<Character>();
    }
    
    void pushCharacter(char c)
    {
        //s.push(c);
        s.addFirst(c);
    }
    
    void enqueueCharacter(char c)
    {
        //q.add(c);
        q.addLast(c);
    }
    
    char popCharacter()
    {
        // return s.pop();
        return s.removeFirst();
    }
    
    char dequeueCharacter()
    {
        // return q.remove();
        return q.removeFirst();
    }
}
