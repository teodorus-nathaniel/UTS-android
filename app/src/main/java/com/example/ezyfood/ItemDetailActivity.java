package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.ezyfood.models.Item;
import com.example.ezyfood.viewholders.ItemViewHolder;

public class ItemDetailActivity extends AppCompatActivity {

    Item item;
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        this.item = (Item) getIntent().getSerializableExtra(ItemViewHolder.ITEM);
        test = findViewById(R.id.tv_name);
        test.setText(this.item.getName());
    }


}
