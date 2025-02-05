package FlexiSapInterns.DateAndTime;

import java.time.*;
import java.util.Scanner;

public class MondaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = Year.now().getValue();  // Get current year
        System.out.print("Enter a month (1-12) for the year " + year + ": ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        LocalDate firstDay = yearMonth.atDay(1); // First day of the month
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("Mondays in " + firstDay.getMonth() + " " + year + ":");
        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = LocalDate.of(year, month, day);
            if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                System.out.println(date);
            }
        }
        scanner.close();
    }
}

