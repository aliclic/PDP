package model;

import java.util.Stack;

public class ReverseIterator implements Iterator<Node> {
    public Node cursor;
    public Stack<Node> pilha;

    public ReverseIterator(Node cursor) {
        pilha = new Stack<>();
        this.cursor = cursor;
        while (this.cursor != null) {
            pilha.push(cursor);
            this.cursor = cursor.getNext();
        }
    }

    @Override
    public Node getNext() {
        if (hasNext()) {
            return pilha.pop();
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return !pilha.isEmpty();
    }
}
