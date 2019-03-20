package com.rybarstudios.pets;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddPets extends AppCompatActivity {

    Context context;
    EditText mEditText;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pets);
        context = this;

        mEditText = findViewById(R.id.edit_pet_name_entry);
        mButton = findViewById(R.id.button_add_pet);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String animalName = mEditText.getText().toString();
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT, animalName);
            }
        });

    }
}
