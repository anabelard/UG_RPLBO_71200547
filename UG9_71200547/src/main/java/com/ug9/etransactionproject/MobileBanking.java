package com.ug9.etransactionproject;

public class MobileBanking extends DigitalPayment{
    private boolean checkFee = false;
    private final long feeAntarBank = 6000;
    private String noRekening;

    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama, saldo);
        this.noRekening=noRekening;
    }

    public String getNoRekening(){
        return this.noRekening;
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
                if(this.checkFee){
                    this.setSaldo(getSaldo()-(nominal+feeAntarBank));
                    dp.setSaldo(getSaldo()+nominal);
                    printBuktiTransfer(dp, nominal);
                }
            }
        }

    }

    public boolean isCheckFee(){
        return this.checkFee;
    }

    public void setCheckFee(boolean checkFee){
        this.checkFee=true;
    }

}
