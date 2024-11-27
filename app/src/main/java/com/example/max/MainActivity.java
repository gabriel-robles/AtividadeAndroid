package com.example.max;

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

import com.example.max.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

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

        EditText n1 = findViewById(R.id.editTextNumberSigned1);
        EditText n2 = findViewById(R.id.editTextNumberSigned2);

        Button max = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v1 = Integer.parseInt(n1.getText().toString());
                int v2 = Integer.parseInt(n2.getText().toString());

                if (v1 > v2) {
                    textView.setText(String.valueOf(v1));
                } else {
                    textView.setText(String.valueOf(v2));
                }
            }
        });
    }
}