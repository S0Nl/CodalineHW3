package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ActivityC extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }

    public void goToActivityA(View view) {
        Toast.makeText(this, "Вы перешли на  активность A", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ActivityA.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void goToActivityB(View view) {
        Toast.makeText(this, "Вы перешли на активность B", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ActivityB.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

    public void goToMainActivity(View view) {
        Toast.makeText(this, "Вы перешли на главную активность", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intent);
    }

}