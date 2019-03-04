package homework4;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayList(int cap) {
        arr = (T[]) new Object[cap];
        size = 0;
    }

    @Override
    public void add(T t) {
        if (size == arr.length) {
            reSize();
        }
        arr[size++] = t;
    }

    @Override
    public void remove(int index) {
        try {
            T[] newArr = (T[]) new Object[size - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, size--);
            arr = newArr;
        } catch (Exception e) {
            System.out.println("Try again");;
        }
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        try {
            return arr[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not right index");
            return null;
        }
    }

    private void reSize() {
        T[] newArray = Arrays.copyOf(arr, arr.length * 3 / 2 + 1);
        arr = newArray;
    }
}
