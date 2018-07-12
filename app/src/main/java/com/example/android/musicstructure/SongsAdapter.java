package com.example.android.musicstructure;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;




public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.SongsHolder> {
    private LayoutInflater layoutInflater;
    private ArrayList<Songs> SongsDatabase;

    public SongsAdapter(Context context, ArrayList<Songs> SongsDatabase){
        this.layoutInflater = LayoutInflater.from(context);
        this.SongsDatabase = SongsDatabase;
    }


    @Override
    public SongsHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View view = layoutInflater.inflate(R.layout.songs_main, parent, false);
        return new SongsHolder(view);
    }

    @Override
    public void onBindViewHolder(SongsHolder holder, int position){
        final Songs currentSong = SongsDatabase.get(position);


        holder.songName.setText(currentSong.getSongName());
        holder.songArtist.setText(currentSong.getSongArtist());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "You Picked, " + currentSong.getSongName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
        public int getItemCount() {
            return SongsDatabase.size();
    }

    class SongsHolder extends RecyclerView.ViewHolder{
        private TextView songName;
        private TextView songArtist;

        private SongsHolder(View songsView){
            super(songsView);
            songName = songsView.findViewById(R.id.song_name);
            songArtist = songsView.findViewById(R.id.artist_name);
        }

    }



}
