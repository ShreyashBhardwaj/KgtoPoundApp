package com.example.unitconverterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView pounds;
    EditText weightInKgs;
    Button toPounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pounds = findViewById(R.id.toPounds);
        weightInKgs = findViewById(R.id.editText);
        toPounds = findViewById(R.id.button);


        toPounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateWeight()

            }
        });
    }

    public double calculateWeight(double kg){
        return kg*2.205;
    }
}