package com.example.hitainsmac.goalkeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //initializing variables
    public int scoreA=0;
    public int scoreB=0;
    public int foulA=0;
    public int foulB=0;

    //functions to increment scores
    public void scoreA(View view)
    {
        scoreA=scoreA+1;
        displayScoreForTeamA(scoreA);
    }
    public void scoreB(View view) {
        scoreB=scoreB+1;
        displayScoreForTeamB(scoreB); }

     //functions to display score of the team
    public void displayScoreForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    public void displayScoreForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    //function to reset the values of scores and fouls
    public void reset(View view)
    {
        scoreA=0;
        displayScoreForTeamA(0);
        scoreB=0;
        displayScoreForTeamB(0);
        foulA=0;
        diplayFoulForTeamA(0);
        foulB=0;
        diplayFoulForTeamB(0);
    }

    //functions to increment the fouls
    public void foulA(View view){
        foulA=foulA+1;
        diplayFoulForTeamA(foulA);
    }
    public void foulB(View view){
        foulB=foulB+1;
        diplayFoulForTeamB(foulB);
    }


    //functions to display th fouls of teams
    public void diplayFoulForTeamA(int foulA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foulA));
    }
    public void diplayFoulForTeamB(int foulB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foulB));
    }


}
