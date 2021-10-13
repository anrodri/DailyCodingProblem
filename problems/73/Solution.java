public class Solution{
    
    // Reverse a LinkedList with a given Head in place -- Time Complexity: O(n)
    public Node reverseList(Node head){
        Node previous = null;
        Node current = head;
        Node forward = null;

        while(current != null){
            forward = current.next;
            current.next = previous;
            previous = current;
            current = forward;
        }
        head = previous;
        return head;
    }
}
