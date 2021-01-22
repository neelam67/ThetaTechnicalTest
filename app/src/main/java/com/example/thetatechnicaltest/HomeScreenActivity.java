package com.example.thetatechnicaltest;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        // get the reference of RecyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
// set a LinearLayoutManager with default orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView

        //  call the constructor of CustomAdapter to send the reference and data to Adapter
        ArrayList<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(new UserDetails("George","Bluth","george.bluth@reqres.in","https://reqres.in/img/faces/1-image.jpg"));
        userDetailsList.add(new UserDetails("Janet","Weaver","janet.weaver@reqres.in","https://reqres.in/img/faces/2-image.jpg"));
        userDetailsList.add(new UserDetails("Emma","Wong","emma.wong@reqres.in","https://reqres.in/img/faces/3-image.jpg"));

        CustomAdapter customAdapter = new CustomAdapter(HomeScreenActivity.this, userDetailsList);
        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
    }
}