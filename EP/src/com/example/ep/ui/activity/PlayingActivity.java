package com.example.ep.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.ep.R;

public class PlayingActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.playing, menu);
        return true;
    }

}
