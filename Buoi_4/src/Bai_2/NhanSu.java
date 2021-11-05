package Buoi_4.src.Bai_2;

import java.lang.String;
import java.util.Scanner;

public class NhanSu {
    Scanner input = new Scanner(System.in);
    private String maNhanSu;
    private String tenNhanSu;
    private Date NS = new Date();
    public void Nhap(){
        System.out.print("Nhap ma nhan su: ");
        maNhanSu = input.nextLine();
        System.out.print("Nhap ten nhan su: ");
        tenNhanSu = input.nextLine();
        System.out.println("Nhap ngay sinh: ");
        NS.Nhap();
    }
    public void Xuat(){
        System.out.println("Ma nhan su: " + maNhanSu);
        System.out.println("Ten nhan su: " + tenNhanSu);
        NS.Xuat();
    }
}
