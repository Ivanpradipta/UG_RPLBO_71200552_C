package com.ug5a.soal1;

public class Keyboard {
    private String merkModel;
    public long harga;

    public void setMerkModel(String newMerk) {
        merkModel = newMerk;
    }

    public void setHarga(long newHarga) {
        harga= newHarga;
    }

    public String getMerkModel() {
        return merkModel;
    }
    public long getHarga() {
        return harga;
    }

}
