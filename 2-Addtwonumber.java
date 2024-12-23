import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Addtwonumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummy;
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummy.next;
    }

    // Helper method to create a linked list from user input
    public static ListNode createLinkedList() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter the values for the nodes:");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int i = 0; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number as a linked list:");
        ListNode l1 = createLinkedList();

        System.out.println("Enter the second number as a linked list:");
        ListNode l2 = createLinkedList();

        Addtwonumber solution = new Addtwonumber();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println("The result of adding the two numbers is:");
        printLinkedList(result);

        scanner.close();
    }
}
