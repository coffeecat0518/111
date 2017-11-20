import java.util.Scanner;

public class 兩數計算 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);

    int a=scn.nextInt();
    int b=scn.nextInt();
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a/b;

    System.out.println(a+"+"+b+"="+c);
    System.out.println(a+"-"+b+"="+d);
    System.out.println(a+"*"+b+"="+e);
    System.out.println(a+"/"+b+"="+f+"..."+(a%b));
    }
    }
