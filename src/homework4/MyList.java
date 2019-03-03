package homework4;

public interface MyList<T> {

    boolean add(T t);

    T remove(int i);

    void clear();

    int size();

    T get(int i);
}
