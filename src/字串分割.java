import java.util.Scanner;

public class 字串分割 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        String a = scn.next();
        char symbol = scn.next().charAt(0);
        String b = a.replace(symbol, '\n');

        System.out.println(b);
    }
}
