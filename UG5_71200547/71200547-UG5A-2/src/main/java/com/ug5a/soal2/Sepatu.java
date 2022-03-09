package com.ug5a.soal2;

public class Sepatu {

    private String kode;
    private int nextNum;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    private int id;

    public void setKode(String kode) {
        this.id+=1;
        String s = Integer.toString(this.id);
        this.kode = kode + s;
        setNextNum(this.id);
    }

    public String getKode(){
        return this.kode;
    }

    public void setNextNum(int nextNum) {
        this.nextNum = nextNum+1;
        this.id = this.nextNum;
    }

    public int getNextNum() {
        return nextNum;
    }



    public void setMerkModel(String merkModel) {
        this.merkModel = merkModel;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public Sepatu(String argMerkModel, int argUkuran, long argHarga, int argStok){
        setMerkModel(argMerkModel);
        setUkuran(argUkuran);
        setHarga(argHarga);
        setStok(argStok);
    }


    public String getMerkModel(){
        return this.merkModel;
    }

    public int getUkuran(){
        return this.ukuran;
    }

    public long getHarga(){
        return this.harga;
    }

    public int getStok(){
        return this.stok;
    }

}
