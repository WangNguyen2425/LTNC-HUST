package Buoi2.Learn;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LearnCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
