public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        SimpleList<Integer> list = new SimpleArrayWrapper<>(array);

        list.add(4);
        list.remove(1);
        list.print();
    }
}