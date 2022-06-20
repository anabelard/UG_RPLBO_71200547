package com.uas.perawatan;

public class Pengunjung {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit = 3;
    private boolean status = false;

    public Pengunjung(String nama, int usia, String alamat){
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public Pengunjung(int rm, String nama, int usia, String alamat, String penyakit){
        this.rm = rm;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
        System.out.println("Data Pengunjung Berhasil Disimpan!");
        System.out.println("==========Proses Registrasi Berhasil==========");
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
