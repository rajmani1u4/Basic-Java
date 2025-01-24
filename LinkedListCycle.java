public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle if list is empty or has only one node
        }

        ListNode slow = head; // Slow pointer
        ListNode fast = head; // Fast pointer

        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow by one step
            fast = fast.next.next;      // Move fast by two steps

            if (slow == fast) {         // If slow and fast meet, a cycle is detected
                return true;
            }
        }

        return false; // No cycle if fast reaches the end
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Creates a cycle

        // Check for a cycle
        if (hasCycle(head)) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
