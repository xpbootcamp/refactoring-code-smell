package cn.xpbootcamp.code_smell.$14_lazy_element.model;

import lombok.Data;

import java.util.List;

@Data
public class Hotel {
    private String name;
    private List<Room> rooms;
}
