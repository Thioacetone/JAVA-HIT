////////////////////////////////////////////////////////////////////////////
///////////// Code tâm linh, đức phật phù hộ code không bug ////////////////
//                                   _
//                                 oo0oo
//                               o8888888o
//                               88” . “88
//                               (| - - |)
//                               O\  =  /O
//                             ___/'---'\___
//                          .'  \\|     |// '.
//                         /  \\|||  :  |||//  \
//                        /   ||||| -:- |||||   \
//                        |   | \\\  -  /'| |   |
//                        | \_|  `\`---'//  |_/ |
//                        \  .-\__ `-. -'__/-.  /
//                      ___. .'  /--.--\  . . '___
//                   ."" '<  `.___\_<|>_/___.'  _> \"".
//                  | | :  - \. ;`. _/; .'/  /  .' ; |
//                  \  \ -.   \_\_. _.' _/_/  -' _.' /
//===================`-.`___`-.__\ \___   /__.-'.'.-'===================//
//                              Thioacetone

package Buoi_4.src.Bai_1;
import java.util.Scanner;

public class main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so luong sach: ");
        n = input.nextInt();
        Sach[] A = new Sach[n];
        for(int i = 0; i < n; ++ i){
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            A[i] = new Sach();
            A[i].Nhap();
        }
        for(int i = 0; i < n; ++ i){
            System.out.println("Thong tin sach thu " + (i + 1) + ":");
            A[i].Xuat();
        }
    }
}
