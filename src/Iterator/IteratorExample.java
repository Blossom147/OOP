package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        // Khởi tạo một ArrayList và thêm phần tử vào nó
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Lấy một Iterator từ ArrayList
        Iterator<String> iterator = names.iterator();

        // Sử dụng Iterator để duyệt qua danh sách và in ra các phần tử
        System.out.println("Names in the ArrayList:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // Xóa một phần tử bằng Iterator
        iterator = names.iterator(); // Cần lấy một Iterator mới sau khi đã sử dụng xong
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Charlie")) {
                iterator.remove(); // Xóa phần tử Charlie
            }
        }

        System.out.println("ArrayList after removing Charlie: " + names);
    }
}
