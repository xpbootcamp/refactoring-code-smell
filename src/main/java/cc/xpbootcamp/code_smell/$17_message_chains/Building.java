package cc.xpbootcamp.code_smell.$17_message_chains;

import lombok.Data;

import java.util.List;

@Data
public class Building {
    private String buildingNo;
    private Person buildingManager;
    private List<Room> rooms;
}
