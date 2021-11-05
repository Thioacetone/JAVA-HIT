package Buoi_4.src.Bai_4;
import java.util.Scanner;
import java.lang.String;
public class QuanLy {
    Scanner input = new Scanner(System.in);
    private String maQL;
    private String hoTen;

    public void Nhap(){
        System.out.print("Nhap ma quan ly: ");
        maQL = input.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
    }
    public void Xuat(){
        System.out.println("Ma quan ly: " + maQL);
        System.out.println("Ho ten: " + hoTen);
    }
}
