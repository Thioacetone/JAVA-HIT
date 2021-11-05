package Buoi_4.src.Bai_1;

import java.lang.String;

import java.util.Scanner;


public class Sach {
    Scanner input = new Scanner(System.in);
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private float giaTien;
    public void Nhap(){
        System.out.print("Nhap ma sach: ");
        maSach = input.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = input.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nxb = input.nextLine();
        System.out.print("Nhap so trang: ");
        soTrang = input.nextInt();
        System.out.print("Nhap gia tien: ");
        giaTien = input.nextFloat();
    }
    public void Xuat(){
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nha xuat ban: " + nxb);
        System.out.println("So trang: " + soTrang);
        System.out.println("Gia tien: " + giaTien);
    }
}
