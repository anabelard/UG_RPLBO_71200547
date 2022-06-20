package com.rplbo.musicplaylist;

public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;

    public Song(String songName, String artistName, String albumName, int songLength){
        setArtist(artistName);
        setAlbum(albumName);
        setName(songName);
        setLength(songLength);
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
}
