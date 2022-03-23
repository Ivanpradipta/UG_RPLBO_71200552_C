package com.ug7.ewallet;

public class eWallet extends User{
    private User user;
    private int saldo;

    public eWallet(String nama, String email, int uang) {
        super(nama, email, uang);
    }

    public String eWallet(User user){
        this.user=user;

        return null;
    }

    public int topup(int jumlah){
        this.saldo += jumlah;
        return saldo;

    }

    public int transfer(eWallet eWallet,int jumlah){

        return jumlah;
    }

    public int withdraw(int jumlah){

        return jumlah;
    }

    public void getInfo(){

    }


}
