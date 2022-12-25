public class Node {
    int id;  //null
    Node next;

    public Node(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", next=" + next +
                '}';
    }
}