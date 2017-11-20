import java.util.Scanner;

public class 字元置換 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        char c1 = scn.next().charAt(0);
        char c2 = scn.next().charAt(0);
        String a = s.replace(c1, c2);

        System.out.println(a);
    }
}
