package com.freezejk.chat.util;

import java.util.Calendar;

/**
 * Created by sjk on 16-11-28.
 */
public class DateTimeUtil {

    public static final String UNFORMATTED_DATE_TIME = "%s-%s-%sT%s:%s:%s";  // 2014-07-29T20:30:00

    public static String calendarToDateTime(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        return String.format(UNFORMATTED_DATE_TIME,
                year,
                month + 1,  // uh...this needs to add 1 when shown.
                day,
                hour,
                minute,
                second);
    }

    public static String getCurrentDateTime() {
        return calendarToDateTime(Calendar.getInstance());
    }
}
