package Buoi_5.src.Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private String tenPhieu;
    private DateTime a;
    ArrayList<SanPham> x = new ArrayList<SanPham>();
    private int n;
    Scanner input = new Scanner(System.in);
    public void InputPhieu(){
        System.out.print("Nhap ma phieu: ");
        maPhieu = input.nextLine();
        System.out.print("Nhap ten phieu: ");
        tenPhieu = input.nextLine();
        a = new DateTime();
        a.InputDate();
        System.out.print("Nhap so luong san pham: ");
        n = input.nextInt();
        for(int i = 0; i < n; i++){
            SanPham b = new SanPham();
            System.out.printf("Nhap thong tin san pham thu %d: \n", i+1);
            b.InputSP();
            x.add(b);
        }
    }
    public void OutputPhieu(){
        System.out.println("Ma phieu: " + maPhieu);
        System.out.println("Ten phieu: " + tenPhieu);
        System.out.print("Ngay: ");
        a.OutputDate();
        System.out.println("");
        System.out.println("Danh sach san pham: ");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Ma SP", "Ten SP", "So Luong", "Don Gia", "Thanh Tien");
        for(SanPham i : x){
            i.OutputSP();
            System.out.printf("%-15f\n", i.ThanhTien());
        }
    }
}
