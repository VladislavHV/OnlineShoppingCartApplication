package onlineshoppingcart.ru.onlineshoppingcart.Service;

import onlineshoppingcart.ru.onlineshoppingcart.Metods.ShoppingСart;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Service
@SessionScope
public class ShoppingСartService {

    private final ShoppingСart carts;

    public ShoppingСartService() {
        this.carts = new ShoppingСart();
    }

    public void addItems(List<Integer> itemIds) {
        itemIds.forEach(carts::setCart);
    }

    public List<Integer> getCart() {
        return carts.getCart();
    }
}
