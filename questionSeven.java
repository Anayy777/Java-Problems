import java.util.Scanner;

public class questionSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A CHARACTER");
        String alpha = sc.next();
        if(alpha.charAt(0) == 'a' || alpha.charAt(0) == 'e' || alpha.charAt(0) == 'i' || alpha.charAt(0) == 'o' || alpha.charAt(0) == 'u'){System.out.println("its a vowel");}
        else{
            System.out.println("its not a vowel");
        }


    }
}
