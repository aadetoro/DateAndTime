package FlexiSapInterns.DateAndTime;

import java.util.Scanner;
import java.time.YearMonth;

public class MonthLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(year, month);
            System.out.println(yearMonth.getMonth() + ": " + yearMonth.lengthOfMonth() + " days");
        }
        scanner.close();
    }
}

