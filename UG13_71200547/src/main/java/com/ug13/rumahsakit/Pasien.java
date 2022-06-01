package com.ug13.rumahsakit;

public class Pasien {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit = 3;
    private boolean status = false; //tadinya String yak

    public Pasien(String nama, int usia, String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public Pasien(String nama, int usia, String alamat, String penyakit){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }

    public void setLevelPenyakit(int levelPenyakit){
        this.levelPenyakit = levelPenyakit;
    }

    public int getLevelPenyakit(){
        return this.levelPenyakit;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public String getPenyakit(){
        return this.penyakit;
    }
}
