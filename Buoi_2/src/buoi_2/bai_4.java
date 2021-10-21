package buoi_2;
import java.util.Scanner;
public class bai_4 {
    static Scanner hi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("S = ");
        String s = hi.nextLine();
        s = s.replaceAll("[0-9]", "");
        s = s.replaceAll(" +", " ");
        s = s.trim();
        System.out.println(chuanHoa(s));
    }
    static String chuanHoa(String str) {
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }
}
