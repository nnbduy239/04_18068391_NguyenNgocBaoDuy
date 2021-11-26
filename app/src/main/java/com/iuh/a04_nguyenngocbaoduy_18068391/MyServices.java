package com.iuh.a04_nguyenngocbaoduy_18068391;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MyServices extends Service {

    private MyBinder mBinder = new MyBinder();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    public class MyBinder extends Binder{
        MyServices getService(){
            return MyServices.this;
        }
    }
    public double TinhTien(double a, double b, double c, double d){
        return a+ b + c +d;
    }
}
