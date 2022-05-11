package UG10_71200547;

import jdk.jpackage.internal.Log;

import java.util.Objects;

public class LoginException extends Exception {
    private String errorMessage;

    public LoginException(User user, String username, String password){
        super();
        if(Objects.equals(username, null)){
            this.errorMessage="Error! Username tidak boleh kosong";
        }
        else if(Objects.equals(password, null)){
            this.errorMessage="Error! Password tidak boleh kosong";
        }
        if(!Objects.equals(user.getUsername(), username) || !Objects.equals(user.getPassword(), password)){
            this.errorMessage="Error! Username atau password tidak sesuai!";
        }

    }

    public String getErrorMessage(){
        return this.errorMessage;
    }


}
