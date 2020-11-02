package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ezyfood.enums.ItemType;

public class ItemListActivity extends AppCompatActivity {

    ItemType type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        type = ItemType.values()[this.getIntent().getIntExtra(MainActivity.ITEM_TYPE, 0)];
    }
}
