package com.iuh.a04_nguyenngocbaoduy_18068391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CustomerScreen extends AppCompatActivity {
    ImageView cban1,cban2,cban3,cban4,cban5,cban6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_screen);
        cban1 = findViewById(R.id.ban1);
        cban2 = findViewById(R.id.ban2);
        cban3 = findViewById(R.id.ban3);
        cban4 = findViewById(R.id.ban4);
        cban5 = findViewById(R.id.ban5);
        cban6 = findViewById(R.id.ban6);
        cban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CustomerScreen.this,CustomerOrder.class);
                startActivity(intent);
            }
        });
    }
}