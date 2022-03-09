package com.ug5a.soal1;

public class TransPay {
    private String nama;
    public Long saldo;

    public void setNama(String newNama) {
        nama = newNama;
    }
    public void setSaldo(long newSaldo) {
        saldo = newSaldo;
    }
    public String getNama() {
        return nama;
    }
    public long getSaldo() {
        return saldo;
    }
    public void topUp(long newTopUp){
        saldo = newTopUp + saldo;
    }

    public void bayar(int jumlah, Keyboard k){
        if (jumlah>0 && saldo >= (jumlah*k.getHarga())){
            saldo = saldo - (jumlah*k.getHarga());
            System.out.println("Pembayaran SUKSES! Silahkan mengambil "+k.getMerkModel()+" di counter");}


        else if(jumlah>0 && saldo < (jumlah*k.getHarga())){
            System.out.println("Pembayaran GAGAL! Saldo Anda Kurang silakan melakukan top up");}



        else{
            System.out.println("Input jumlah tidak valid!");}
    }



}
