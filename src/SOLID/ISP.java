package SOLID;

//Nguyên tắc Segregation (Interface Segregation Principle - ISP)
// Định nghĩa nhiều giao diện nhỏ, cụ thể cho các mục đích cụ thể thay vì một giao diện lớn chứa tất cả các phương thức.
public class ISP {

    interface Worker {
        void work();
    }

    interface Eater {
        void eat();
    }

    class Engineer implements Worker {
        @Override
        public void work() {
            // Thực hiện công việc của một kỹ sư
        }
    }

    class Cook implements Worker, Eater {
        @Override
        public void work() {
            // Thực hiện công việc của đầu bếp
        }

        @Override
        public void eat() {
            // Thực hiện hành động ăn
        }
    }
}
