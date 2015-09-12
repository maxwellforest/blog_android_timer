package com.maxwellforest.blogtimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Main container.
 *
 * @author Mike Gouline
 */
public class MainActivity extends AppCompatActivity {

    private static final int TIMER_LENGTH = 30;

    private TimerView mTimerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTimerView = (TimerView) findViewById(R.id.timer);

        final Button timerStartButton = (Button) findViewById(R.id.btn_timer_start);
        timerStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTimerView.start(TIMER_LENGTH);
            }
        });
    }

    @Override
    protected void onPause() {
        mTimerView.stop();

        super.onPause();
    }
}
