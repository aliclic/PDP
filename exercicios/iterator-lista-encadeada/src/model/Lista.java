package model;

public class Lista implements IterableCollection<Node> {
    private Node primeiroNo;
    private Node ultimoNo;
    private String desc;

    public Lista() {
        primeiroNo = null;
        ultimoNo = null;
        desc = "";
    }

    public void inserirNaFrente(Object item) {
        Node novoNo = new Node(item);
        if (estaVazia()) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setNext(primeiroNo);
            primeiroNo = novoNo;
        }
    }

    public void inserirNoFinal(Object item) {
        Node novoNo = new Node(item);
        if (estaVazia()) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            ultimoNo.setNext(novoNo);
            ultimoNo = novoNo;
        }
    }

    public Node removerDaFrente() {
        if (estaVazia()) {
            return null;
        } else {
            Node removido = primeiroNo;
            primeiroNo = primeiroNo.getNext();
            if (primeiroNo == null) {
                ultimoNo = null;
            }
            return removido;
        }
    }

    public Node removerDoFinal() {
        if (estaVazia()) {
            return null;
        } else if (primeiroNo == ultimoNo) {
            Node removido = ultimoNo;
            primeiroNo = ultimoNo = null;
            return removido;
        } else {
            Node atual = primeiroNo;
            while (atual.getNext() != ultimoNo) {
                atual = atual.getNext();
            }
            Node removido = ultimoNo;
            ultimoNo = atual;
            ultimoNo.setNext(null);
            return removido;
        }
    }

    public boolean estaVazia() {
        return primeiroNo == null;
    }

    @Override
    public Lista clone() {
        Lista novaLista = new Lista();
        Node atual = primeiroNo;
        while (atual != null) {
            novaLista.inserirNoFinal(atual.getData());
            atual = atual.getNext();
        }
        return novaLista;
    }

    public boolean localizaNode(String chave) {
        Node atual = primeiroNo;
        while (atual != null) {
            if (atual.getData().equals(chave)) {
                return true;
            }
            atual = atual.getNext();
        }
        return false;
    }

    @Override
    public Iterator<Node> createOrderedIterator() {
        return new OrderedIterator(primeiroNo);
    }

    @Override
    public Iterator<Node> createReverseIterator() {
        return new ReverseIterator(primeiroNo);
    }
}