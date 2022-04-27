package com.ug9.etransactionproject;

public class Dana extends MobileWallet{
    private final long danaFeeTransferBank = 1000;

    public Dana(String nama, long saldo, String noHp){
        super(nama, saldo, noHp);
    }

    public void transfer(DigitalPayment dp, long nominal){
        this.setFeeTransferBank(danaFeeTransferBank);
        if(dp instanceof Ovo){
            System.out.println("Transfer gagal, akun DANA tidak valid");
        }
        else{
            super.transfer(dp, nominal);
        }
    }

}
