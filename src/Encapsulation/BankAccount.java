package Encapsulation;

// Tính đóng gói là khả năng ẩn đi các chi tiết bên trong lớp và chỉ tiết lộ những phương thức và thuộc tính cần thiết. Dưới đây là ví dụ về tính đóng gói

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
