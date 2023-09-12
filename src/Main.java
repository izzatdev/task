package src;

import java.time.*;

public class Main {
    public static void main(String[] args) {

    }
    public static void printBonusDatesBetween (int fromYear, int toYear)
    {
        if (fromYear >= toYear)
            return;

        for (int year = fromYear; year < toYear; year++)
        {
            int month = year % 100;
            int day = year / 100;
            month = (month % 10) * 10 + month / 10;
            day = (day % 10) * 10 + day / 10;
            try{
                LocalDate date = LocalDate.of (year, month, day);
                System.out.println (date);
            }catch(DateTimeException dte){
                continue;
            }
        }
    }
}
