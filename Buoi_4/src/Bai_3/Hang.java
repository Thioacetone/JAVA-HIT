package Buoi_4.src.Bai_3;
import java.util.Scanner;
import java.lang.String;

public class Hang {
    Scanner input = new Scanner(System.in);

    private String maHang;
    private String tenHang;
    private float donGia;

    public void Nhap(){
        System.out.print("Nhap ma hang: ");
        maHang = input.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = input.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = input.nextFloat();
    }

    public void Xuat(){
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Don gia: " + donGia);

    }
}
