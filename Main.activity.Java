package com.example.fbloginpage;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button reg =findViewById(R.id.reg);
        reg.setOnClicklistener(new View.OnClicklistener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(packageContext:MainActivity.this,RegisterActivity.class);
                starActivity(intent);
            }
        });
    }
}
