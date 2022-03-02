package com.ug4.soal1;

import sun.font.TrueTypeFont;

import java.util.ArrayList;

public class Bus {
    String name;
    Driver driver;
    int capacity = 25;
    ArrayList<Passenger> passenger;
    int usedCapacity;
    double fares;
    double profit;
    String[] route = {"Kampus UKDW", "Asrama Omah Babadan", "Asrama Teoloogi"};


    public String getName(){
        return name;
    }
    public void setName(String passengerName){
        name = passengerName;
    }
    public Driver getDriver(){
        return driver;
    }
    public void setDriver(Driver newDriver){
        driver = newDriver;
    }
    public int getCapacity(){
        return capacity;
    }
    public ArrayList<Passenger> getPassenger(){
        return passenger;
    }
    public int getUsedCapacity(){
        return usedCapacity;
    }
    public void setUsedCapacity(int setCapacity){
        usedCapacity = setCapacity;
    }
    public double getFares(){
        return fares;
    }
    public double getProfit(){
        return profit;
    }
    public String[] getRoute(){
        return route;
    }
    public void setProfit(double newProfit){
        profit = newProfit;
    }
    public boolean checkPassengerBalance(Passenger namaPenumpang){
        if(namaPenumpang.balance<fares){
            topUpBalance();
        }
        else if(namaPenumpang.balance>=fares){
            proceedOrder();
        }
    }
    public void topUpBalance(double nominal, Passenger namaPenumpang){
        double x = namaPenumpang.getBalance();
        namaPenumpang.setBalance(x+nominal);
    }
    public void takePassenger(Passenger namaPenumpang){

    }
    public void dropPassengers(Passenger namaPenumpang){

    }
    public void proceedOrder(String pOrder, Passenger namaPenumpang){
        namaPenumpang.setDestiny(pOrder);
        namaPenumpang.setBalance(namaPenumpang.balance-fares);
    }
    public String cancelOrder(Passenger cancel){

    }
}
