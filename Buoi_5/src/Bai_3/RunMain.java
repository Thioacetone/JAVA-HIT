package Buoi_5.src.Bai_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        LopHoc a = new LopHoc();
        String spam;
        System.out.print("Nhap ma lop hoc: ");
        spam = input.nextLine();
        a.setMaLH(spam);
        System.out.print("Nhap ten lop hoc: ");
        spam = input.nextLine();
        a.setTenLH(spam);
        System.out.print("Nhap ngay mo: ");
        spam = input.nextLine();
        a.setNgayMo(spam);
        System.out.print("Nhap giao vien: ");
        spam = input.nextLine();
        a.setGiaoVien(spam);
        System.out.print("Nhap so luong sinh vien: ");
        int n = input.nextInt();
        a.setN(n);

        ArrayList<SinhVien> SV = new ArrayList<SinhVien>();
        for(int i = 0; i < n; ++ i){
            input.nextLine();
            System.out.println("Nhap thong tin sinh vien thu " + (i+1) + ":");
            SinhVien sv = new SinhVien();
            sv.Nhap();
            System.out.print("Nhap ma sinh vien: ");
            spam = input.nextLine();
            sv.setMaSV(spam);
            System.out.print("Nhap nganh: ");
            spam = input.nextLine();
            sv.setNganh(spam);
            System.out.print("Nhap khoa hoc: ");
            int k = input.nextInt();
            sv.setKhoaHoc(k);
            SV.add(sv);
        }
        a.setX(SV);
        System.out.println("===============Thong tin vua nhap================");
        System.out.println("Ma lop hoc: " + a.getMaLH());
        System.out.println("Ten lop hoc: " + a.getTenLH());
        System.out.println("Ngay mo: " + a.getNgayMo());
        System.out.println("Giao vien: " + a.getGiaoVien());
        System.out.println("Danh sach sinh vien: ");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Ma SV", 
                        "Nganh", "Khoa Hoc", "Ho Ten", "Ngay Sinh", "Que Quan");
        for(SinhVien i: a.getX()){
            System.out.printf("%-15s %-15s %-15d ", i.getMaSV(), i.getNganh(), i.getKhoaHoc());
            i.Xuat();
        }
        System.out.println("");
        K15(a);

        Sort(a);
        System.out.println("Danh sanh lop hoc da sap xep:");
        System.out.println("Ma lop hoc: " + a.getMaLH());
        System.out.println("Ten lop hoc: " + a.getTenLH());
        System.out.println("Ngay mo: " + a.getNgayMo());
        System.out.println("Giao vien: " + a.getGiaoVien());
        System.out.println("Danh sach sinh vien: ");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Ma SV", 
                        "Nganh", "Khoa Hoc", "Ho Ten", "Ngay Sinh", "Que Quan");
        for(SinhVien i: a.getX()){
            System.out.printf("%-15s %-15s %-15d ", i.getMaSV(), i.getNganh(), i.getKhoaHoc());
            i.Xuat();
        }
        System.out.println("");
    }

    static void K15(LopHoc a){
        int all = 0;
        for(SinhVien i: a.getX()){
            if(i.getKhoaHoc() == 15)
                ++all;
        }
        if(all == 0){
            System.out.println("Kong co ban sinh vien nao khoa 15!");
        }
        else
            System.out.println("So ban sinh vien hoc khoa 15 la: " + all);
    }

    static void Sort(LopHoc a){
        for(int i = 0; i < a.getN(); ++ i){
            for(int j = i + 1; j < a.getN(); ++ j){
                if(a.getX().get(i).getKhoaHoc() > a.getX().get(j).getKhoaHoc()){
                    Collections.swap(a.getX(), i, j);
                }
            }
        }
    }
}
