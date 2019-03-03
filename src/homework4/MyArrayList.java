package homework4;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int capasity;
    private int size;

    public MyArrayList() {
        int capasiry = 10;
        arr = (T[]) new Object[capasiry];
        size = 0;
    }

    public MyArrayList(int cap) {
        this.capasity = cap;
        arr = (T[]) new Object[cap];
        size = 0;
    }

    @Override
    public void add(T t) {
        if (size == capasity) {
            reSize();
        }
        arr[size++] = t;
    }

    @Override
    public void remove(int index) {
        if (index > capasity || index < 0) {
            System.out.println("Try again");
        } else {
            T[] newArr = (T[]) new Object[size - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, size--);
            T t = arr[index];
            arr = newArr;
        }
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[10];
        size = 0;
        capasity = 10;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return arr[index];
    }

    private void reSize() {
        T[] newArray = Arrays.copyOf(arr, arr.length * 3 / 2 + 1);
        arr = newArray;
        capasity = newArray.length;
    }
}
