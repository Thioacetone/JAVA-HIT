package buoi_2;
import java.lang.Math;
import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        Scanner Hi = new Scanner(System.in);
        System.out.print("Enter the value of first element: ");
        int a = Hi.nextInt();
        System.out.print("Enter the value of second element: ");
        int b = Hi.nextInt();
        System.out.print("Enter the value of third element: ");
        int c = Hi.nextInt();
        System.out.print("Max of three elements is " + Math.max(Math.max(a, b), c));
    }
}
