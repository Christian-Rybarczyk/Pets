package com.rybarstudios.pets;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context;
    String[] animalName = {"Husky", "German Shepard", "Tiger", "Penguin", "Bear", "Wolf", "Panda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        for(String ele : animalName) {
            ((LinearLayout)findViewById(R.id.view_animal_list)).addView(generateTextView(ele));
        }
    }

    private TextView generateTextView(String animal) {
        TextView view = new TextView(context);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        view.setText(animal);
        view.setGravity(Gravity.CENTER);
        view.setTextColor(getResources().getColor(R.color.emerald));
        return view;
    }
}
