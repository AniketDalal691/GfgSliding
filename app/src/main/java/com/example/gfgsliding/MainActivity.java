package com.example.gfgsliding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    public static final String ARG_USE_EXPANSION = "arg_use_expansion";
    public static final String ARG_EXPANSION_LEFT_OFFSET = "arg_left_offset";
    public static final String ARG_EXPANSION_TOP_OFFSET = "arg_top_offset";
    public static final String ARG_EXPANSION_VIEW_WIDTH = "arg_view_width";
    public static final String ARG_EXPANSION_VIEW_HEIGHT = "arg_view_height";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //registering click event
        findViewById(R.id.show_image).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ImageActivity.class));
            }
        });
    }




}