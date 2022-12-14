package task29;

import java.util.Objects;

public class LinkedList {
    private Node head;

    private int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    LinkedList(Item[] items) {
        for (Item item : items) {
            add(item);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean add(Item item) {
        if (head == null) {
            head = new Node(item, null, null);
            head.nextItem = head;
            head.prevItem = head;
        } else {
            Node tmp = head;
            while (tmp.nextItem != head) {
                tmp = tmp.nextItem;
            }
            tmp.nextItem = new Node(item, tmp, head);
            head.prevItem = tmp.nextItem;
        }
        size++;
        return true;
    }

    public boolean remove(String name) {
        Node tmp = head;
        if (tmp == null) {
            return false;
        }

        if (head.item.getName().equals(name)) {
            head.prevItem.nextItem = head.nextItem;
            head.nextItem.prevItem = head.prevItem;
        }
        while (tmp.nextItem != head && !tmp.item.getName().equals(name)) {
            tmp = tmp.nextItem;
        }

        if (tmp.nextItem != head && tmp.prevItem != head) {
            tmp.prevItem.nextItem = tmp.nextItem;
            tmp.nextItem.prevItem = tmp.prevItem;
        }
        size--;
        return true;
    }

    public int contains(Item item) {
        Node tmp = head;
        int count = 0;

        while (tmp != null) {
            if (item.getPrice() == tmp.item.getPrice()
                    && item.getName() == tmp.item.getName()
                    && item.getDescription() == tmp.item.getDescription()) {
                count++;
                tmp = tmp.nextItem;
            } else {
                tmp = tmp.nextItem;
            }
        }
        return count;
    }

    public int contains(String name) {
        Node tmp = head;
        int count = 0;

        while (tmp != null) {
            if (Objects.equals(name, tmp.item.getName())) {
                count++;
                tmp = tmp.nextItem;
            } else {
                tmp = tmp.nextItem;
            }
        }
        return count;
    }

    public Item[] convertToArray() {
        Node tmp = head;

        Item[] newArray = new Item[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = tmp.item;
            tmp = tmp.nextItem;
        }
        return newArray;
    }

    public Item get(int i) {
        if (i > size) {
            return null;
        }

        int count = 0;

        Node tmp = head;

        while (tmp != null && count++ != i) {
            tmp = tmp.nextItem;
        }

        return (tmp != null) ? tmp.item : null;
    }
}
