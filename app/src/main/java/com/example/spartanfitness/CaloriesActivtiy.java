package com.example.spartanfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.ramotion.circlemenu.CircleMenuView;

public class CaloriesActivtiy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories_activtiy);

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
                        Intent profile = new Intent(CaloriesActivtiy.this,EditProfileActivity.class);
                        startActivity(profile);
                        break;
                    case 1:
                        Intent calculator = new Intent(CaloriesActivtiy.this,CalculatorActivity.class);
                        startActivity(calculator);
                        break;
                    case 2:
                        Intent meal = new Intent(CaloriesActivtiy.this,MealActivity.class);
                        startActivity(meal);
                        break;
                    case 3:
                        Intent water = new Intent(CaloriesActivtiy.this,WaterActivity.class);
                        startActivity(water);
                        break;
                    case 4:
                        Intent workout = new Intent(CaloriesActivtiy.this,WorkoutActivity.class);
                        startActivity(workout);
                        break;
                    case 5:
                        break;
                }
            }
        });
    }
}