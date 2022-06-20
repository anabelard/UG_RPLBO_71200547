package com.uas.perawatan;

public class Daftar {
    private int idPemeriksaan;
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private boolean statusDaftar = false;
    private boolean statusScreening = false;



    public void setPengunjung(Pengunjung pengunjung) {
        this.pengunjung = pengunjung;
    }

    public Pemeriksa getPemeriksa() {
        return pemeriksa;
    }

    public void setPemeriksa(Pemeriksa pemeriksa) {
        this.pemeriksa = pemeriksa;
    }

    public Perawat getPerawat() {
        return perawat;
    }

    public void setPerawat(Perawat perawat) {
        this.perawat = perawat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }

    public void setPendaftaran(Pendaftaran pendaftaran) {
        this.pendaftaran = pendaftaran;
    }


    public Daftar(){

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

    public Pengunjung getPengunjung(){
        return this.pengunjung;
    }


}
