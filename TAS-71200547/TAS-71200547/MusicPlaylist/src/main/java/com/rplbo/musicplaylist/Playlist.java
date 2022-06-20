package com.rplbo.musicplaylist;

import java.util.ArrayList;
import java.util.Objects;

public class Playlist {
    private String playlistName;
    private ArrayList<Song> songs = new ArrayList<>();
    private final int count = 6;

    public Playlist(){

    }

    public String getPlaylistName(){
        return this.playlistName;
    }

    public void print(){
        System.out.println("Jumlah Lagu = "+this.songs.size()+" / Kapasitas Playlist = "+this.count);
        for(int i=0; i< songs.size(); i++){
            System.out.println("ListSong["+i+"] : "+songs.get(i).getName()+" - "+songs.get(i).getArtist());
        }
        System.out.println();
    }

    public void setPlayListName(String playlistName){
        this.playlistName = playlistName;
    }

    public String totalTime(){
        int totalwaktu = 0;
        for(int i=0; i<songs.size(); i++){
            totalwaktu+=songs.get(i).getLength();
        }
        return "Total waktu ["+getPlaylistName()+"] = "+totalwaktu+" detik";
    }

    public void add(Song song){
        if(this.songs.size()<this.count){
            this.songs.add(song);
        }
        else{
            System.out.println("Playlist "+getPlaylistName()+" penuh! Tidak bisa menambahkan lagu lagi.");
        }
    }

    public void remove(String songName){
        for(int i=0; i<songs.size(); i++){
            if(Objects.equals(songs.get(i).getName(), songName)){
                this.songs.remove(i);
                System.out.println(songName+" terhapus...");
            }
        }
//        return songs.get(i);
    }

    public int size(){
        return songs.size();
    }
}
