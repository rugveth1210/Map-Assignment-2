package com.example.assignment2_map;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends FragmentActivity {
    RadioButton getCurrentLocation, changeBackgroundColour,showAllLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getCurrentLocation=(findViewById(R.id.getCurrentLocation));
        changeBackgroundColour=findViewById(R.id.changeBackgroundColour);
        showAllLocations=findViewById(R.id.showAllLocations);

        getCurrentLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager= getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                GetCurrentLocation f1 = new GetCurrentLocation();
                fragmentTransaction.add(R.id.fragmentContainer,f1);
                fragmentTransaction.commit();


            }
        });

        changeBackgroundColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openDialog();
            }
        });

    }

    public void openDialog(){
        DialogBox dialogBox=new DialogBox();
        dialogBox.show(getSupportFragmentManager(),"dialog box");

    }
}
