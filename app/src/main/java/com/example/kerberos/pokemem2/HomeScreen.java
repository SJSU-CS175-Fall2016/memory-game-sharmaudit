package com.example.kerberos.pokemem2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //play button
        Button play = (Button) findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent start = new Intent(v.getContext(),Game.class);
                startActivity(start);
            }
        });

        //rule button
        Button rule = (Button) findViewById(R.id.ruleButton);
        rule.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent rules = new Intent(v.getContext(),Rule.class);
                startActivity(rules);
            }
        });

    }

}
