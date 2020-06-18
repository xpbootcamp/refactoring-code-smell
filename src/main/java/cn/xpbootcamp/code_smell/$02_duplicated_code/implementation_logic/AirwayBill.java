package cn.xpbootcamp.code_smell.$02_duplicated_code.implementation_logic;

public class AirwayBill { // 快递单
    private CustomerName toCustomerName;
    private Address toAddress;
    private String toTel;
    private CustomerName fromCustomerName;
    private Address fromAddress;
    private String fromTel;

    public String to() {
        return "Customer: " +
                toCustomerName.getTitle() + toCustomerName.getFirstName() + " " + toCustomerName.getLastName() +
                System.lineSeparator() +
                "Address: " +
                toAddress.getHouseNumber() + " " +
                toAddress.getStreetAddress() + ", " +
                toAddress.getCity() + ", " +
                toAddress.getProvince() + ", " +
                toAddress.getZipCode() +
                System.lineSeparator() +
                "Tel: " + toTel;
    }

    public String from() {
        return "Customer: " +
                fromCustomerName.getTitle() + fromCustomerName.getFirstName() + " " + fromCustomerName.getLastName() +
                System.lineSeparator() +
                "Address: " +
                fromAddress.getHouseNumber() + " " +
                fromAddress.getStreetAddress() + ", " +
                fromAddress.getCity() + ", " +
                fromAddress.getProvince() + ", " +
                fromAddress.getZipCode() +
                System.lineSeparator() +
                "Tel: " + fromTel;
    }

    public CustomerName getToCustomerName() {
        return toCustomerName;
    }

    public void setToCustomerName(CustomerName toCustomerName) {
        this.toCustomerName = toCustomerName;
    }

    public Address getToAddress() {
        return toAddress;
    }

    public void setToAddress(Address toAddress) {
        this.toAddress = toAddress;
    }

    public String getToTel() {
        return toTel;
    }

    public void setToTel(String toTel) {
        this.toTel = toTel;
    }

    public CustomerName getFromCustomerName() {
        return fromCustomerName;
    }

    public void setFromCustomerName(CustomerName fromCustomerName) {
        this.fromCustomerName = fromCustomerName;
    }

    public Address getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(Address fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromTel() {
        return fromTel;
    }

    public void setFromTel(String fromTel) {
        this.fromTel = fromTel;
    }
}
