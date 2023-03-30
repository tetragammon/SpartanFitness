package com.example.spartanfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ramotion.circlemenu.CircleMenuView;

public class UserPageActivity extends AppCompatActivity {

    TextView titleName, titleUsername;
    Button btnRedirectToEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_page);
        titleName = findViewById(R.id.titleName);
        titleUsername = findViewById(R.id.titleUsername);
        showUserData();

        final CircleMenuView menu = (CircleMenuView) findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener() {
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuOpenAnimationStart");
            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuOpenAnimationEnd");
            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuCloseAnimationStart");
            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D", "onMenuCloseAnimationEnd");
            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonClickAnimationStart| index: " + index);
            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D", "onButtonClickAnimationEnd| index: " + index);

                switch (index){
                    case 0:
                        Intent profile = new Intent(UserPageActivity.this,EditProfileActivity.class);
                        startActivity(profile);
                        break;
                    case 1:
                        Intent calculator = new Intent(UserPageActivity.this,CalculatorActivity.class);
                        startActivity(calculator);
                        break;
                    case 2:
                        Intent meal = new Intent(UserPageActivity.this,MealActivity.class);
                        startActivity(meal);
                        break;
                    case 3:
                        Intent water = new Intent(UserPageActivity.this,WaterActivity.class);
                        startActivity(water);
                        break;
                    case 4:
                        Intent workout = new Intent(UserPageActivity.this,WorkoutActivity.class);
                        startActivity(workout);
                        break;
                    case 5:
                        Intent calories = new Intent(UserPageActivity.this,CaloriesActivtiy.class);
                        startActivity(calories);
                        break;
                }
            }
        });
    }
    public String showUserData(){
        Intent intent = getIntent();
        String nameUser = intent.getStringExtra("name");
        String usernameUser = intent.getStringExtra("username");
        String typeUser = intent.getStringExtra("userType");
        String emailUser = intent.getStringExtra("email");
        String passwordUser = intent.getStringExtra("password");
        titleName.setText(nameUser);
        titleUsername.setText(usernameUser + " - " + typeUser);
        return nameUser;
    }

}