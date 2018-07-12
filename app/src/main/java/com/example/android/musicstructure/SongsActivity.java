package com.example.android.musicstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    public ArrayList<Songs> SongsDatabase = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_main);

        SongsDatabase.add(new Songs("Lydia","Highly Suspect"));
        SongsDatabase.add(new Songs("3AM","Matchbox Twenty"));
        SongsDatabase.add(new Songs("Zombie","Bad Wolfe"));


        SongsAdapter SongsAdapter = new SongsAdapter( this, SongsDatabase );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView = findViewById(R.id.songs_recycler_view);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(SongsAdapter);




    }

}
