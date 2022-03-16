package com.ug6.soal1;

public class Codes {

    private final static String GOODSCODES = "GD";
    private final static String VENDINGMACHINESCODE = "VM";
    private final static String[] TYPE = {"DR", "FD", "DG"};

    public String generateGoodsCode(String type, String name){
        String id = GOODSCODES + type + name.charAt(0) + name.charAt(name.length()-1);
        return id;
    }

    public String generateVendingMachinesCode(int order){
        String id = VENDINGMACHINESCODE + order;
        return id;
    }


}
