package UG10_71200547;

public class EmailException extends Exception {
    private final String errorMessage;


    public EmailException(String email){
        super();
        if(email.length()<=0){
            this.errorMessage="Error! Email tidak boleh kosong!";
        }
        else if(!email.contains("@") && !email.contains(".")){
            this.errorMessage="Error! Format email salah";
        }
        else if(!email.contains("@")){
            this.errorMessage="Error! Format email salah";
        }
        else if(!email.contains(".")){
            this.errorMessage="Error! Format email salah";
        }
        else{
            this.errorMessage="";
        }
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }

}
