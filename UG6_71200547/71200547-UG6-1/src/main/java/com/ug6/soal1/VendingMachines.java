package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList acceptanceBalance;
    private double consumerMoney;

    public VendingMachines(){

    }

    public VendingMachines(String code, int capacity){
        this.code=code;
        this.capacity=capacity;
    }

    public VendingMachines(String code, int capacity, Goods goods, double[] acceptanceBalance){
        this.code=code;
        this.capacity=capacity;


    }

    public void proceedOrder(String goodsCode, int orderQuantity){

    }

    public void takeMoney(double money){
        this.consumerMoney=money;
    }

    public void giveGood(double goodsPrice, String goodsName){

    }

    public double withdrawMoney(){
        double x = consumerMoney;
        consumerMoney = 0;
        return x;
    }

    public void inputGoods(Goods good){

    }


}
