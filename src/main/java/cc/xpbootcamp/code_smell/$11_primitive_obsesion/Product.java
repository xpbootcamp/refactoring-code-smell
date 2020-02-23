package smell.$11_primitive_obsesion;
import lombok.Data;

@Data
public class Product {
    private String category;
    private String itemType;
    private String brand;
    private String name;
    private double purchasePrice;
    private String purchaseCurrency;
    private double sellPrice;
    private String sellCurrency;
}
