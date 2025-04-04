import java.util.Scanner;

public class bitwise_sum {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four digit number:-");
        int a = sc.nextInt();
        int s=0;
        s+=a%10;
        a=a/10;
        s+=a%10;
        a=a/10;
        s+=a%10;
        System.out.println(s);





    }


}
