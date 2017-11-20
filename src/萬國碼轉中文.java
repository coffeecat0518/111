import java.util.Scanner;

public class 萬國碼轉中文 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);

        String s1=scn.next();
        int v2=Integer.valueOf(s1,16);

        System.out.println((char)v2);

    }
}
