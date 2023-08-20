package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckBox, sugerCheckBox, sopCheckBox;
    private Button showButton;
    private TextView resultView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = findViewById(R.id.milkId);
        sugerCheckBox = findViewById(R.id.sugerId);
        sopCheckBox = findViewById(R.id.sopId);

        showButton = findViewById(R.id.showButtonId);

        resultView = findViewById(R.id.resultViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();

                if (milkCheckBox.isChecked()){
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value + " is order"+"\n");
                }
                if (sugerCheckBox.isChecked()){
                    String value = sugerCheckBox.getText().toString();
                    stringBuilder.append(value + " is order"+"\n");
                }
                if (sopCheckBox.isChecked()){
                    String value = sopCheckBox.getText().toString();
                    stringBuilder.append(value + " is order"+"\n");
                }
                resultView.setText(stringBuilder);
            }
        });

    }
}