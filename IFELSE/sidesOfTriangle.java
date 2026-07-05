/*
Take 3 positive integers input and tell if
 they can be the sides of a triangle or not.
*/
import java.util.Scanner;
public class sidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First side : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second side : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third side : ");
        int num3 = sc.nextInt();
        if (num1 + num2 > num3 && num2 + num3 >num1 && num3+num1>num2) {
        System.out.println("It's a Triangle ");            
        }else
            System.out.println("Not a Triangle ");
    }
}
