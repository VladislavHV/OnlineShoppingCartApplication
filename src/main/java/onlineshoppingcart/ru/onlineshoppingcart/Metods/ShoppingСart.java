package onlineshoppingcart.ru.onlineshoppingcart.Metods;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingСart {

    private List<Integer> cart;

    public ShoppingСart() {
        this.cart = new ArrayList<>();
    }

    public List<Integer> getCart() {
        return cart;
    }

    public void setCart(Integer cartId) {
        cart.add(cartId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingСart that = (ShoppingСart) o;
        return Objects.equals(cart, that.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cart);
    }

    @Override
    public String toString() {
        return "ShoppingСart{" +
                "cart=" + cart +
                '}';
    }
}
