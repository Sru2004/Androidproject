package com.srujana.assignmentno5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements InboxFragment.OnEmailSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onEmailSelected(String email) {

        DetailFragment detailFragment =
                (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);

        if (detailFragment != null) {
            detailFragment.updateEmail(email);
        }
    }
}