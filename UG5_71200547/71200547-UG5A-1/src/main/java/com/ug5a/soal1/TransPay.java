package com.ug5a.soal1;

public class TransPay {

    private String nama;
    private long saldo;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSaldo(long saldo){
        this.saldo = saldo;
    }

    public String getNama(){
        return nama;
    }

    public long getSaldo(){
        return saldo;
    }

    public void topUp(long isiSaldo){
        if(isiSaldo>0){
            this.saldo+=isiSaldo;
            System.out.println("Top up sebesar " + isiSaldo + " berhasil");
        }
        else {
            System.out.println("Nominal Anda tidak valid! Nominal harus lebih dari 0");
        }
    }

    public void bayar(int jumlah, Keyboard k){
        long jumlah2 = jumlah;
        if (jumlah>0){
            if (jumlah2 * k.getHarga() <= this.saldo){
                this.saldo = this.saldo - jumlah * k.getHarga();
                System.out.println("Pembayaran sukses! Silahkan mengambil " + k.getMerkModel() + " di counter");
            }
            else {
                System.out.println("Pembayaran gagal! Saldo anda kurang, silahkan melakukan top up!");
            }
        }
        else {
            System.out.println("Input jumlah tidak valid");
        }
    }

}
