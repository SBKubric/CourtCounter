package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score_a = 0;
    private int score_b = 0;
    Button btnAScore3;
    Button btnAScore2;
    Button btnAFreeTh;
    Button btnBScore3;
    Button btnBScore2;
    Button btnBFreeTh;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAScore2 = (Button) findViewById(R.id.team_a_2points);
        btnAFreeTh = (Button) findViewById(R.id.team_a_1point);
        btnBScore3 = (Button) findViewById(R.id.team_b_3points);
        btnBScore2 = (Button) findViewById(R.id.team_b_2points);
        btnBFreeTh = (Button) findViewById(R.id.team_b_1point);
        btnAScore3 = (Button) findViewById(R.id.team_a_3points);
        btnReset = (Button) findViewById(R.id.reset_button);
        View.OnClickListener scoreListener = new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.team_a_3points:
                        score_a = score_a + 3;
                        displayScoreA(score_a);
                        break;
                    case R.id.team_a_2points:
                        score_a = score_a + 2;
                        displayScoreA(score_a);
                        break;
                    case R.id.team_a_1point:
                        ++score_a;
                        displayScoreA(score_a);
                        break;
                    case R.id.team_b_3points:
                        score_b = score_b + 3;
                        displayScoreB(score_b);
                        break;
                    case R.id.team_b_2points:
                        score_b = score_b + 2;
                        displayScoreB(score_b);
                        break;
                    case R.id.team_b_1point:
                        ++score_b;
                        displayScoreB(score_b);
                        break;
                    case R.id.reset_button:
                        displayScoreA(score_a = 0);
                        displayScoreB(score_b = 0);
                        break;

                }
            }
        };
        btnAScore3.setOnClickListener(scoreListener);
        btnAScore2.setOnClickListener(scoreListener);
        btnAFreeTh.setOnClickListener(scoreListener);
        btnBScore3.setOnClickListener(scoreListener);
        btnBScore2.setOnClickListener(scoreListener);
        btnBFreeTh.setOnClickListener(scoreListener);
        btnReset.setOnClickListener(scoreListener);
    }

    private void displayScoreB(int score_b) {
        TextView score_b_view = (TextView) findViewById(R.id.team_b_score);
        if (score_b_view != null) {
            score_b_view.setText(String.valueOf(score_b));
        }
    }

    private void displayScoreA(int score_a) {
        TextView score_a_view = (TextView) findViewById(R.id.team_a_score);
        if (score_a_view != null) {
            score_a_view.setText(String.valueOf(score_a));
        }
    }
}
