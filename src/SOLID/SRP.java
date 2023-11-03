package SOLID;

//Nguyên tắc Danh định duy nhất (Single Responsibility Principle - SRP)
// Mỗi lớp nên thực hiện một chức năng hoặc một nhiệm vụ cụ thể.

public class SRP {
    void addCustomer(Customer customer) {
        // Thêm khách hàng vào cơ sở dữ liệu
    }

    void deleteCustomer(Customer customer) {
        // Xóa khách hàng khỏi cơ sở dữ liệu
    }
}

class Customer{

}