package onlineshoppingcart.ru.onlineshoppingcart.Controller;

import onlineshoppingcart.ru.onlineshoppingcart.Service.ShoppingСartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class CartController {

    private final ShoppingСartService shoppingСartService;

    @Autowired
    public CartController(ShoppingСartService shoppingСartService){
        this.shoppingСartService = shoppingСartService;
    }

    @GetMapping(path= "/add")
    public void addItem(@RequestParam List<Integer> itemIds){
        shoppingСartService.addItems(itemIds);
    }

    @GetMapping(path = "/get")
    public List<Integer> getCart(){
        return shoppingСartService.getCart();
    }
}
