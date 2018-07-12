package com.example.android.musicstructure;

public class Songs {
    private String SongName;
    private String SongArtist;

    public Songs (String SongName, String SongArtist){
        this.SongName = SongName;
        this.SongArtist = SongArtist;
    }

    public String getSongName() {return SongName;}
    public String getSongArtist() {return SongArtist;}



}
