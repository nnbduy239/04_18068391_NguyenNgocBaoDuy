package com.iuh.a04_nguyenngocbaoduy_18068391;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TableDetail extends AppCompatActivity {
    TextView tenban,tongTien,gia1,gia2,gia3,gia4;
    String oTenBan,tong;
    Button tinh;
    double a,b,c,d;
    private MyServices myServices;
    private boolean isconnected;
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyServices.MyBinder binder = (MyServices.MyBinder) iBinder;
            myServices = binder.getService();
            isconnected = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            isconnected = false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_detail);
        tenban = findViewById(R.id.txtTenBan);
        oTenBan = (String)getIntent().getSerializableExtra("object");
        tongTien = findViewById(R.id.tvTongTien);
        tenban.setText(oTenBan);
        gia1 = findViewById(R.id.gia1);
        gia2 = findViewById(R.id.gia2);
        gia3 = findViewById(R.id.gia3);
        gia4 = findViewById(R.id.gia4);
        tinh = findViewById(R.id.btnTinhTien);
        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = Double.parseDouble(gia1.getText().toString());
                b = Double.parseDouble(gia2.getText().toString());
                c = Double.parseDouble(gia3.getText().toString());
                d = Double.parseDouble(gia4.getText().toString());
                tong = myServices.TinhTien(a,b,c,d)+"";
                tongTien.setText(tong);
            }
        });
    }
}