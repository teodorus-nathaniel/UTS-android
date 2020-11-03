package com.example.ezyfood.data;

import android.content.Context;

import com.example.ezyfood.R;
import com.example.ezyfood.models.Food;
import com.example.ezyfood.models.Item;

import java.util.ArrayList;

public class Foods {
    public static ArrayList<Item> getFoods() {
        ArrayList<Item> foods = new ArrayList<>();
        foods.add(new Food(R.drawable.ic_fried_rice, "Fried Rice", 30000));
        foods.add(new Food(R.drawable.ic_fried_chicken, "Fried Chicken", 25000));
        foods.add(new Food(R.drawable.ic_chicken_soup, "Chicken Soup", 20000));

        return foods;
    }
}
