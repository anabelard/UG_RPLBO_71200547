package com.uas.perawatan;

public class Perawat {

    private int idPerawat;
    private String nama;

    public Perawat(int idPerawat, String nama){
        this.idPerawat = idPerawat;
        this.nama = nama;
    }

    public void screening(Pengunjung pengunjung, Daftar daftar){
        if(pengunjung.getPenyakit()==null){
            System.out.println("==========ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN==========");
        }
        else{
            daftar.setStatusScreening(true);

        }
    }

    public int getIdPerawat() {
        return idPerawat;
    }

    public String getNama() {
        return nama;
    }

}
