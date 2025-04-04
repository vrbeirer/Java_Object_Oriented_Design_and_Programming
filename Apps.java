import java.sql.SQLOutput;
import java.util.Scanner;

abstract class software{

    String user_name;
    String password;

    void user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username:-");
        user_name = sc.nextLine();
        System.out.println("Enter password:-");
        password = sc.nextLine();
    }

    void user_login(){

        System.out.println("Welcome to instagram");
        System.out.println("-------------------------");
        System.out.println("Please login here");

    }


    abstract void open_app();


}

class instagram extends software{
    @Override
    void open_app() {
        while(true){

            if(user_name.equals("Abbasali") && password.equals("2480")) {
            System.out.println("App is opened");
            break;

        }else{

            System.out.println("The username or password is invalid");
            System.out.println("Please try again");
                System.out.println("-----------------------------");
            user_input();

        }



        }







    }




}


public class Apps {

    public static void main(String[] args) {
        instagram i = new instagram();
        i.user_login();
        i.user_input();
        i.open_app();

    }




}
