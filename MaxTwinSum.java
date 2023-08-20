import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }

}

public class MaxTwinSum {
    public static void main(String[] args) {

        Node head = inputList();
        display(head);
        int d = maxTwinSum(head);
        System.out.println();
        System.out.println(d);
    }

    // user input linked list
    public static Node inputList() {
        Node head = null;
        Node tail = null; // Pointer to the last node
        int d = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Node " + (i + 1) + " of list");
            d = sc.nextInt();
            Node newNode = new Node(d);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // reverse linked list method
    public static Node rev(Node head) {
        Node prev = null;
        Node next = null;
        Node cur = head;

        while (cur != null) {
            next = cur.next; // cloning second node
            cur.next = prev; // breaking the chain and joining to prev
            prev = cur;
            cur = next;
        }
        return prev;
    }

    // display list method
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // maximum twin sum of linked list

    public static int maxTwinSum(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node first = head;
        Node half = rev(slow);
        int max = 0;
        while (half != null && first != null) {
            if (first.data + half.data >= max) {
                max = first.data + half.data;
            }

            first = first.next;
            half = half.next;

        }
        return max;
    }

}
