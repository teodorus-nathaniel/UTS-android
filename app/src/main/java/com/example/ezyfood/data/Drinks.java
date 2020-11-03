package com.example.ezyfood.data;

import android.content.Context;

import com.example.ezyfood.R;
import com.example.ezyfood.models.Drink;
import com.example.ezyfood.models.Item;

import java.util.ArrayList;

public class Drinks {
    public static ArrayList<Item> getDrinks() {
        ArrayList<Item> drinks = new ArrayList<>();
        drinks.add(new Drink(R.drawable.ic_water, "Mineral Water", 6000));
        drinks.add(new Drink(R.drawable.ic_orange_juice, "Orange Juice", 15000));
        drinks.add(new Drink(R.drawable.ic_thai_tea, "Thai Tea", 25000));

        return drinks;
    }
}
