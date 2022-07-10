public class FString {
    public static void main(String[] args) {
        System.out.printf("Hello %10.2f world %n", 45.345); // работает - в float можно настраивать сразу до точки и после
        System.out.printf("Check %2d \n", 1000000); // все равно работает, он просто добавляет хвост - доп числа
        System.out.printf("Check %-2d \n", 1000000); // \n - тоже работает как и %n
        // TODO: узнать зачем тогда ф-ция format, если можно soutf...
    }
}
