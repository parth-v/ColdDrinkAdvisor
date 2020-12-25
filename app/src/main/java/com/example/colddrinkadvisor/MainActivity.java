package com.example.colddrinkadvisor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDisplayColdDrink(View view){
        Spinner color = (Spinner) findViewById(R.id.drink);
        String coldDrink = String.valueOf(color.getSelectedItem());
        Toast.makeText(this, coldDrink, Toast.LENGTH_LONG).show();
    }
}