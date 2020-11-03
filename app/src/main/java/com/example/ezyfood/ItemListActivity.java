package com.example.ezyfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ezyfood.adapters.ItemAdapter;
import com.example.ezyfood.data.Drinks;
import com.example.ezyfood.data.Foods;
import com.example.ezyfood.data.Snacks;
import com.example.ezyfood.enums.ItemType;
import com.example.ezyfood.models.Item;

import java.util.ArrayList;

public class ItemListActivity extends AppCompatActivity {

    private ItemType type;
    private ArrayList<Item> displayedItems;

    private RecyclerView rcItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        this.getExtraData();
        this.initComponents();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponents() {
        rcItems = findViewById(R.id.rc_items);

        rcItems.setLayoutManager(new LinearLayoutManager(this));
        rcItems.setHasFixedSize(true);
        rcItems.setAdapter(new ItemAdapter(displayedItems));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.menu_cart:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void getExtraData() {
        type = (ItemType) this.getIntent().getSerializableExtra(MainActivity.ITEM_TYPE);
        switch(type) {
            case FOOD:
                displayedItems = Foods.getFoods();
                break;
            case DRINK:
                displayedItems = Drinks.getDrinks();
                break;
            case SNACK:
                displayedItems = Snacks.getSnacks();
                break;
        }
    }

}
