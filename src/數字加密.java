import java.util.Scanner;

public class 數字加密 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        int v1 = ((str.charAt(0) - '0') + 7) % 10;
        int v2 = ((str.charAt(1) - '0') + 7) % 10;
        int v3 = ((str.charAt(2) - '0') + 7) % 10;
        int v4 = ((str.charAt(3) - '0') + 7) % 10;

        System.out.println(Integer.toString(v3) + Integer.toString(v4) + Integer.toString(v1) + Integer.toString(v2));
    }
}
