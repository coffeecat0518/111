import java.util.Scanner;

public class 中文轉萬國碼 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        char c1 = scn.next().charAt(0);

        System.out.println(Integer.toHexString(c1));
    }
}
