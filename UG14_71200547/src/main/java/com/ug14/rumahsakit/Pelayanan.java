package com.ug14.rumahsakit;

import java.util.Scanner;

public class Pelayanan {
    private static int idPelayanan = 0;
    private String nama;

    public Pelayanan(String nama){
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal){
        jadwal.setPasien(pasien);
        jadwal.setDokter(dokter);
        jadwal.setSuster(suster);
        jadwal.setStatusDaftar(true);
        System.out.println("==========PROSES PENGATURAN JADWAL BERHASIL==========");
    }

    public Pasien registrasi(){
        Scanner rm = new Scanner(System.in);
        System.out.print("Masukkan rm baru : ");
        String rmm = rm.nextLine();
        int RM = Integer.parseInt(rmm);

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


        

        return new Pasien(RM, Nama, Usia, Alamat, Penyakit);

    }

}
