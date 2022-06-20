package com.uas.perawatan;

import java.sql.*;
import java.util.Scanner;

public class Pendaftaran {
    private int idPendaftaran;
    private String nama;

    private String url = "jdbc:sqlite:rumahsakit.db";


    public Pendaftaran(int idPendaftaran, String nama){
        this.idPendaftaran = idPendaftaran;
        this.nama = nama;
    }

    public void mengaturDaftar(Pengunjung pengunjung, Pemeriksa pemeriksa, Perawat perawat, Daftar daftar){
        daftar.setPengunjung(pengunjung);
        daftar.setPemeriksa(pemeriksa);
        daftar.setPerawat(perawat);
        daftar.setStatusDaftar(true);

        System.out.println("==========PROSES PENGATURAN JADWAL BERHASIL==========");
    }

    public Pengunjung registrasi(){
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






//        Connection conn = null;
//        try{
//            conn = DriverManager.getConnection(url);
//        }
//        catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            try{
//                if(conn!=null){
//                    conn.close();
//                }
//            }
//            catch (SQLException ex){
//                System.out.println(ex.getMessage());
//            }
//        }
//
//        try(Connection conn2 = DriverManager.getConnection(url)){
//            if(conn2!=null){
//                DatabaseMetaData meta = conn2.getMetaData();
//            }
//        }
//        catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//
//        String sql1 = "CREATE TABLE IF NOT EXISTS pasien (rm int(8) PRIMARY KEY, nama varchar(100), usia int(3), alamat varchar(100));";
//        String sql2 = "INSERT INTO pasien (rm, nama, usia, alamat) VALUES ("+RM+","+Nama+","+Usia+","+Alamat+");";
//        try(Connection conn3 = DriverManager.getConnection(url); Statement statement = conn.createStatement()){
//            statement.execute(sql1);
//            statement.execute(sql2);
//        }
//        catch (SQLException e){
//            System.out.println(e.getMessage());
//        }









        return new Pengunjung(RM, Nama, Usia, Alamat, Penyakit);

    }

}
