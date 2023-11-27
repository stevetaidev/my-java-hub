package Generics;

public class Pair<T, U> {
    private T first; // T là kiểu dữ liệu của first
    private U second; // U là kiểu dữ liệu của second

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("This is String", 1234566789);
        System.out.println("First value:" + " "+ pair.getFirst());
        System.out.println("Second value:" + " "+  pair.getSecond());
    }
}
