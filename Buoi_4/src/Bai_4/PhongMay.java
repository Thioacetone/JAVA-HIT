package Buoi_4.src.Bai_4;
import java.util.Scanner;

import java.lang.String;
public class PhongMay {
    Scanner input = new Scanner(System.in);
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    private int n;

    public void Nhap(){
        System.out.print("Nhap ma phong: ");
        maPhong = input.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = input.nextLine();
        System.out.print("Nhap dien tich: ");
        dienTich = input.nextFloat();
        System.out.println("Nhap thong tin quan ly:");
        x.Nhap();
        System.out.print("Nhap so luong may: ");
        n = input.nextInt();
        y = new May[n];
        for(int i = 0; i < n; ++ i){
            y[i] = new May();
            System.out.println("Nhap thong tin may thu " + (i + 1) + ":");
            y[i].Nhap();
        }
    }
    public void Xuat(){
        System.out.println("Ma phong: " + maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich: " + dienTich);
        x.Xuat();
        for(int i = 0; i < n; ++ i){
            System.out.println("Thong tin may thu " + (i + 1) + ":");
            y[i].Xuat();
        }
    }
}
