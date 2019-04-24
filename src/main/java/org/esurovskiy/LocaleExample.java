package org.esurovskiy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        final Date date = getCurrentDate();

        System.out.println(date);
        date.setMinutes(0);
        System.out.println(date);
        final SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("yy MMMM HH:mm",
                new Locale("RU"));
        System.out.println(simpleDateFormat.format(date));
    }

    private static Date getCurrentDate() {
        return new Date();
    }
}
