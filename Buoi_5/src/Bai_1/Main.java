package Buoi_5.src.Bai_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Nhap so luong dieu hoa: ");
        n = input.nextInt();
        List<DieuHoa> A = new ArrayList<>();
        for(int i = 0; i < n; i++){
            DieuHoa x = new DieuHoa();
            x.Nhap();
            A.add(x);
        }
        Electrolux(A);
        MinCost(A);
    }
    static void Electrolux(List<DieuHoa> a){
        System.out.println("Danh sach cac san pham cua hang Electrolux:");
        int check = 0;
        for(DieuHoa i: a){
            if(i.getHsx().equals("Electrolux")){
                ++check;
            }
        }
        if(check != 0){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Ten SP", "Ma SP", "HSX", "Ngay Nhap", "Cong Suat", "Gia Ban");
            for(DieuHoa i: a){
                if(i.getHsx().equals("Electrolux"))
                    i.Xuat();
            }
        }
        else{
            System.out.println("Khong co san pham nao cua hang Electrolux!");
        }
    }

    static void MinCost(List<DieuHoa> a){
        System.out.println("Danh sach cac san pham co gia ban nho nhat: ");
        float Min = a.get(0).getGiaBan();
        for(DieuHoa i : a){
            Min = Math.min(Min, i.getGiaBan());
        }
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Ten SP", "Ma SP", "HSX", "Ngay Nhap", "Cong Suat", "Gia Ban");
        for(DieuHoa i: a){
            if(i.getGiaBan() == Min){
                i.Xuat();
            }
        }
    }
}