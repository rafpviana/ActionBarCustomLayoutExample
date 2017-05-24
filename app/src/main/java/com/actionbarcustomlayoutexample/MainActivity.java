package com.actionbarcustomlayoutexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private boolean showButton = false;
    private ImageButton imageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.custom_actionbar);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Back button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!showButton){
                    imageButton.setBackgroundResource(R.drawable.transparent_icon);
                    imageButton.setClickable(false);
                    showButton = true;
                }
                else{
                    imageButton.setBackgroundResource(R.drawable.back_button_icon_40_x_40);
                    imageButton.setClickable(true);
                    showButton = false;
                }
            }
        });




    }



}
