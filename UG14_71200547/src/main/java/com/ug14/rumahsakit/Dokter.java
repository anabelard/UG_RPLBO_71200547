package com.ug14.rumahsakit;

public class Dokter {
    private static int idDokter = 0;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan){
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        if(jadwal.getStatusScreening()){
            int lvl = pasien.getLevelPenyakit();
            if(pasien.getLevelPenyakit()>0){
                pasien.setLevelPenyakit(lvl-1);
            }
            else{
                pasien.setStatus(true);
            }
        }
        else{
            System.out.println("==========ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN==========");
        }

    }

    public void cekStatus(Pasien pasien){
        if(!pasien.getStatus()){
            System.out.println("==========PASIEN ANDA MASIH SAKIT==========");
        }
        else{
            System.out.println("==========SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT==========");
        }
    }
}
