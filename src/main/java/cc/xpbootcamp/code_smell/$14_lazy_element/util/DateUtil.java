package cc.xpbootcamp.code_smell.$14_lazy_element.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Date getDateAfter(Date date, int dayAfter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, dayAfter);
        return calendar.getTime();
    }
}
