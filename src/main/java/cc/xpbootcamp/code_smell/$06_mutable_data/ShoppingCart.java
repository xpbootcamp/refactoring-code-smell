package cc.xpbootcamp.code_smell.$06_mutable_data;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    @Getter @Setter
    private int itemsCount;
    @Getter @Setter
    private double totalPrice;
    @Getter
    private Map<Item, Integer> items = new HashMap<>();

    public void addItem(Item item) {
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + 1);
        } else {
            items.put(item, 1);
        }
        totalPrice += item.getPrice();
    }
}