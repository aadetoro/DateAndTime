package FlexiSapInterns.DateAndTime;

import java.time.*;
import java.util.Scanner;

public class FridayThe13th {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, day);

        if (date.getDayOfWeek() == DayOfWeek.FRIDAY && day == 13) {
            System.out.println("Yes, it's Friday the 13th!");
        } else {
            System.out.println("No, it's not.");
        }

        scanner.close();
    }
}

