import java.util.ArrayList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        MySinglyLinkedList myList1 = new MySinglyLinkedList();
        MySinglyLinkedList myList2 = new MySinglyLinkedList();
        MySinglyLinkedList myList3 = new MySinglyLinkedList();

        myList1.add(1);
        myList1.add(3);
        myList1.add(6);
        myList1.add(7);

        myList2.add(2);
        myList2.add(4);
        myList2.add(5);

        for (int i = 0; i < 10; i++) {
            myList3.add(i);
        }
        myList3.printNodes();

        System.out.println("*******************************************************");

        Node newHead = MergeTwoLinkedList.mergeLinkedLists(myList1.head, myList2.head);

        while (newHead != null) {
            System.out.print(newHead.id + " ");
            newHead = newHead.next;
        }
        System.out.println();
        myList3.deleteById(3);
        myList3.printNodes();


    }
}