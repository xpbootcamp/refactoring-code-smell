package cc.xpbootcamp.code_smell.$02_duplicated_code.distributed_same_fragments;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Receipt { // 收据
    private CustomerName customerName;
    private Address address;
    private List<Item> items;

    public Receipt(CustomerName customerName, Address address, List<Item> items) {
        this.customerName = customerName;
        this.address = address;
        this.items = items;
    }

    public String getReceiptString() {
        String customerInformation = "Customer: " +
                customerName.getTitle() + customerName.getFirstName() + " " + customerName.getLastName() +
                System.lineSeparator() +
                "Address: " +
                address.getHouseNumber() + " " +
                address.getStreetAddress() + ", " +
                address.getCity() + ", " +
                address.getProvince() + ", " +
                address.getZipCode();
        String itemsDetail = "Items: " + System.lineSeparator() +
                items.stream()
                        .map(item -> item.getName() + " x " + item.getCount() + ",\\t" + item.getPrice())
                        .collect(Collectors.joining(System.lineSeparator()));
        String itemTotal = "Total: " + getTotal();
        return customerInformation + System.lineSeparator() + itemsDetail + System.lineSeparator() + itemTotal;
    }

    private Optional<BigDecimal> getTotal() {
        return items.stream().map(item -> item.getPrice().multiply(new BigDecimal(item.getCount()))).reduce(BigDecimal::add);
    }
}

class Item {
    private String name;
    private BigDecimal price;
    private int count;

    public Item(String name, BigDecimal price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
