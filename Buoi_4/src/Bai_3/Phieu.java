package Buoi_4.src.Bai_3;
import java.util.Scanner;
import java.lang.String;
public class Phieu {
    Scanner input = new Scanner(System.in);
    private String maPhieu;
    private Hang[] x;
    private int n;

    public void Nhap(){
        System.out.print("Nhap ma phieu: ");
        maPhieu = input.nextLine();
        System.out.print("Nhap so luong hang: ");
        n = input.nextInt();
        x = new Hang[n];
        for(int i = 0; i < n; ++ i){
            System.out.println("Nhap thong tin mat hang thu " + (i + 1) + ":");
            x[i] = new Hang();
            x[i].Nhap();
        }
    }

    public void Xuat(){
        System.out.println("================================");
        System.out.println("Ma phieu: " + maPhieu);
        for( int i = 0; i < n; ++ i){
            System.out.println("Thong tin mat hang thu " + (i + 1) + ":");
            x[i].Xuat();
        }
    }
}
