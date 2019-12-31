package com.raziv.taskmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    private ImageView imageview;
    private EditText etusername, etpassword;
    private Button btnsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        imageview = findViewById(R.id.imageview);
        etusername = findViewById(R.id.etusername);
        etpassword = findViewById(R.id.etpassword);
        btnsave = findViewById(R.id.btnsave);

    }
}
