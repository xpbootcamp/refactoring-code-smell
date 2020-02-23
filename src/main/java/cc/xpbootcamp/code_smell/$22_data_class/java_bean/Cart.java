package smell.$22_data_class.java_bean;

import java.util.List;

public class Cart {

    List<CartItem> cartItems;

    public void addCartItem(CartItem cartItem) {
        cartItems.add(cartItem);
    }

    public Double getTotalPrice() {
        Double result = 0.0;
        for(CartItem item : cartItems) {
            Double subTotal = (item.getPrice() * item.getAmount() * item.getDiscount());
            result += subTotal;
        }

        return result;
    }
}
