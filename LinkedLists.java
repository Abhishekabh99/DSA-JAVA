class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Nthfromlast {
    public static void main(String[] args) {
        Node head = ib(null, 1); // inserting at begining
        ie(head, 2); // inserting at end
        ie(head, 3);
        ie(head, 4);
        ie(head, 5);
        ie(head, 6);
        ie(head, 7);
        ie(head, 8);
        ie(head, 9);
        display(head);
        System.out.println();
        System.out.println("Removing element from end");
        re(head);
        display(head);
        System.out.println();
        System.out.println("Removing element from begining");
        head = rb(head); // removing from begining
        display(head);
        System.out.println();
        System.out.println("Inserting node after 3rd element");
        ian(head, 1, 3);
        display(head); // fucntion to diplay linked list
        System.out.println();
        System.out.println("Removing element after 3rd node");
        ran(head, 3);
        display(head);

        rane(head, 7);
        System.out.println();
        System.out.println("Removing nth node from end");
        display(head);
        System.out.println();
        System.out.println("No of nodes present-:" + countNodes(head)); // printing number of nodes
    }

    // method to insert from begining
    public static Node ib(Node head, int data) {

        Node temp = new Node(data);
        if (head == null)
            return temp;
        temp.next = head;
        return temp;
    }

    // method to diplay linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // method to insert at the end of the linked list
    public static Node ie(Node head, int data) {
        Node temp = new Node(data);
        if (head == null) {
            return temp;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return head;
    }

    // method to remove elements from end
    public static Node re(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast.next != null) {

            fast = fast.next;
            slow = slow.next;
        }
        slow.next = null;
        return head;
    }

    // remove node from begining
    public static Node rb(Node head) {
        Node temp = head.next;
        return temp;
        // update your head with this fucntion
    }

    // method to count number of nodes in a linked list
    public static int countNodes(Node head) {
        int count = 1;
        Node temp = head;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // insert after nth node
    public static void ian(Node head, int data, int n) {
        Node temp = new Node(data);
        Node current = head;
        int count = 1;
        while (count < n) {
            count++;
            current = current.next;
        }
        temp.next = current.next;
        current.next = temp;
    }

    // delete after nth node
    public static void ran(Node head, int n) {
        Node curr = head;
        int count = 1;
        while (count < n) {
            count++;
            curr = curr.next;
        }
        if (curr.next != null && curr.next.next != null) {
            curr.next = curr.next.next;
        } else {
            curr.next = null; // Update the reference for the last node
        }
    }

    // remove node nth node from end
    public static void rane(Node head, int n) {
        Node curr = head;
        int countNodes = countNodes(head);
        int t = (countNodes - n);
        int count = 1;
        while (count < t) {
            count++;
            curr = curr.next;
        }
        if (curr.next != null && curr.next.next != null) {
            curr.next = curr.next.next;
        } else if (countNodes == 1) {
            curr = curr.next;
        } else {
            curr.next = null; // Update the reference for the last node
        }
    }
}
