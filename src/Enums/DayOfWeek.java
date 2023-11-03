package Enums;

enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class EnumExample {
    public static void main(String[] args) {
        // Sử dụng enum để biểu diễn ngày trong tuần
        DayOfWeek today = DayOfWeek.FRIDAY;

        // In ra ngày trong tuần
        System.out.println("Today is " + today);

        // So sánh enum
        if (today == DayOfWeek.FRIDAY) {
            System.out.println("It's the end of the workweek!");
        }

        // Duyệt qua tất cả các giá trị của enum
        System.out.println("Days of the week:");
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}