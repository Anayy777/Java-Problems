
import java.util.Scanner;

public class questionTwelve {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int n1 = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int n2 = sc.nextInt();
        System.out.println("ENTER THIRD NUMBER : ");
        int n3 = sc.nextInt();

        if(n1 < n2 && n1 < n3){
            System.out.println("THE FIRST NUMBER IS THE SMALLEST");
        }
        else if(n2 < n1 && n2 < n3){
            System.out.println("THE SECOND NUMBER IS THE SMALLEST");
        }
        else{
            System.out.println("THE THIRD NUMBER IS THE SMALLEST");
        }

        sc.close();
    }
}
