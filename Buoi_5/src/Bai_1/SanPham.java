package Buoi_5.src.Bai_1;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private String hsx;
    private String ngayNhap;

    Scanner input = new Scanner(System.in);
    public void Nhap(){
        System.out.print("Nhap ma san pham: ");
        maSP = input.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSP = input.nextLine();
        System.out.print("Nhap hang san xuat: ");
        hsx = input.nextLine();
        System.out.print("Nhap ngay nhap: ");
        ngayNhap = input.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-15s %-15s %-15s %-15s", maSP, tenSP, hsx, ngayNhap);
    }
    public SanPham() {
    }
    public SanPham(String maSP, String tenSP, String hsx, String ngayNhap, Scanner input) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.hsx = hsx;
        this.ngayNhap = ngayNhap;
        this.input = input;
    }
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public String getHsx() {
        return hsx;
    }
    public void setHsx(String hsx) {
        this.hsx = hsx;
    }
    public String getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public Scanner getInput() {
        return input;
    }
    public void setInput(Scanner input) {
        this.input = input;
    }
}
