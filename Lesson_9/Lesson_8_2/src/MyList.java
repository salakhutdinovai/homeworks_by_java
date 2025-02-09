public interface MyList<T> {
    void add(T element);
    T get(int index);
    void remove(int index);
    void remove(T element);
    int size();
    int indexOf(T element);
} 