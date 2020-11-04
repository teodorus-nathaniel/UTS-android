package com.example.ezyfood.data;

import android.content.Context;

import com.example.ezyfood.R;
import com.example.ezyfood.models.Item;
import com.example.ezyfood.models.Snack;

import java.util.ArrayList;

public class Snacks {
    public static ArrayList<Item> getSnacks() {
        ArrayList<Item> snacks = new ArrayList<>();
        snacks.add(new Snack(R.drawable.ic_nachos, "Nachos", 20000));
        snacks.add(new Snack(R.drawable.ic_fried_wedges, "Fried Potato Wedges", 25000));
        snacks.add(new Snack(R.drawable.ic_salad, "Salad", 12500));

        return snacks;
    }
}
