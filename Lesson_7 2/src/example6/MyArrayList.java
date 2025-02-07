
package example6;

import java.util.Arrays;

public class MyArrayList<T> {

    private static final int INITIAL_SIZE = 10; // начальный размер массива
    private T[] elements; // массив для хранения элементов
    private int count; // количество элементов в списке

    public MyArrayList() {
        this.elements = (T[]) new Object[INITIAL_SIZE];
        this.count = 0;
    }

    // Добавить элемент в список
    public void add(T element) {
        if (count == elements.length) {
            resize(); // увеличить размер массива, если он заполнен
        }
        elements[count++] = element;
    }

    // Удалить элемент по индексу
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--count] = null; // очистить последний элемент
    }

    // Получить элемент по индексу
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return elements[index];
    }

    // Увеличить размер массива в 1.5 раза
    private void resize() {
        int newSize = (int) (elements.length * 1.5);
        elements = Arrays.copyOf(elements, newSize);
    }

    // Получить количество элементов в списке
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, count));
    }
}
