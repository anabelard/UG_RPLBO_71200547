package com.ug7.ewallet;

public class eWallet{
    private User user;
    private int saldo;

    public eWallet(User user){
        this.user = user;
    }

    public void topup(int jumlah){
        if (this.user.getUang() < jumlah){
            System.out.println("Maaf, uang cash kamu tidak mencukupi! ("+(this.user.getUang()-jumlah)+")");
        }
        else{
            this.user.topup(jumlah);
            this.saldo+=jumlah;
        }
    }

    public void transfer(eWallet eWallet, int jumlah){
        if (jumlah<=this.saldo){
            this.saldo -= jumlah;
        }
        else{
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+(this.saldo-jumlah)+")");
        }
    }

    public void withdraw(int jumlah){
        if (jumlah<=this.saldo){
            this.saldo-=jumlah;
        }
        else {
            System.out.println("Maaf, saldo kamu tidak mencukupi! ("+(this.saldo-jumlah)+")");
        }
    }



    public void getInfo(){
        System.out.println(this.user.getNama()+"[PIN: "+this.user.getPIN()+"]");
        System.out.println(this.user.getEmail());
        System.out.println(this.user.getUang());
        System.out.println(this.saldo);
    }

    public User getUser() {
        return this.user;
    }

    public int getSaldo(){
        return this.saldo;
    }

}
