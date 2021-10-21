package buoi_2;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;
public class bai_2 {
    static void Menu(){
        System.out.println("1. Tao va nhap mang voi n so nguyen.");
        System.out.println("2. Hien thi mang vua tao.");
        System.out.println("3. Them 1 phan tu vao vi tri k bat ki.");
        System.out.println("4. Xoa 1 phan tu tai vi tri k bat ki.");
        System.out.println("5. Dao nguoc mang");
        System.out.println("6. Hien thi phan tu a[1] va cac so chia het cho a[1].");
        System.out.println("7. Xuat ra man hinh tong cac so nguyen to trong mang.");
        System.out.println("8. Thoat.");
        System.out.println("Nhap lua chon: ");
    }

    public static void main(String[] args) {
        Scanner Hi = new Scanner(System.in);
        int n = 0, k, select = -1, x;
        int[] a = new int[n];
        while(select != 8){
            Menu();
            select = Hi.nextInt();
            switch(select){
                case 1:
                    System.out.print("Nhap so phan tu cua mang: ");
                    n = Hi.nextInt();
                    a = Nhap(a, n);
                    Bam();
                    break;
                case 2:
                    HienThi(a);
                    Bam();
                    break;
                case 3:
                    ++ n;
                    System.out.print("Nhap vi tri muon chen: ");
                    k = Hi.nextInt();
                    System.out.print("Nhap phan tu muon chen: ");
                    x = Hi.nextInt();
                    a = ThemPhanTu(a, n, k, x);
                    Bam();
                    break;
                case 4:
                    -- n;
                    System.out.print("Nhap vi tri can xoa: ");
                    k = Hi.nextInt();
                    a = remove(a, n, k);
                    Bam();
                    break;
                case 5:
                    a = reverse(a);
                    System.out.println("Finish!");
                    break;
                case 6:
                    DivMod(a, n);
                    Bam();
                    break;
                case 7:
                    System.out.println("Tong cac so nguyen to co trong mang la: " + TongNT(a));
                    Bam();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Nhap lai di ma!!!");
                    Bam();
            }
        }
    }
    static int [] Nhap(int[] a, int n){
        Scanner Hi = new Scanner(System.in);
        a = new int[n];
        for(int i = 0; i < n; ++ i){
            System.out.print("a[" + i + "]= ");
            a[i] = Hi.nextInt();
        }
        System.out.println("Finish!");
        return a;
    }

    static void HienThi(int[] a){
        System.out.println("Mang vua tao la: \n" + Arrays.toString(a));
    }

    static int [] ThemPhanTu(int[] a, int n, int k, int element){
        int[] x = new int[n];
        if(k > n || k < 0) {
            System.out.println("Vi tri khong hop le!");
            return a;
        }
        else{
            for(int i = 0; i < n; ++ i){
                if(i < k - 1)
                    x[i] = a[i];
                else if(i == k - 1)
                    x[i] = element;
                else
                    x[i] = a[i - 1];
            }
        }
        return x;
    }

    static int [] remove(int [] a, int n, int k){
        if(k < 0 || k > n){
            System.out.println("Vi tri khong hop le!");
            return a;
        }
        int[] x = new int[n];
        for(int i = 0; i < n; ++ i){
            if(i < k - 1)
                x[i] = a[i];
            else
                x[i] = a[i + 1];
        }
        return x;
    }

    static int [] reverse(int [] a){
        for(int i = 0; i < a.length / 2; ++ i){
            int x = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = x;
        }
        return a;
    }

    static void DivMod(int [] a, int n){
        if(n < 2){
            System.out.println("Da nhap gi dau ma!!!");
            return;
        }
        System.out.println("Phan tu a[1] = " + a[1]);
        System.out.println("Cac phan tu chia het cho a[1] la:");
        for (int i: a) {
            if(i % a[1] == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }

    static boolean NguyenTo(int x){
        if(x < 2)
            return false;
        for(int i = 2; i * i <= x; ++ i){
            if(x % i == 0)
                return false;
        }
        return true;
    }

    static int TongNT(int [] a){
        int sum = 0;
        for(int i : a){
            if(NguyenTo(i) == true)
                sum += i;
        }
        return sum;
    }

    static void Bam(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
