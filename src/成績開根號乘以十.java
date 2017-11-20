import java.util.Scanner;

public class 成績開根號乘以十 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int a = (int) Math.round(Math.sqrt(x) * 10);

        System.out.println(a);
    }
}
