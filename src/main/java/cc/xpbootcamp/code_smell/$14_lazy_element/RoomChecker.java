package cc.xpbootcamp.code_smell.$14_lazy_element;

import cc.xpbootcamp.code_smell.$14_lazy_element.model.Room;

import java.util.Date;

public class RoomChecker {
    public Boolean isRoomBooked(Room room, Date date) {
        return room.getBookingStatus().get(date);
    }
}
