package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ezyfood.adapters.CartAdapter;
import com.example.ezyfood.data.Cart;
import com.example.ezyfood.models.CartItem;
import com.example.ezyfood.utils.PriceFormatter;

public class CartActivity extends AppCompatActivity {

    RecyclerView rvCart;
    TextView tvNoItem, tvTotal;
    Button btnPayNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        initComponents();
        checkItemCount();
        updateTotal();

        Cart.observe(new Runnable() {
            @Override
            public void run() {
                checkItemCount();
                updateTotal();
            }
        });
    }

    private void updateTotal() {
        tvTotal.setText(PriceFormatter.format(Cart.getTotal()));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Cart.unObserve();
    }

    private void checkItemCount() {
        if(Cart.getCartItems().size() == 0) {
            tvNoItem.setVisibility(View.VISIBLE);
        } else {
            tvNoItem.setVisibility(View.GONE);
        }
    }

    private void initComponents() {
        rvCart = findViewById(R.id.rv_cart);

        rvCart.setLayoutManager(new LinearLayoutManager(this));
        rvCart.setHasFixedSize(true);
        rvCart.setAdapter(new CartAdapter(Cart.getCartItems()));

        tvTotal = findViewById(R.id.tv_total);
        tvNoItem = findViewById(R.id.tv_no_item);
        btnPayNow = findViewById(R.id.btn_pay_now);

        btnPayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Cart.getCartItems().size() == 0) {
                    Toast.makeText(CartActivity.this, "No item in your cart!", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(CartActivity.this, CheckOutActivity.class));
                }
            }
        });
    }
}
