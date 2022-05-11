package UG10_71200547;

public class UsernameException extends Exception {
    private final String errorMessage;

    public UsernameException(int usernameLength){
        super();
        if(usernameLength<=0){
            this.errorMessage="Error! Username tidak boleh kosong!";
        }
        else if(usernameLength<6){
            this.errorMessage="Error! Username harus terdiri dari minimal 6 karakter!";
        }
        else{
            this.errorMessage="";
        }
    }

    public String getErrorMessage(){
        return this.errorMessage;
    }


}
