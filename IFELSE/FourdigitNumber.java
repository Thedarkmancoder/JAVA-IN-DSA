/*
Take positive integer input and tell if it is a 
four digit number or not.
*/

import java.util.Scanner;
public class FourdigitNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        if (num>999 && num<10000 ) {
            System.out.println("It's a Four Digit Number :");
        }else
            System.out.println("Not a Four Digit Number : ");
       
        
    }
}
