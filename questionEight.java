import java.util.Scanner;

public class questionEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SYMBOL : ");
        String symbol = sc.next();

        if (symbol.length() == 1 && Character.isLetter(symbol.charAt(0))) {
            System.out.println(symbol + " is an alphabet.");
        } else {
            System.out.println(symbol + " is not an alphabet.");
        }

    }
}
