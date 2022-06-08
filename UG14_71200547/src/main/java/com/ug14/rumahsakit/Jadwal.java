package com.ug14.rumahsakit;

public class Jadwal {
    private int idPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar;
    private boolean statusScreening;

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Suster getSuster() {
        return suster;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public void setPelayanan(Pelayanan pelayanan) {
        this.pelayanan = pelayanan;
    }


    public Jadwal(){

    }

    public boolean getStatusDaftar() {
        return this.statusDaftar;
    }

    public boolean getStatusScreening() {
        return this.statusScreening;
    }



    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public Pasien getPasien(){
        return this.pasien;
    }


}
