package com.example.pranav.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static int teamAScore = 0;
    static int teamBScore = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void plus3ScoreA(View view)
    {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }
    public void plus2ScoreA(View view)
    {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }
    public void freeScoreA(View view)
    {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }
    private void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3ScoreB(View view)
    {
        teamBScore += 3;
        displayForTeamB(teamBScore);
    }

    public void plus2ScoreB(View view)
    {
        teamBScore += 2;
        displayForTeamB(teamBScore);
    }
    public void freeScoreB(View view)
    {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }
    private void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetButton(View view)
    {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
