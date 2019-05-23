package com.example.expandableviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.tvHeadingText);
        final ImageView expandBtn = findViewById(R.id.ivExpandButton);
        final TextView t2 = (TextView) findViewById(R.id.tvText);


        expandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (t2.getVisibility() == View.GONE) {
                    t2.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
                    t2.startAnimation(animation);
                } else {
                    t2.setVisibility(View.GONE);
                }
            }
        });

    }
}
