package UG10_71200547;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Selamat datang di Toko Anabela");
        System.out.println("Silahkan daftarkan diri anda untuk dapat mengakses menu di Toko Anabela");
        System.out.println();


        Scanner inputUsername = new Scanner(System.in);
        System.out.print("Username : ");
        String username = inputUsername.nextLine();

        try{
            throw new UsernameException(username.length());
        }
        catch (UsernameException e){
            System.out.println(e.getErrorMessage());
        }


        Scanner inputEmail = new Scanner(System.in);
        System.out.print("Email : ");
        String email = inputEmail.nextLine();

        try{
            throw new EmailException(email);
        }
        catch (EmailException e){
            System.out.println(e.getErrorMessage());
        }


        Scanner inputPassword = new Scanner(System.in);
        System.out.print("Password : ");
        String password = inputPassword.nextLine();

        String confirmPassword="";

        try{
            throw new PasswordException(username, password, confirmPassword);
        }
        catch (PasswordException e){
            System.out.println(e.getErrorMessage());
        }

        Scanner inputKonfirmasiPassword = new Scanner(System.in);
        System.out.print("Konfirmasi Password : ");
        String confirmationPassword = inputKonfirmasiPassword.nextLine();

        try{
            throw new PasswordException(username, password, confirmationPassword);
        }
        catch (PasswordException e){
            System.out.println(e.getErrorMessage());
        }



        User user = new User(username, email, password);


        System.out.println("Akun anda berhasil didaftarkan!");
        System.out.println("Silahkan login untuk melanjutkan.");
        Scanner loginUsername = new Scanner(System.in);
        System.out.print("Username : ");
        String loginusername = inputUsername.nextLine();
        Scanner loginPassword = new Scanner(System.in);
        System.out.print("Password : ");
        String loginpassword = inputUsername.nextLine();


        try {
            throw new LoginException(user, loginusername, loginpassword);
        }
        catch (LoginException e){
            System.out.println(e.getErrorMessage());
        }

    }
}
