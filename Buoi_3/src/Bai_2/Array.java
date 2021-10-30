package Bai_2;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    private int[] a;
    private int n;

    public Array() {
        a = null;
        n = 0;
    }

    public Array(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void InputData(){
        do {
            System.out.print("Enter the element number of Arrays: ");
            n = hi.nextInt();
        } while(n < 0);
        a = new int[n];
        for(int i = 0; i < n; ++ i){
            System.out.print("A[" + i + "]= ");
            a[i] = hi.nextInt();
        }
    }

    public void Show(){
        System.out.println("Arrays = " + Arrays.toString(a));
    }

    public int Sum(){
        int Sum = 0;
        for(int i: a)
            Sum += i;
        return Sum;
    }

    public void Filter(Boolean flag){
        if(flag){
            for(int i: a)
                if(i % 2 == 0)
                    System.out.print(i + " ");
        }
        else{
            for(int i: a)
                if(i % 2 != 0)
                    System.out.print(i + " ");
        }
    }

    Scanner hi = new Scanner(System.in);

}
