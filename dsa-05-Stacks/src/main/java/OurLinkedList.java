public class OurLinkedList {

    public static void main(String[] args) {
        OurNode head;

        head = new OurNode("Violetta");
        head.next = new OurNode("Kramer");
        head.next.next = new OurNode("Kadifa");
        head.next.next.next = new OurNode("Entisar");
        head.next.next.next.next = new OurNode("Adelina");
        head.next.next.next.next.next = new OurNode("Baha");

        head.next.next.next.next.next.next = head.next;

        System.out.println(detectCycle(head).name); // starting point of cycle - Kramer

    }
    static OurNode detectCycle(OurNode head){

        if (head==null || head.next == null){
            return null;
        }
        OurNode fast = head;
        OurNode slow = head;
        while (fast.next != null && slow != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                OurNode intersectionNode = fast;
                OurNode ourFirstNode = head;
                while (ourFirstNode != intersectionNode){
                    intersectionNode = intersectionNode.next;
                    ourFirstNode = ourFirstNode.next;
                }
                return ourFirstNode;
            }

        }
        return null;
    }
}
