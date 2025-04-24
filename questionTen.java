import java.util.Scanner;

public class questionTen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.
        in);
        System.out.print("ENTER NUMBER : ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("NUMBER IS POSITIVE");
        }
        else{
            System.out.println("NUMBER IS NOT POSITIVE I.E ITS NEGATIVE");
        }
    }    
}