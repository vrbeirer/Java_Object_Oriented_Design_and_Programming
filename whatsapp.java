import java.util.Scanner;

public class whatsapp {
    String phone_number;
    String otp;

    void user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter phone number:");
        phone_number = sc.nextLine();
        System.out.println("Enter OTP:");
        otp = sc.nextLine();
    }

    void open_app() {
        while (true) {
            if (phone_number.equals("8905516440") && otp.equals("1234")) {
                System.out.println("WhatsApp is opened!");
                break;
            } else {
                System.out.println("Invalid phone number or OTP. Try again.");
                user_input();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to WhatsApp!");
        whatsapp app = new whatsapp();
        app.user_input();
        app.open_app();
    }
}
