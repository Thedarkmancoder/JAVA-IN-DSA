/*
Take positive integer input and print:
NITISH if number is divible by 5
KUMAR if number is divible by 3
SHARMA if number is divible by 5 & 3 both
SHARMAJEE if number is not divible by 5 or 3.
*/
import java.util.Scanner;
public class specialQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (num%5==0 && num%3==0) {
            System.out.println("NITISH ");
        }else if(num%3 !=0 && num%5 !=0 ) {
            System.out.println("KUMAR ");
        }else if (num%5==0) {
            System.out.println(" SHARMA ");
        }else 
            System.out.println("SHARMAJEE ");
    }
}
