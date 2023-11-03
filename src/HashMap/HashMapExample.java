package HashMap;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
    public static void main(String[] args) {
        // Khởi tạo một HashMap với key là String và value là Integer
        HashMap<String, Integer> scores = new HashMap<>();

        // Thêm cặp key-value vào HashMap
        scores.put("Alice", 95);
        scores.put("Bob", 87);
        scores.put("Charlie", 78);
        scores.put("David", 90);

        // Truy xuất giá trị dựa trên key
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Kiểm tra xem một key có tồn tại trong HashMap
        if (scores.containsKey("Bob")) {
            System.out.println("Bob's score is in the HashMap.");
        }

        // Duyệt qua tất cả các cặp key-value trong HashMap
        System.out.println("Scores in the HashMap:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Xóa một key và giá trị tương ứng
        scores.remove("Charlie");
        System.out.println("HashMap after removing Charlie's score: " + scores);
    }
}
