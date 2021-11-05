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

package Buoi_4.src.Bai_4;
import java.util.Scanner;
import java.lang.String;

public class May {
    Scanner input = new Scanner(System.in);
    private String maMay;
    private String kieuMay;
    private String tinhTrang;
    public void Nhap(){
        System.out.print("Nhap ma may: ");
        maMay = input.nextLine();
        System.out.print("Nhap kieu may: ");
        kieuMay = input.nextLine();
        System.out.print("Nhap tinh trang: ");
        tinhTrang = input.nextLine();
    }

    public void Xuat(){
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang: " +tinhTrang);
    }
}
