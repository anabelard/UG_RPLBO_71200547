package com.ug13.rumahsakit;

public class Jadwal {
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private boolean statusDaftar = false;

    public Jadwal(){

    }

    public boolean getStatusDaftar() {
        return this.statusDaftar;
    }

    public boolean getStatusScreening() {
        return this.statusScreening;
    }

    private boolean statusScreening = false;


    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }


//    public Jadwal(){
//
//    }

    public Pasien getPasien(){
        return this.pasien;
    }


}
