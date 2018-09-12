package com.yashballani.codepath.codepathprework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Change text color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });

        // Change background color
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                findViewById(R.id.relativeView).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });

        // Change text
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Grab text from edit text and set it in text view
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (newText.equals(""))
                    newText = "Android is Awesome!";

                ((TextView) findViewById(R.id.textView)).setText(newText);
            }
        });

        // Reset everything on background tap
        findViewById(R.id.relativeView).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Reset text color
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorWhite));
                // Reset background color
                findViewById(R.id.relativeView).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                // Reset text
                ((TextView) findViewById(R.id.textView)).setText("Hello from Yash!");
            }
        });
    }
}
