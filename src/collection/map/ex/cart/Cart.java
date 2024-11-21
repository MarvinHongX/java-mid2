package collection.map.ex.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
    }

    public void minus(Product product, int quantity) {
        int qty = cartMap.getOrDefault(product, 0) - quantity;
        if (qty > 0) {
            cartMap.put(product, qty);
        } else {
            cartMap.remove(product);
        }
    }

    public void printAll() {
        System.out.printf("\n==모든 상품 출력==\n");
        for (Product item : cartMap.keySet()) {
            System.out.println(item + " 수량: " + cartMap.get(item));
        }
    }
}
