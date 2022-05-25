package com.ug12.projectkassa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Kassa {
    private HashMap<Produk, Integer> pesanan = new HashMap<Produk, Integer>();
    private ArrayList<Kasir> arrKasir = new ArrayList<Kasir>();
    private Kasir kasir;

    public Kassa(){

    }

    public void login(String username, String password){
        int i = 0;
        boolean loop = true;
        while (i<arrKasir.size()) {
            if (Objects.equals(arrKasir.get(i).getUsername(), username) && Objects.equals(arrKasir.get(i).getPassword(), password)) {
                System.out.println("Login berhasil!");
                loop = false;
                break;
            }
            i++;
        }
        if(loop){
            System.out.println("Username/password Anda salah!");
        }

    }

    public void register(Kasir kasir){
        this.arrKasir.add(kasir);
        System.out.println("Kasir "+kasir.getNama()+" berhasil dimasukkan ke dalam sistem.");
    }

    public void tambahPesanan(Produk produk, int jumlah){
        this.pesanan.put(produk, jumlah);
    }

    public void printNota(){
        System.out.println("==========Nota==========");
        System.out.println("Kasir: "+kasir.getNama());
        System.out.println("No. Nama Barang   Jumlah   Harga    SubTotal");
    }

    public void printPenjualanKasir(){

    }
}
