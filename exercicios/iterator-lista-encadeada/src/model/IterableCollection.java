package model;

public interface IterableCollection<T> {
    Iterator<T> createOrderedIterator();
    Iterator<T> createReverseIterator();
}
