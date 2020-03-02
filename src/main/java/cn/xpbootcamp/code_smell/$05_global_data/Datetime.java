package cn.xpbootcamp.code_smell.$05_global_data;

import java.time.LocalDateTime;

public class Datetime {
    public String toString(LocalDateTime localDateTime) {
        return toLocalCulture(localDateTime, Application.config);
    }

    private String toLocalCulture(LocalDateTime localDateTime, String config) {
        // to make it simple, we just use the string to instead the handling from config and local date time.
        return "correctFormatByConfig";
    }
}
