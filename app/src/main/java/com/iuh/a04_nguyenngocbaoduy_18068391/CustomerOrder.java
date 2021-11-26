package com.iuh.a04_nguyenngocbaoduy_18068391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerOrder extends AppCompatActivity {
    Button xemBill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_order);
        xemBill = findViewById(R.id.btnXem);
        xemBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerOrder.this,TableDetail.class);
            }
        });
    }
}