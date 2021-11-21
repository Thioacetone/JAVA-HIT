package Buoi_5.src.Bai_2;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private int soLuong;
    private float donGia;
    Scanner input = new Scanner(System.in);
    public void InputSP(){
        System.out.print("Nhap ma san pham: ");
        maSP = input.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSP = input.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = input.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = input.nextFloat();
    }

    public void OutputSP(){
        System.out.printf("%-15s %-15s %-15d %-15f ", maSP, tenSP, soLuong, donGia);
    }
    public float ThanhTien(){
        return soLuong*donGia;
    }
}
