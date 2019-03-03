package homework4;

public class MyNode<T> {
    public MyNode<T> prev;
    private MyNode<T> next;
    private T t;

    public MyNode(MyNode<T> prev, MyNode<T> next, T t) {
        this.prev = prev;
        this.next = next;
        this.t = t;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public MyNode<T> setPrev(MyNode<T> prev) {
        this.prev = prev;
        return this;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public MyNode<T> setNext(MyNode<T> next) {
        this.next = next;
        return this;
    }

    public T getT() {
        return t;
    }

    public MyNode<T> setT(T t) {
        this.t = t;
        return this;
    }
}
