package com.ug12.projectkassa;

public class Kasir {
    private String password;
    private long totalPenjualan;
    private String username;
    private String nama;

    public Kasir(String nama, String username, String password){
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public long getTotalPenjualan(){
        return this.totalPenjualan;
    }

    public String getPassword(){
        return this.password;
    }

    public String getNama(){
        return this.nama;
    }

    public String getUsername(){
        return this.username;
    }

    public void setTotalPenjualan(long totalPenjualan){
        this.totalPenjualan = totalPenjualan;
    }

}
