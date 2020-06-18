package cn.xpbootcamp.code_smell.$02_duplicated_code.implementation_logic;

import lombok.Data;

@Data
public class Address {
    private String streetAddress;
    private int houseNumber;
    private String city;
    private String province;
    private String zipCode;
}
