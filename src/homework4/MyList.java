package homework4;

public interface MyList<T> {

    void add(T t);

    void remove(int i);

    void clear();

    int size();

    T get(int i);
}
