package comb.example.ganga.cricket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button to add 6 runs for Team A

        Button sixApoints = findViewById(R.id.teamA_6runs);
        sixApoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamA = teamA + 6;
                TextView scoreA = findViewById(R.id.teamA_score);
                scoreA.setText(Integer.toString(teamA));

            }
        });

        //Button to add 4 runs for Team A


        Button fourApoints = findViewById(R.id.teamA_4runs);
        fourApoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamA = teamA + 4;
                TextView scoreA = findViewById(R.id.teamA_score);
                scoreA.setText(Integer.toString(teamA));

            }
        });

        //Button to add 2 runs for Team A

        Button twoApoints = findViewById(R.id.teamA_2runs);
        twoApoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamA = teamA + 2;
                TextView scoreA = findViewById(R.id.teamA_score);
                scoreA.setText(Integer.toString(teamA));

            }
        });

        //Button to add 1 runs for Team A

        Button oneApoints = findViewById(R.id.teamA_1runs);
        oneApoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamA = teamA + 1;
                TextView scoreA = findViewById(R.id.teamA_score);
                scoreA.setText(Integer.toString(teamA));

            }
        });

        //Button to subtract 1 runs for  wide for Team A


        Button wideApoints = findViewById(R.id.teamA_wide);
        wideApoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(teamA>0){

                    teamA = teamA - 1;
                    TextView scoreA = findViewById(R.id.teamA_score);
                    scoreA.setText(Integer.toString(teamA));

                } else{

                    TextView scoreA = findViewById(R.id.teamA_score);
                    scoreA.setText("0");
                }

            }
        });


        //Button to subtract 1 runs for No ball Team A


        Button noApoints = findViewById(R.id.teamA_noballs);
        noApoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(teamA>0){

                    teamA = teamA - 1;
                    TextView scoreA = findViewById(R.id.teamA_score);
                    scoreA.setText(Integer.toString(teamA));

                } else {

                    TextView scoreA = findViewById(R.id.teamA_score);
                    scoreA.setText("0");
                }

            }
        });


        //Button to add 6 runs for Team B


        Button sixBpoints = findViewById(R.id.teamB_6runs);
        sixBpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamB = teamB + 6;
                TextView scoreB = findViewById(R.id.teamB_score);
                scoreB.setText(Integer.toString(teamB));

            }
        });


        //Button to add 4 runs for Team B

        Button fourBpoints = findViewById(R.id.teamB_4runs);
        fourBpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamB = teamB + 1;
                TextView scoreB = findViewById(R.id.teamB_score);
                scoreB.setText(Integer.toString(teamB));

            }
        });


        //Button to add 2 runs for Team B

        Button twoBpoints = findViewById(R.id.teamB_2runs);
        twoBpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamB = teamB + 2;
                TextView scoreB = findViewById(R.id.teamB_score);
                scoreB.setText(Integer.toString(teamB));

            }
        });

        //Button to add 1 runs for Team B

        Button oneBpoints = findViewById(R.id.teamB_1runs);
        oneBpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                teamB = teamB + 1;
                TextView scoreB = findViewById(R.id.teamB_score);
                scoreB.setText(Integer.toString(teamB));

            }
        });


        //Button to subtract 1 runs for wide for Team B

        Button wideBpoints = findViewById(R.id.teamB_wide);
        wideBpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(teamB>0){

                    teamB = teamB - 1;
                    TextView scoreB = findViewById(R.id.teamB_score);
                    scoreB.setText(Integer.toString(teamB));

                } else{

                    TextView scoreB = findViewById(R.id.teamB_score);
                    scoreB.setText("0");
                }

            }
        });


        //Button to subtract 1 runs for no ball for Team B

        Button noballBpoints = findViewById(R.id.teamB_noball);
        noballBpoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(teamB>0){

                    teamB = teamB - 1;
                    TextView scoreB = findViewById(R.id.teamB_score);
                    scoreB.setText(Integer.toString(teamB));

                } else{

                    TextView scoreB = findViewById(R.id.teamB_score);
                    scoreB.setText("0");
                }
            }
        });


        //Resets the score to 0 for both the teams

        Button buttonReset = findViewById(R.id.reset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                TextView scoreA = findViewById(R.id.teamA_score);
                scoreA.setText(Integer.toString(0));

                TextView scoreB = findViewById(R.id.teamB_score);
                scoreB.setText(Integer.toString(0));

            }
        });
    }

}




