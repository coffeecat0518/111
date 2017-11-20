import java.util.Scanner;

public class 圓柱體體積 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        float r=scn.nextFloat();
        float h=scn.nextFloat();
        double a=Math.PI*r*r*h;

        System.out.println(a);
    }
}
