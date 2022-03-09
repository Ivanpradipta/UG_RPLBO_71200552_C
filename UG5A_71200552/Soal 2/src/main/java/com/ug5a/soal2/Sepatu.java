package com.ug5a.soal2;
public class Sepatu {
    private String kode;
    private int nextNum;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;

    public Sepatu(String MerkModel, int Ukuran, long Harga, int Stok) {
        this.merkModel = MerkModel;
        this.ukuran = Ukuran;
        this.harga = Harga;
        this.stok = Stok;
    }

    public String getKode() {

        return this.kode;
    }

    public String getMerkModel() {
        return this.merkModel;
    }

    public int getUkuran() {

        return this.ukuran;
    }

    public long getHarga() {

        return this.harga;
    }

    public int getStok() {

        return this.stok;
    }
}

