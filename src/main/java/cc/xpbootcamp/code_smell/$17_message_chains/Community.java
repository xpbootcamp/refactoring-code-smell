package cc.xpbootcamp.code_smell.$17_message_chains;

import lombok.Data;

import java.util.List;

@Data
public class Community {
    private String name;
    private List<Building> buildings;
}
