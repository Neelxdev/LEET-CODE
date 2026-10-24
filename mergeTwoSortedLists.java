class Node{
    int val;
    Node next;

    Node(int data) {
        this.val = data;
    }

    Node(int data, Node next) {
        this.val = data;
        this.next = next;}
}

public class mergeTwoSortedLists {
    public static void main(String[] args) {
        printList(solution(new int[] {
            1,2,4
        }, new int[] {
            1,3,4
        }));
    }

    static Node solution(int[] nums1, int[] nums2) {
        Node head = new Node(0);
        Node tail = head;
        int i = 0, j = 0;
        while (i < nums1.length || j < nums2.length) {
            int val1 = i < nums1.length ? nums1[i] : Integer.MIN_VALUE;
            int val2 = j < nums2.length ? nums2[j] : Integer.MAX_VALUE;
            if (val1 < val2) {
                tail.next = new Node(nums1[i++]);
                tail = tail.next;
            } else {
                tail.next = new Node(nums2[j++]);
                tail = tail.next;
            }
        }
        return head.next;

    }

    // static void add(Node head, int val) {
    //     Node newNode = new Node(val);
    //     if (head == null) {
    //         head = newNode;
    //     }
    //     if (head.next == null) {
    //         head.next = newNode;
    //     }
    //     Node currNode = head;
    //     while (currNode.next != null) {
    //         currNode = currNode.next;
    //     }
    //     currNode.next = newNode;
    // }

    static void printList(Node head) {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val);
            if (currNode.next != null) {
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
    }
}
