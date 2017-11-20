import java.util.Scanner;

public class 公斤轉台斤 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        float g=scn.nextFloat();
        float a=Math.round((g/600f)*10)/10f;
        System.out.println(a);
    }
}
