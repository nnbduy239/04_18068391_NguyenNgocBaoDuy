package com.iuh.a04_nguyenngocbaoduy_18068391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EmployeeScreen extends AppCompatActivity {
    ImageView ban1,ban2,ban3,ban4,ban5,ban6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_screen);
        ban1 = findViewById(R.id.cban1);
        ban2 = findViewById(R.id.cban2);
        ban3 = findViewById(R.id.cban3);
        ban4 = findViewById(R.id.cban4);
        ban5 = findViewById(R.id.cban5);
        ban6 = findViewById(R.id.cban6);

        ban1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeScreen.this,TableDetail.class);
                Bundle bundle = new Bundle();
                String tenBan = "Bàn 1";
                bundle.putSerializable("object",tenBan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ban2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeScreen.this,TableDetail.class);
                Bundle bundle = new Bundle();
                String tenBan = "Bàn 2";
                bundle.putSerializable("object",tenBan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ban3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeScreen.this,TableDetail.class);
                Bundle bundle = new Bundle();
                String tenBan = "Bàn 3";
                bundle.putSerializable("object",tenBan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ban4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeScreen.this,TableDetail.class);
                Bundle bundle = new Bundle();
                String tenBan = "Bàn 4";
                bundle.putSerializable("object",tenBan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ban5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeScreen.this,TableDetail.class);
                Bundle bundle = new Bundle();
                String tenBan = "Bàn 5";
                bundle.putSerializable("object",tenBan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ban6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EmployeeScreen.this,TableDetail.class);
                Bundle bundle = new Bundle();
                String tenBan = "Bàn 6";
                bundle.putSerializable("object",tenBan);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}