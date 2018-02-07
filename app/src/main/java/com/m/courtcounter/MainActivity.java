package com.m.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int TeamAScore = 0;
    public int TeamBScore = 0;

    TextView teamApts, teamBpts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamApts = (TextView) findViewById(R.id.teamAPts);
        teamBpts = (TextView) findViewById(R.id.teamBPts);

        setScores();
    }

    public void setScores(){
        teamApts.setText(String.valueOf(TeamAScore));
        teamBpts.setText(String.valueOf(TeamBScore));
    }
    public void teamA3pts (View view){
        TeamAScore = TeamAScore + 3;
        setScores();
    }

    public void teamA2pts(View view){
        TeamAScore = TeamAScore + 2;
        setScores();
    }

    public void teamA1pts(View view){
        TeamAScore = TeamAScore + 1;
        setScores();
    }

    //TEAM B SCORES
    public void teamB3pts (View view){
        TeamBScore = TeamBScore + 3;
        setScores();
    }

    public void teamB2pts(View view){
        TeamBScore = TeamBScore + 2;
        setScores();
    }

    public void teamB1pts(View view){
        TeamBScore = TeamBScore + 1;
        setScores();
    }

    //RESETTING ALL
    public void reset(View view){
        TeamAScore =TeamBScore = 0;
        setScores();
    }

}
