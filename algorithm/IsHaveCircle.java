public class IsHaveCircle {

    static class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public static boolean isHaveCircleAndMeetWhere(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node a = head;
        Node b = head;

        while (b.next.next != null) {
            a = a.next;
            b = b.next.next;
            if (a == b) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n4;
        System.out.println(isHaveCircleAndMeetWhere(n1));
    }


}
