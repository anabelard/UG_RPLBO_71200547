package com.ug7.ewallet;
import java.util.Scanner;


public class GoPay extends eWallet{
    private final int feeTopup = 1000;
    private final int feeTransfer = 500;
    private final int feeWithdraw = 2500;

    public GoPay(User user){
        super(user);
    }

    public void topup(int jumlah){
        if (jumlah >= 10000 && super.getUser().getUang()+feeTopup>=jumlah){
            super.topup(jumlah);
            System.out.println("Halo, "+super.getUser().getNama()+"! Top up sebesar "+jumlah+" berhasil!");
        }
        else{
            System.out.println("Maaf, minimal top up 10.000,00");;
        }
    }

    public void getInfo(){
        System.out.println("[GoPay e-Wallet]");
        super.getInfo();
    }

    public void withdraw(int jumlah){
        if (super.getSaldo()>=jumlah+this.feeWithdraw){
            super.withdraw(jumlah);
        }
        else{
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+(this.getSaldo()-jumlah)+")");
        }
    }

    public void transfer(eWallet eWallet, int jumlah){
        System.out.print("Masukkan PIN kamu: ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.print("Validasi PIN");
        if (!password.equals(this.getUser().getPIN())) {
            System.out.println("Maaf, PIN yang kamu masukkan salah!");
        }
        else {
            if (super.getSaldo()<jumlah + this.feeTransfer) {
                System.out.println("Maaf, saldo kamu tidak mencukupi! ("+(this.getSaldo()-jumlah) + ")");
            } else {
                super.transfer(eWallet, jumlah);
            }
        }

    }

    public User getUser() {
        return super.getUser();
    }


}
