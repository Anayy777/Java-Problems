import java.util.Scanner;

public class questionNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SYMBOL : ");
        String symbol = sc.next();


// since symbol are single characters

        if (symbol.length() == 1 && Character.isLetter(symbol.charAt(0))) {
            System.out.println(symbol + " is an alphabet.");}
        else if (Character.isDigit(symbol.charAt(0))) {
            System.out.println(symbol + " is a digit.");
        } else{
            System.out.println(symbol + " is a special symbol.");
        }

    }
}

