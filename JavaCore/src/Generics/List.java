package Generics;

public interface List<E> {
    // Phương thức để thêm một phần tử vào danh sách.
    void add(E element);

    // Phương thức để lấy phần tử ở một vị trí cụ thể trong danh sách.
    E get(int index);

    // Phương thức để trả về số lượng phần tử trong danh sách.
    int size();
}

class ArrayList<E> implements List<E> {
    private Object[] array;
    private int size;

    public ArrayList() {
        array = new Object[10];
        size = 0;
    }

    @Override
    public void add(E element) {
        // Kiểm tra nếu size nhỏ hơn kích thước mảng, thêm phần tử vào mảng và tăng size lên 1.
        if (size < array.length) {
            array[size++] = element;
        }
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            // Ép kiểu từ Object sang kiểu generic E và trả về phần tử tại index.
            return (E) array[index];
        }
        // Nếu index không hợp lệ, ném ngoại lệ IndexOutOfBoundsException.
        throw new IndexOutOfBoundsException("Index is out of bounds.");
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        // Tạo một đối tượng myList kiểu List<String> sử dụng ArrayList.
        List<String> myList = new ArrayList<>();
        myList.add("Learn Java");
        myList.add("Learn C#");
        myList.add("Learn Javascript");

        System.out.println("Size: " + myList.size());
        System.out.println("Item at index 1: " + myList.get(0));
        System.out.println("Item at index 2: " + myList.get(1));
        System.out.println("Item at index 3: " + myList.get(2));
    }
}
