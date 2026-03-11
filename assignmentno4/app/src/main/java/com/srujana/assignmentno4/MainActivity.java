package com.srujana.assignmentno4;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Explicit Intent → Open Google
    public void openGoogle(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.google.com"));
        startActivity(intent);
    }

    // Implicit Intent → Open Resume Activity
    public void openResume(View view) {
        Intent intent = new Intent("com.srujana.assignmentno4.RESUME");
        startActivity(intent);
    }
}