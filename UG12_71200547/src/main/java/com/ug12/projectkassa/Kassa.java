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
                this.pesanan.clear();
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
        this.kasir = kasir;
        System.out.println("Kasir "+kasir.getNama()+" berhasil dimasukkan ke dalam sistem.");
    }

    public void tambahPesanan(Produk produk, int jumlah){
        this.pesanan.put(produk, jumlah);
    }

    public void printNota(){
        int a = 1;
        long total = 0;
        System.out.println("==========Nota==========");
        System.out.println("Kasir: "+ this.kasir.getNama());
        System.out.println("No. Nama Barang     Jumlah    Harga    SubTotal");
        for (Produk i : pesanan.keySet()) {
            System.out.println(a+".  " +i.getNama()+ "     " + pesanan.get(i)+"x     "+i.getHarga()+"   "+(i.getHarga()*pesanan.get(i)));
            a++;
            total += i.getHarga()*pesanan.get(i);
        }
        kasir.setTotalPenjualan(total);
        System.out.println("Total: Rp"+total);
    }

    public void printPenjualanKasir(){
        int a = 1;
        System.out.println("Daftar Kasir:");
        System.out.println("No.  Nama         Total Penjualan");
        for (int i=0; i<arrKasir.size(); i++) {
            System.out.println(a+"  "+ arrKasir.get(i).getNama()+"     Rp"+arrKasir.get(i).getTotalPenjualan());
        }

    }
}
