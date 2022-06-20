package com.uas.perawatan;

import java.sql.*;

public class DAO {

    public static Connection connection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan","root","");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public void createDB() throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan")){
            if(conn!=null){
                DatabaseMetaData meta = conn.getMetaData();
            }
        }
    }

//    public Pendaftaran getPendaftaranByID(int idPendaftaran){
//
//    }
//
//    public Pemeriksa getPemeriksaByID(int idPemeriksa){
//
//    }
//
//    public Perawat getPerawatByID(int idPerawat){
//
//    }

    public static void inputDaftar(Daftar daftar) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS daftar (\n"
                +"idPemeriksaan int(11) AUTO_INCREMENT, \n"
                +"rm int(11), \n"
                +"idPemeriksa int(11), \n"
                +"idPerawat int(11), \n"
                +"idPendaftaran int(11), \n"
                +"status int(1) \n"
                +");";
        String sqlinput = "INSERT INTO daftar VALUES"+
                "("+daftar.getPengunjung().getRm()+", "+daftar.getPemeriksa().getIdPemeriksa()+", "+daftar.getPerawat().getIdPerawat()+", "+daftar.getPendaftaran().getIdPendaftaran()+", "+daftar.getPengunjung().getStatus()+");";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan"); Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            stmt.execute(sqlinput);
        }

    }

    public static void inputPengunjung(Pengunjung pengunjung) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS pengunjung (\n"
                +"rm int(8), \n"
                +"nama varchar(50), \n"
                +"usia int(3), \n"
                +"alamat varchar(100) \n"
                +");";
        String sqlinput = "INSERT INTO pengunjung VALUES"+
                "("+pengunjung.getRm()+", "+pengunjung.getNama()+", "+pengunjung.getUsia()+", "+pengunjung.getAlamat()+");";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/perawatan"); Statement stmt = conn.createStatement()){
            stmt.execute(sql);
            stmt.execute(sqlinput);
        }
    }

    public static void getPengunjungSembuh() throws SQLException {
        Connection con = connection();
        String sqlsembuh = "SELECT * FROM pengunjung NATURAL JOIN daftar WHERE status = 0";
    }
}
