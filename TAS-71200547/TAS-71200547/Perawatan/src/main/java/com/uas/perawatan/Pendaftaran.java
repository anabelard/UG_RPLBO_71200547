package com.uas.perawatan;

import java.sql.SQLException;
import java.util.Scanner;

public class Pendaftaran {
    private int idPendaftaran;
    private String nama;

    public Pendaftaran(int idPendaftaran, String nama){
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar) throws SQLException {
        daftar.setPengunjung(pengunjung);
        daftar.setPemeriksa(pemeriksa);
        daftar.setPerawat(perawat);
        daftar.setStatusDaftar(true);
        System.out.println("Data Daftar Berhasil Disimpan!");
//        DAO.inputDaftar(daftar);
        System.out.println("==========Proses Pengaturan Daftar Berhasil==========");
    }

    public Pengunjung registrasi() throws SQLException {
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


        return new Pengunjung(RM, Nama, Usia, Alamat, Penyakit);

    }

    public int getIdPendaftaran() {
        return idPendaftaran;
    }

    public String getNama() {
        return nama;
    }


}
