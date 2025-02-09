package example01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements MyList<E> {

    private static class Node<T> {

        T value;

        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<E> head;

    private Node<E> tail;

    private int size;

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }

        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void remove(E element) {

    }

    @Override
    public int indexOf(E element) {
        Node<E> current = head;
        int index = 0;
        
        while (current != null) {
            if (current.value.equals(element)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    private class MyLinkedListIterator implements Iterator<E> {
        private Node<E> current = head; // текущий узел для итерации

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E value = current.value;
            current = current.next;
            return value;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }
}