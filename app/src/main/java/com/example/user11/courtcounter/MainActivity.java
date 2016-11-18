package com.example.user11.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void DisplayScoreForTeamA(int score)
    {
        TextView tvScore = (TextView) findViewById(R.id.team_a_score);
        tvScore.setText(String.valueOf(score));
    }
    public void DisplayScoreForTeamB(int score)
    {
        TextView tvScore = (TextView) findViewById(R.id.team_b_score);
        tvScore.setText(String.valueOf(score));
    }
    public void  ResetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;

        DisplayScoreForTeamA(scoreTeamA);
        DisplayScoreForTeamB(scoreTeamB);
    }
    public  void AddThreePointsForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3;
        DisplayScoreForTeamA(scoreTeamA);
    }
    public  void AddTwoPointsForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 2;
        DisplayScoreForTeamA(scoreTeamA);

    }
    public void AddOnePointForTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 1;
        DisplayScoreForTeamA(scoreTeamA);
    }
    public void AddThreePointsForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 3;
        DisplayScoreForTeamB(scoreTeamB);
    }
    public void AddTwoPointsForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 2;
        DisplayScoreForTeamB(scoreTeamB);

    }
    public void AddOnePointForTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 1;
        DisplayScoreForTeamB(scoreTeamB);
    }
}
