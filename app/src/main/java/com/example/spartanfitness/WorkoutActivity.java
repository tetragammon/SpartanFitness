package com.example.spartanfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.ramotion.circlemenu.CircleMenuView;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

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
                        Intent profile = new Intent(WorkoutActivity.this,EditProfileActivity.class);
                        startActivity(profile);
                        break;
                    case 1:
                        Intent calculator = new Intent(WorkoutActivity.this,CalculatorActivity.class);
                        startActivity(calculator);
                        break;
                    case 2:
                        Intent meal = new Intent(WorkoutActivity.this,MealActivity.class);
                        startActivity(meal);
                        break;
                    case 3:
                        Intent water = new Intent(WorkoutActivity.this,WaterActivity.class);
                        startActivity(water);
                        break;
                    case 4:
                        break;
                    case 5:
                        Intent calories = new Intent(WorkoutActivity.this,CaloriesActivtiy.class);
                        startActivity(calories);
                        break;
                }
            }
        });
    }
}