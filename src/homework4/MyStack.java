package homework4;

import java.util.Stack;

public class MyStack<T> {
    private T[] arr;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;


    public MyStack() {
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];

    }

    public void push(T t) {
        if (size == DEFAULT_CAPACITY) {
            reSize();
        }
        arr[size++] = t;
    }

    public void remove(int index) {
        try {
            T[] newArr = (T[]) new Object[size - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            System.arraycopy(arr, index + 1, newArr, index, size--);
            arr = newArr;
        } catch (Exception e) {
            System.out.println("Try again");
            ;
        }
    }

    public void clear() {
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        return arr[0];
    }

    public T pop() {
        T[] tt = (T[]) new Object[arr.length];
        System.arraycopy(arr, 1, tt, 0, arr.length - 1);
        T t = arr[0];
        arr = tt;
        return t;
    }

    private void reSize() {
        T[] array = (T[]) new Object[(int) (arr.length * 1.5)];
        System.arraycopy(arr, 0, array, 0, arr.length);
        this.arr = array;
    }
}
