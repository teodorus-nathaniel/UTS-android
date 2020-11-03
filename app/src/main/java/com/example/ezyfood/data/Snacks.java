package com.example.ezyfood.data;

import android.content.Context;

import com.example.ezyfood.R;
import com.example.ezyfood.models.Item;
import com.example.ezyfood.models.Snack;

import java.util.ArrayList;

public class Snacks {
    public static ArrayList<Item> getSnacks() {
        ArrayList<Item> snacks = new ArrayList<>();
        snacks.add(new Snack(R.drawable.ic_fried_rice, "Mineral Water", 6000));
        snacks.add(new Snack(R.drawable.ic_fried_rice, "Orange Juice", 15000));
        snacks.add(new Snack(R.drawable.ic_fried_rice, "Thai Tea", 25000));

        return snacks;
    }
}
