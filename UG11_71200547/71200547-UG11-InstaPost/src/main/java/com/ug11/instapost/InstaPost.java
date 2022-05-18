package com.ug11.instapost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(){

    }

    public void printInfo(){
        System.out.println("Username: "+this.username);
        System.out.println("Email: "+this.email);
        System.out.println("Total Mention: "+this.totalMention);
    }

    public void login(String email){
        if(Pattern.matches("\\w+@gmail.com", email)){
            String name = email.substring(0,email.indexOf("@"));
            this.username = name.toUpperCase();
            this.email = email;
            System.out.println("Login berhasil!");
        }
        else{

            if(!email.contains("@")){
                try {
                    throw new EmailException(1);
                }
                catch (EmailException e){
                    System.out.println(e.getErrorMessage());
                }
            }
            else{
                if(!email.contains("@gmail.com")){
                    try {
                        throw new EmailException(2);
                    }
                    catch (EmailException e){
                        System.out.println(e.getErrorMessage());
                    }
                }
            }
        }
    }

    public void post(String caption){
        String[] kata = caption.split("[\\s,]+");

        int count = 0;
        String mention = "";
        for(int i = 0; i < kata.length; i++) {
            if (Pattern.matches("@\\w+", kata[i])) {
                mention+=kata[i]+" ";
                count+=1;
                this.totalMention+=1;
            }
        }


        System.out.println("Caption: "+caption);
        System.out.println("Pengguna yang anda mention: "+mention);
        System.out.println("Total username yang anda mention: "+count);


    }
}
