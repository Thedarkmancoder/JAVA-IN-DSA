
// Take real number input and check it it is an integer or not.
import java.util.Scanner;
public class Integer0rNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        double num = sc.nextDouble();
        int x = (int)num;
        if (num-x == 0) {
                    System.out.println(" Is an Integer ");
        }else
            System.out.println(" Not An Integer ");
    }
}
// output Enter the Number : 78 // Is an Integer
//        Enter the Number : 55.879 // Not an Integer
