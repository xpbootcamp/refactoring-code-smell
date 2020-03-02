package cn.xpbootcamp.code_smell.$17_message_chains;

import lombok.Data;

import java.util.List;

@Data
public class Room {
    private String roomNo;
    private float square;
    private List<Person> persons;
}
