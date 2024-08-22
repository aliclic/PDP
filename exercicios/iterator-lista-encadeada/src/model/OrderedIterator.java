package model;

public class OrderedIterator implements Iterator<Node> {
    public Node cursor;

    public OrderedIterator(Node root) {
        this.cursor = root;
    }

    @Override
    public Node getNext() {
        if (hasNext()) {
            Node current = cursor;
            cursor = cursor.getNext();
            return current;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return cursor != null;
    }

}
