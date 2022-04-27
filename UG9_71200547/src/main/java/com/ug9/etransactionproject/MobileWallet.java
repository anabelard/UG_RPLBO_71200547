package com.ug9.etransactionproject;

public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama, long saldo, String noHp){
        super(nama, saldo);
        this.noHp=noHp;
    }

    public void setFeeTransferBank(long feeTransferBank){
        this.feeTransferBank=feeTransferBank;
    }

    public String getNoHp(){
        return this.noHp;
    }

    public void transfer(DigitalPayment dp, long nominal){
        if(this.getSaldo()<0){
            System.out.println("Transfer gagal, input tidak valid");
        }
        else{
            if(this.getSaldo()<nominal){
                System.out.println("Transfer gagal, saldo anda tidak mencukupi");
            }
            else{
                if(dp instanceof BNImo || dp instanceof BRImo){
                    this.setSaldo(getSaldo()-(nominal+feeTransferBank));
                    dp.setSaldo(getSaldo()+nominal);
                    printBuktiTransfer(dp, nominal);
                }
            }
        }
    }
}
