package dsa_stringNlist;

public class LinkedreverseList {
	//206. Reverse Linked List

    // Reverse the linked list
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, temp;
        while (curr != null) {
            temp = curr.next;  // Store next node
            curr.next = prev;  // Reverse current node's pointer
            prev = curr;       // Move prev one step forward
            curr = temp;       // Move curr one step forward
        }
        return prev; // prev will be the new head after reversal
    }

    // Helper function to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method to test reverse function
    public static void main(String[] args) {
        LinkedreverseList solution = new LinkedreverseList();

        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        solution.printList(head);

        // Reverse the linked list
        ListNode reversedHead = solution.reverseList(head);

        System.out.print("Reversed List: ");
        solution.printList(reversedHead);
    }

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
