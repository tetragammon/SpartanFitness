package com.example.spartanfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AdminPageActivity extends AppCompatActivity {

    TextView titleName, titleUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);

        titleName = findViewById(R.id.titleName);
        titleUsername = findViewById(R.id.titleUsername);
        showUserData();
    }
    public void showUserData(){
        Intent intent = getIntent();
        String nameUser = intent.getStringExtra("name");
        String usernameUser = intent.getStringExtra("username");
        String typeUser = intent.getStringExtra("userType");
        titleName.setText(nameUser);
        titleUsername.setText(usernameUser + " - " + typeUser);
    }
}