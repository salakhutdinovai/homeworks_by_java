public class Main {
    public static void main(String[] args) {
        Node<String> a = new Node<>("Привет");
        Node<String> b = new Node<>("Марсель");
        Node<String> c = new Node<>("Как дела");
        Node<String> d = new Node<>("Что нового");
        Node<String> e = new Node<>("Пока");

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);

        Node<String> current = a;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
