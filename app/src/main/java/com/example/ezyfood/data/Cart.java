package com.example.ezyfood.data;

import com.example.ezyfood.models.CartItem;
import com.example.ezyfood.models.Item;

import java.util.ArrayList;

public class Cart {
    private static ArrayList<CartItem> cartItems = new ArrayList<>();

    public static int findIndex(Item item) {
        int i = 0;
        for (CartItem cartItem : cartItems) {
            if(cartItem.getItem().getName().equals(item.getName())) return i;
            i++;
        }
        return -1;
    }

    public static CartItem find(Item item) {
        for (CartItem cartItem : cartItems) {
            if(cartItem.getItem().getName().equals(item.getName())) return cartItem;
        }
        return null;
    }

    public static void addItem(Item item, int qty) {
        int index = findIndex(item);
        if(index != -1) {
            cartItems.remove(index);
        }
        cartItems.add(new CartItem(item, qty));
    }
}
