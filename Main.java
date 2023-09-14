import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
        } else {
            System.out.println("13.09." + year);
        }
    }

    // Метод определяет: является ли переданный год високосным?
    public static boolean isLeapYear(int year) {

        boolean option_1 = (year % 4 == 0 && year %100 != 0);
        boolean option_2 = (year % 4 == 0 && year % 400 == 0);

        if (option_1 || option_2 ) {
            return true;
        }
        return false;
    }
}