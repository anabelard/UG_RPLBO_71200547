package com.ug13.rumahsakit;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Pelayanan {
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Jadwal jadwal){

    }

    public Pasien registrasi(){
        Scanner nama = new Scanner(System.in);
        System.out.print("Masukkan nama anda : ");
        String namaa = nama.nextLine();
        String Nama = new String(String.valueOf(namaa));

        Scanner usia = new Scanner(System.in);
        System.out.print("Masukkan usia anda : ");
        String usiaa = usia.nextLine();
        int Usia = Integer.parseInt(usiaa);


        Scanner alamat = new Scanner(System.in);
        System.out.print("Masukkan alamat anda : ");
        String alamatt = alamat.nextLine();
        String Alamat = new String(String.valueOf(alamatt));


        Scanner penyakit = new Scanner(System.in);
        System.out.print("Masukkan penyakit anda : ");
        String penyakitt = penyakit.nextLine();
        String Penyakit = new String(String.valueOf(penyakitt));
        System.out.println();
        System.out.println("==========PROSES REGISTRASI BERHASIL==========");


        return new Pasien(Nama, Usia, Alamat, Penyakit);

    }
}
