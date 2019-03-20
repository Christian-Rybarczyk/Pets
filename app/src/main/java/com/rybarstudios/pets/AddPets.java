package com.rybarstudios.pets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddPets extends AppCompatActivity {

    EditText mEditText;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pets);

        mEditText = findViewById(R.id.edit_pet_name_entry);
        mButton = findViewById(R.id.button_add_pet);

    }
}
