package Buoi_4.src.Bai_2;

import java.util.Scanner;

public class Date {
    Scanner input = new Scanner(System.in);
    private int D;
    private int M;
    private int Y;
    public void Nhap(){
        System.out.print("Nhap ngay: ");
        D = input.nextInt();
        System.out.print("Nhap thang: ");
        M = input.nextInt();
        System.out.print("Nhap nam: ");
        Y = input.nextInt();
    }
    public void Xuat(){
        System.out.println("Ngay: " + D + "/" + M + "/" + Y);
    }
}
