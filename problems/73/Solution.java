public class Solution{

    public class Node{
        int data = 0;
        Node next = null;

        public Node(int num){
            data = num;
        }
    }
    //Reverse a LinkedList with a given Head in place -- Time Complexity: O(n)
    public static Node reverseList(){
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