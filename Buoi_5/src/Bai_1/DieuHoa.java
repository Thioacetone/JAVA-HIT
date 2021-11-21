package Buoi_5.src.Bai_1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private int congSuat;
    private float giaBan;
    Scanner input = new Scanner(System.in);
    @Override
    public void Nhap(){
        super.Nhap();
        System.out.print("Nhap cong suat: ");
        congSuat = input.nextInt();
        System.out.print("Nhap gia ban: ");
        giaBan = input.nextFloat();
    }

    @Override
    public void Xuat(){
        super.Xuat();
        System.out.printf(" %-15d %-15f\n", congSuat, giaBan);
    }

    public DieuHoa(){
    }

    public DieuHoa(int congSuat, float giaBan, Scanner input) {
        this.congSuat = congSuat;
        this.giaBan = giaBan;
        this.input = input;
    }

    public DieuHoa(String maSP, String tenSP, String hsx, String ngayNhap, Scanner input, int congSuat, float giaBan,
            Scanner input2) {
        super(maSP, tenSP, hsx, ngayNhap, input);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
        input = input2;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
}
