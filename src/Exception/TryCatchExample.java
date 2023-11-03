package Exception;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Mã lệnh có thể gây ra ngoại lệ
            int result = divide(10, 0);
            System.out.println("Result: " + result); // Dòng này sẽ không được thực hiện
        } catch (ArithmeticException e) {
            // Xử lý ngoại lệ ArithmeticException
            System.out.println("Error: Division by zero");
        }
    }

    // Phương thức thực hiện phép chia
    public static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }
}

