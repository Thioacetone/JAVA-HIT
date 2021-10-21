package buoi_2;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;
import java.lang.Character;
public class bai_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = input.nextLine();
        int d = 0, sum = 0;
        for(int i = 0; i < s.length(); ++ i){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                ++ d;
                sum += Character.getNumericValue(s.charAt(i));
            }
        }
        if(d == 0)
            System.out.println("False");
        else {
            System.out.println("True");
            System.out.println("Average = " + (float) sum / d);
        }
    }
}
