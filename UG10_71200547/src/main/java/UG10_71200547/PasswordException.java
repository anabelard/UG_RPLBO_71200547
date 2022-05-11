package UG10_71200547;

import java.util.Objects;

public class PasswordException extends Exception {
    private String errorMessage;

    public PasswordException(String username, String password, String confirmPassword){
        super();
        if(password.length()<=0){
            this.errorMessage="Error! Password tidak boleh kosong!";
        }
        else if(password.length()<7){
            this.errorMessage="Error! Password harus terdiri dari minimal 7 karakter!";
        }
        else if(Objects.equals(username, password)){
            this.errorMessage="Error! Password tidak boleh sama dengan username!";
        }
        else if(!Objects.equals(confirmPassword, "")){
            if(!Objects.equals(confirmPassword, password)){
                this.errorMessage="Error! Konfirmasi password harus sama dengan password!";
            }
            else{
                this.errorMessage="";
            }
        }
        else{
            boolean capitalFlag = false;
            boolean lowerCaseFlag = false;
            boolean numberFlag = false;
            for(int i=0;i<password.length();i++) {
                char c = password.charAt(i);
                if( Character.isDigit(c)) {
                    numberFlag = true;
                }
                else if (Character.isUpperCase(c)) {
                    capitalFlag = true;
                } else if (Character.isLowerCase(c)) {
                    lowerCaseFlag = true;
                }
                if(!(numberFlag && capitalFlag && lowerCaseFlag)){
                    this.errorMessage="Error! Password minimal harus mengandung 1 karakter huruf kecil, huruf besar, simbol, dan angka";
                }

            }
        }
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }


}
