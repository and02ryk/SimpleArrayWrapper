public interface SimpleList<T> {
    int length();
    T get(int index);
    void add(T value);
    void remove(int index);
    void print();
}