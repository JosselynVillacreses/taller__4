package com.example.josselyn.taller__4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    /**
     * A string constant to use in calls to the "log" methods. Its
     * value is often given by the name of the class, as this will
     * allow you to easily determine where log methods are coming
     * from when you analyze your logcat output.
     */
    private static final String TAG = "SampleActivity";

    /**
     * Toggle this boolean constant's value to turn on/off logging
     * within the class.
     */

    private static final boolean VERBOSE = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("+++ ON CREATE +++");
    }

    @Override
    public void onStart() {
        super.onStart();

        System.out.println("+++ ON START +++");

    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("+++ ON RESUME +++");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("+++ ON PAUSE +++");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("+++ ON STOP +++");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("+++ ON DESTROY+++");
    }
}
