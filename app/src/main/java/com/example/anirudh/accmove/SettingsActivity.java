package com.example.anirudh.accmove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {

    static Switch switchClickVolumeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        switchClickVolumeButton = (Switch) findViewById(R.id.switchClickVolumeButton);
        switchClickVolumeButton.setChecked(MainActivity.switchClickButtonToggle);
        switchClickVolumeButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    MainActivity.leftClickButtonWest.setVisibility(View.VISIBLE);
                    MainActivity.rightClickButtonEast.setVisibility(View.VISIBLE);
                    MainActivity.switchClickButtonToggle = true;
                    Log.i("checked","on");
                }
                if(!isChecked){
                    MainActivity.leftClickButtonWest.setVisibility(View.INVISIBLE);
                    MainActivity.rightClickButtonEast.setVisibility(View.INVISIBLE);
                    MainActivity.switchClickButtonToggle = false;
                    Log.i("checked","off");
                }
                // do something, the isChecked will be
                // true if the switch is in the On position
            }
        });
    }
}
