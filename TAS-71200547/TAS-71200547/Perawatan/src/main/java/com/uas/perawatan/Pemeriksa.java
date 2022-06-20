package com.uas.perawatan;

public class Pemeriksa {
    private int idPemeriksa;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(int idPemeriksa, String nama, String spesialis, String ruangan){
        this.idPemeriksa = idPemeriksa;
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung, Daftar daftar){
        if(daftar.getStatusScreening()){
            int lvl = pengunjung.getLevelPenyakit();
            if(pengunjung.getLevelPenyakit()>0){
                pengunjung.setLevelPenyakit(lvl-1);
            }
            else{
                pengunjung.setStatus(true);
                System.out.println("Status Pengunjung Berhasil Diubah!");
            }
        }
        else{
            System.out.println("==========ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN==========");
        }

    }

    public void cekStatus(Pengunjung pengunjung){
        if(!pengunjung.getStatus()){
            System.out.println("==========PASIEN ANDA MASIH SAKIT==========");
        }
        else{
            System.out.println("==========SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT==========");
            System.out.println("Status Pengunjung Berhasil Diubah!");
        }
    }

}
