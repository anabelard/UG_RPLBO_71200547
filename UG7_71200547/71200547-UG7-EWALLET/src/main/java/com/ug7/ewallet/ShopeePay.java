package com.ug7.ewallet;

import java.util.Scanner;

public class ShopeePay extends eWallet{
    private final int feeTopup = 500;
    private final int feeTransfer = 0;
    private final int feeWithdraw = 1000;

    public ShopeePay(User user){
        super(user);
    }

    public void topup(int jumlah){
        if (super.getUser().getUang()+feeTopup>=jumlah){
            super.topup(jumlah);
            System.out.println("Halo, "+super.getUser().getNama()+"! Top up sebesar "+jumlah+" berhasil!");
        }
    }

    public void transfer(eWallet eWallet, int jumlah){
        if (super.getSaldo()<jumlah + this.feeTransfer) {
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+(this.getSaldo()-jumlah) + ")");
        } else {
            super.transfer(eWallet, jumlah);
            System.out.println("Transfer "+jumlah+" berhasil!");
        }
    }

    public void withdraw(int jumlah){
        if (super.getSaldo()>=jumlah+this.feeWithdraw){
            super.withdraw(jumlah);
        }
        else{
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+(this.getSaldo()-jumlah)+")");
        }
    }

    public void getInfo(){
        System.out.println("[ShopeePay e-Wallet]");
        super.getInfo();
    }

    public User getUser() {
        return super.getUser();
    }
}
