public class SimpleArrayWrapper<T> implements SimpleList<T> {
    private T[] array;

    public SimpleArrayWrapper(T[] array) {
        this.array = array.clone();
    }

    public int length() {
        return array.length;
    }

    public T get(int index) {
        return array[index];
    }

    public void add(T value) {
        T[] newArray = (T[]) new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;
        array = newArray;
    }

    public void remove(int index) {
        T[] newArray = (T[]) new Object[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++, j++) {
            if (i == index) {
                j--;
            } else {
                newArray[j] = array[i];
            }
        }
        array = newArray;
    }

    public void print() {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i++]);
        }
    }
}
