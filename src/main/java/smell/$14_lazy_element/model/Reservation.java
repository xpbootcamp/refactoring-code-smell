package smell.$14_lazy_element.model;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Serialization
public class Reservation {
    private String id;
    private String customerName;
    private String email;
    private Date from;
    private int bookingDays;
    private Room room;
}
