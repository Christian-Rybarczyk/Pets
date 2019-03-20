package com.rybarstudios.pets;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;

        Intent intent = getIntent();
        String animalName = intent.getStringExtra(Intent.EXTRA_TEXT);

        ((LinearLayout)findViewById(R.id.view_animal_list)).addView(generateTextView(animalName));
    }

    private TextView generateTextView(String animal) {
        TextView view = new TextView(context);
        view.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
        view.setText(animal);
        return view;
    }
}
