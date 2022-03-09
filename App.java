package com.ug3.soal1;

/**
 * Hello world!
 *
 */
public class UG3soal1 {
    public static void main(String[] args) {
        String judul = "==========Data Product==========";
        System.out.println(judul);
        System.out.println("Masukkan produk makanan anda");
        System.out.print("Nama makanan : ");
        String namaMakanan = System.console().readLine();
        System.out.print("Tanggal kadaluarsa : ");
        String tglKadaluarsa = System.console().readLine();
        System.out.print("Jumlah : ");
        String jumlah = System.console().readLine();
        System.out.print("Berat : ");
        String beratGram = System.console().readLine();

        System.out.println(judul);
        System.out.println("Nama makanan : " + namaMakanan);
        System.out.println("Tanggal kadaluarsa : " + tglKadaluarsa);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Berat : " + beratGram);

    }
}
