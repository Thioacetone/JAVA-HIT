package Buoi_5.src.Bai_2;

import java.util.Scanner;

public class DateTime {
    private int ngay;
    private int thang;
    private int nam;
    Scanner input = new Scanner(System.in);
    public void InputDate(){
        System.out.print("Nhap ngay: ");
        ngay = input.nextInt();
        System.out.print("Nhap thang: ");
        thang = input.nextInt();
        System.out.print("Nhap nam: ");
        nam = input.nextInt();
    }
    public void OutputDate(){
        System.out.printf("%d/ %d/ %d\n", ngay, thang, nam);
    }
}
