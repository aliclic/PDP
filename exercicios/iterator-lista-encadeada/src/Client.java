import model.Iterator;
import model.Lista;
import model.Node;

public class Client {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserirNoFinal(new Node("Item 1"));
        lista.inserirNoFinal(new Node("Item 2"));
        lista.inserirNoFinal(new Node("Item 3"));

        System.out.println("Iterando em ordem:");
        Iterator<Node> orderedIterator = lista.createOrderedIterator();
        while (orderedIterator.hasNext()) {
            Node node = orderedIterator.getNext();
            System.out.println(node.getData());
        }

        System.out.println("\nIterando em ordem reversa:");
        Iterator<Node> reverseIterator = lista.createReverseIterator();
        while (reverseIterator.hasNext()) {
            Node node = reverseIterator.getNext();
            System.out.println(node.getData());
        }
    }
}