package com.cookandroid.community;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
public class HomeActivity extends AppCompatActivity {
    private Button buttonHome, buttonBoard, buttonQuiz, buttonMypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        // bottom navigation buttons
        buttonHome = findViewById(R.id.button_home);
        buttonBoard = findViewById(R.id.button_board);
        buttonQuiz = findViewById(R.id.button_quiz);
        buttonMypage = findViewById(R.id.button_mypage);

        // set onClickListeners for bottom navigation buttons
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        buttonBoard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CenterListActivity.class);
                startActivity(intent);
            }
        });
        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
        buttonMypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MypageActivity.class);
                startActivity(intent);
            }
        });
    }
}