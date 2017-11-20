import java.util.Scanner;

public class 取字元ASCII碼 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

    char ch=scn.next().charAt(0);
    System.out.println((int) ch);
    }
}
