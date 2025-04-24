import java.util.Scanner;
import java.lang.Math;

// Write a program to input a number and print it's absolute value.
public class questionSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num = sc.nextInt();
        System.out.println();
        int absolute = Math.abs(num);
        System.out.println("ABSOLUTE VALUE : " + absolute);
    
    }
}
