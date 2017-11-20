import java.util.Scanner;

public class 公升轉公侖 {
    public static void main (String[] args){
        Scanner scn=new Scanner(System.in);

        float l=scn.nextFloat();
        float a=Math.round((l*0.26418)*10)/10f;
        System.out.println(a);
    }
}
