public class MyLinkedList<E> implements MyList<E> {

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
            this.tail.setNext(newNode);
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
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
        } else {
            Node<E> previous = head;
            for (int i = 0; i < index - 1; i++) {
                previous = previous.getNext();
            }
            previous.setNext(previous.getNext().getNext());
            if (index == size - 1) {
                tail = previous;
            }
        }
        size--;
    }

    @Override
    public void remove(E element) {
        if (isEmpty()) {
            return;
        }

        if (head.getValue().equals(element)) {
            head = head.getNext();
            if (head == null) {
                tail = null;
            }
            size--;
            return;
        }

        Node<E> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(element)) {
                current.setNext(current.getNext().getNext());
                if (current.getNext() == null) {
                    tail = current;
                }
                size--;
                return;
            }
            current = current.getNext();
        }
    }

    @Override
    public int indexOf(E element) {
        Node<E> current = head;
        int index = 0;
        
        while (current != null) {
            if (current.getValue().equals(element)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "MyLinkedList[]";
        }

        StringBuilder result = new StringBuilder();
        result.append("MyLinkedList[");
        
        Node<E> current = head;
        while (current.getNext() != null) {
            result.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        result.append(current.getValue()).append("]");
        
        return result.toString();
    }
}