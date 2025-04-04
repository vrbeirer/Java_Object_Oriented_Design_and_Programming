import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        int bill;
        if(unit<=200){

            bill=(int)(unit*0.5);



        }else if (unit<=400){

            bill=(int)(unit*0.65)+100;



        } else if (unit<=600) {

            bill=(int)(unit*0.80)+200;



        }else {

            bill=(int)(unit*1.25)+425;

        }

        System.out.println("your bill is "+(int)bill);


    }


}
