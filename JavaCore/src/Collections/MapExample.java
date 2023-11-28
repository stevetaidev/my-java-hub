package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Tạo một HashMap với kiểu dữ liệu String làm key và Integer làm value
        Map<String, Integer> hashMap = createHashMap();
        System.out.println("HashMap:");
        System.out.println(hashMap);

        // Tạo một LinkedHashMap với kiểu dữ liệu Integer làm key và String làm value
        Map<Integer, String> linkedHashMap = createLinkedHashMap();
        System.out.println("\nLinkedHashMap:");
        System.out.println(linkedHashMap);

        // Tạo một TreeMap với kiểu dữ liệu Double làm key và Boolean làm value
        Map<Double, Boolean> treeMap = createTreeMap();
        System.out.println("\nTreeMap:");
        System.out.println(treeMap);

        // Sửa đổi một phần tử trong HashMap
        modifyHashMap(hashMap, "apple", 15);
        System.out.println("\nHashMap sau khi sửa đổi:");
        System.out.println(hashMap);

        // Lấy giá trị từ LinkedHashMap theo key
        String value = getValueFromLinkedHashMap(linkedHashMap, 2);
        System.out.println("\nGiá trị của key 2 trong LinkedHashMap: " + value);

        // Xóa phần tử khỏi TreeMap
        treeMap = removeFromTreeMap(treeMap, 3.14);
        System.out.println("\nTreeMap sau khi xóa key 3.14:");
        System.out.println(treeMap);
    }

    // Phương thức tạo HashMap và thêm phần tử
    private static Map<String, Integer> createHashMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("cherry", 30);
        return map;
    }

    // Phương thức tạo LinkedHashMap và thêm phần tử
    private static Map<Integer, String> createLinkedHashMap() {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        return map;
    }

    // Phương thức tạo TreeMap và thêm phần tử
    private static Map<Double, Boolean> createTreeMap() {
        Map<Double, Boolean> map = new TreeMap<>();
        map.put(3.14, true);
        map.put(2.71, false);
        return map;
    }

    // Phương thức sửa đổi một phần tử trong HashMap
    private static void modifyHashMap(Map<String, Integer> map, String key, int newValue) {
        if (map.containsKey(key)) {
            map.put(key, newValue);
        }
    }

    // Phương thức lấy giá trị từ LinkedHashMap theo key
    private static String getValueFromLinkedHashMap(Map<Integer, String> map, int key) {
        return map.get(key);
    }

    // Phương thức xóa phần tử khỏi TreeMap
    private static Map<Double, Boolean> removeFromTreeMap(Map<Double, Boolean> map, double key) {
        map.remove(key);
        return map;
    }
}
