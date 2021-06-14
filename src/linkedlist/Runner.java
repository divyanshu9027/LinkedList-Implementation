package linkedlist;

public class Runner {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insert(5);
        ll.insert(2);
        ll.insert(5);
        ll.insert(10);
        ll.insert(1);

        ll.inserAtstart(27);

        ll.inserAt(2,79);

        ll.deleteAt(2);
        ll.show();

    }
}
