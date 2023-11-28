package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Tạo một HashSet với kiểu dữ liệu String
        Set<String> hashSet = createHashSet();
        System.out.println("HashSet:");
        System.out.println(hashSet);

        // Tạo một LinkedHashSet với kiểu dữ liệu String
        Set<String> linkedHashSet = createLinkedHashSet();
        System.out.println("\nLinkedHashSet:");
        System.out.println(linkedHashSet);

        // Tạo một TreeSet với kiểu dữ liệu String
        Set<String> treeSet = createTreeSet();
        System.out.println("\nTreeSet:");
        System.out.println(treeSet);

        // Set với kiểu dữ liệu nguyên thủy (Integer)
        Set<Integer> integerSet = createIntegerSet();
        System.out.println("\nSet với kiểu dữ liệu nguyên thủy (Integer):");
        System.out.println(integerSet);

        // Sửa đổi một phần tử trong HashSet
        hashSet = modifyHashSet(hashSet);
        System.out.println("\nHashSet sau khi sửa đổi:");
        System.out.println(hashSet);

        // Lấy phần tử từ LinkedHashSet
        String element = getElementFromLinkedHashSet(linkedHashSet, 2);
        System.out.println("\nPhần tử tại chỉ mục 2 trong LinkedHashSet: " + element);

        // Xóa phần tử khỏi TreeSet
        treeSet = removeFromTreeSet(treeSet, "cherry");
        System.out.println("\nTreeSet sau khi xóa 'cherry':");
        System.out.println(treeSet);
    }

    // Phương thức tạo HashSet và thêm phần tử
    private static Set<String> createHashSet() {
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); // Sẽ loại bỏ bản sao "apple" tự động
        return set;
    }

    // Phương thức tạo LinkedHashSet và thêm phần tử
    private static Set<String> createLinkedHashSet() {
        Set<String> set = new LinkedHashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); // Sẽ loại bỏ bản sao "apple" tự động
        return set;
    }

    // Phương thức tạo TreeSet và thêm phần tử
    private static Set<String> createTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("apple"); // Sẽ loại bỏ bản sao "apple" tự động
        return set;
    }

    // Phương thức tạo Set với kiểu dữ liệu nguyên thủy (Integer)
    private static Set<Integer> createIntegerSet() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        return set;
    }

    // Phương thức sửa đổi một phần tử trong HashSet
    private static Set<String> modifyHashSet(Set<String> set) {
        set.remove("apple");
        set.add("grape");
        return set;
    }

    // Phương thức lấy phần tử từ LinkedHashSet theo chỉ mục
    private static String getElementFromLinkedHashSet(Set<String> set, int index) {
        String[] array = set.toArray(new String[0]);
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        return null;
    }

    // Phương thức xóa phần tử khỏi TreeSet
    private static Set<String> removeFromTreeSet(Set<String> set, String element) {
        set.remove(element);
        return set;
    }
}


