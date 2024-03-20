package com.helloshop.order;
import com.helloshop.user.User;
import com.helloshop.product.Product;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
