package cn.xpbootcamp.code_smell.$09_feature_envy;

import java.util.List;

public class Order {
    String customerName;
    String address;
    List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.address = address;
        this.lineItems = lineItems;
    }

    // Code smell for [Feature Envy]
    private double totalPrice() {
        return lineItems.stream()
                .mapToDouble(lineItem -> lineItem.getPrice() * lineItem.getQuantity())
                .count();
    }
}
