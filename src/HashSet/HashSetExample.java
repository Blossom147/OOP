package HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Khởi tạo một HashSet với kiểu dữ liệu là Integer
        HashSet<Integer> numbers = new HashSet<>();

        // Thêm phần tử vào HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Thử thêm một phần tử đã tồn tại
        numbers.add(10); // Không có hiệu lực, vì 10 đã tồn tại

        // In ra kích thước của HashSet
        System.out.println("Size of HashSet: " + numbers.size());

        // Duyệt qua các phần tử của HashSet
        System.out.println("Elements in HashSet:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Kiểm tra xem một phần tử có tồn tại trong HashSet
        if (numbers.contains(30)) {
            System.out.println("30 is in the HashSet.");
        }

        // Xóa một phần tử khỏi HashSet
        numbers.remove(40);
        System.out.println("HashSet after removing 40: " + numbers);

        // Xóa toàn bộ các phần tử
        numbers.clear();
        System.out.println("HashSet after clearing: " + numbers);
    }
}
