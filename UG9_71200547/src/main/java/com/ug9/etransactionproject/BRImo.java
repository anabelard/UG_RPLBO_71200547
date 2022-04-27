package com.ug9.etransactionproject;

public class BRImo extends MobileBanking{
    public BRImo(String nama, long saldo, String noRekening){
        super(nama, saldo, noRekening);
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(dp instanceof BNImo){
            super.isCheckFee();
            super.transfer(dp, nominal);
        }
    }

}
