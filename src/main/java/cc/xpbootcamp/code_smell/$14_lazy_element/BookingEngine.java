package smell.$14_lazy_element;

import lombok.AllArgsConstructor;
import smell.$14_lazy_element.model.Hotel;
import smell.$14_lazy_element.model.Reservation;
import smell.$14_lazy_element.model.Room;
import smell.$14_lazy_element.util.DateUtil;

import java.util.*;
import java.util.stream.IntStream;

@AllArgsConstructor
public class BookingEngine {
    private List<Hotel> hotels;

    public boolean hasRoom(Date date, int days, int roomType) {
        return findRoomOptional(date, days, roomType).isPresent();
    }

    public Reservation bookRoom(String customerName, String email, Date from, int bookingDays, int roomType) {
        Optional<Room> roomOptional = findRoomOptional(from, bookingDays, roomType);
        if (roomOptional.isPresent()) {
            return new Reservation(UUID.randomUUID().toString(), customerName, email, from, bookingDays, roomOptional.get());
        }

        return null;
    }

    private Optional<Room> findRoomOptional(Date date, int days, int roomType) {
        return hotels.stream()
                .flatMap(hotel -> hotel.getRooms().stream())
                .filter(room -> room.getRoomType().getType() == roomType)
                .filter(room ->
                        IntStream.of(days).allMatch(day ->
                                new RoomChecker().isRoomBooked(room, DateUtil.getDateAfter(date, day - 1))))
                .findAny();
    }

}
