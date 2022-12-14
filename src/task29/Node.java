package task29;

public class Node {
    Item item;
    Node prevItem;
    Node nextItem;

    Node(Item item, Node prevItem, Node nextItem) {
        this.item = item;
        this.prevItem = prevItem;
        this.nextItem = nextItem;
    }

}
