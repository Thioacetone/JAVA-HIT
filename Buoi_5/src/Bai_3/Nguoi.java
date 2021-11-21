package Buoi_5.src.Bai_3;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String ngaySinh;
    private String queQuan;

    Scanner input = new Scanner(System.in);

    public void Nhap(){
        System.out.print("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.print("Nhap ngay sinh: ");
        ngaySinh = input.nextLine();
        System.out.print("Nhap que quan: ");
        queQuan = input.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-15s %-15s %-15s\n", hoTen, ngaySinh, queQuan);
    }
}
