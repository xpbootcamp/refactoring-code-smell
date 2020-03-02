package cn.xpbootcamp.code_smell.$14_lazy_element.model;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class Room {
    private RoomType roomType;
    private String roomNo;
    private int adultLimit;
    private int childLimit;
    private Map<Date, Boolean> bookingStatus;
}
