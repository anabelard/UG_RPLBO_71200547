package com.ug11.kalkulasirupiah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner teks = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String text = teks.nextLine();

        String[] kata = text.split("\\s+");

        String harga = "";
        String baru = "";


        for(int i = 0; i < kata.length; i++){
            if(Pattern.matches("Rp\\d+\\W\\d+,00", kata[i])){
//                String[] angka = kata[i].split("\\D");
//                for(int j = 0; j < angka.length; j++){
//                    baru+=angka[j];
//                    System.out.println(baru);
//                }
                harga+=kata[i]+" ";
//                System.out.println(kata[i]);
                String[] harga2 = harga.split(" ");


                }
        }

        System.out.println("Rincian biaya: "+harga);
        System.out.println("Total: ");

    }
}
