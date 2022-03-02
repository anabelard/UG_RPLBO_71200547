package com.ug4.soal1;

public class Passenger {
    String name;
    double balance;
    String email;
    String destiny;

    public Passenger(String nama, String emailx, double uang){
        name = nama;
        email = emailx;
        balance = uang;
    }

    public String getName(){
        return name;
    }
    public void setName(String setNama){
        name = setNama;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }
    public String getDestiny(){
        return destiny;
    }
    public void setDestiny(String tujuan){
        destiny = tujuan;
    }
}
